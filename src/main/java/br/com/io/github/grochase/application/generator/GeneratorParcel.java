package br.com.io.github.grochase.application.generator;

import br.com.io.github.grochase.application.generator.model.GeneratedParcel;
import br.com.io.github.grochase.application.helper.FormatDateUtils;
import br.com.io.github.grochase.application.model.ListParcel;
import br.com.io.github.grochase.application.model.SimulationData;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
@Log4j2
public class GeneratorParcel {

    private static final String SIMULATOR_PARCEL = "Simulator parcel";
    private static final int DEFAULT_DAYS = 30;
    public static final String SEPARATOR = "/";
    public static final String FORMAT_DEFAULT_TWO = "%02d";

    public ListParcel generate(SimulationData simulationData) {
        return ListParcel.builder()
                .parcels(getListParcel(simulationData))
                .build();
    }

    private List<GeneratedParcel> getListParcel(SimulationData simulationData) {
        int quantityParcel = simulationData.getQuantityParcel();
        int intervalDays = simulationData.getIntervalDays() != 0 ? simulationData.getIntervalDays() : DEFAULT_DAYS;

        BigDecimal valueParcel = simulationData.getValueTotal()
                .divide(new BigDecimal(quantityParcel), 2, RoundingMode.DOWN);

        BigDecimal dif = valueParcel.multiply(new BigDecimal(quantityParcel))
                .subtract(simulationData.getValueTotal()).negate();

        int plusDays = intervalDays;
        List<GeneratedParcel> list = new ArrayList<>();

        for(int i = 1; i < quantityParcel + 1; i++){
            plusDays = plusDays+intervalDays;
            if(i == quantityParcel){
                valueParcel = valueParcel.add(dif);
            }

            list.add(invoice(
                    valueParcel,
                    getDueDate(simulationData, plusDays),
                    formatParcel(i, quantityParcel)));
        }

        for(GeneratedParcel o : list){
            log.info(o.getParcel().substring(0,2)+ " -> Parcela : "+o.getParcel()+" - Valor : "+o.getValueParcel()+" - Data vencimento : "+ FormatDateUtils.formatDateDDMMYYYY(o.getDueDate()));
        }

        return list;
    }

    private LocalDate getDueDate(SimulationData simulationData, int plusDays) {
        return simulationData.getFirstDueDate().plusDays(plusDays);
    }

    private static GeneratedParcel invoice(BigDecimal valueParcel, LocalDate dueDate, String parcel) {
        return GeneratedParcel.builder()
                .valueParcel(valueParcel)
                .parcel(parcel)
                .dueDate(dueDate)
                .dateCreate(LocalDateTime.now())
                .description(SIMULATOR_PARCEL)
                .build();
    }

    private static String formatParcel(int parcel, Integer quantityParcels) {
        return String.format(FORMAT_DEFAULT_TWO, parcel)
                .concat(SEPARATOR)
                .concat(String.format(FORMAT_DEFAULT_TWO, quantityParcels));
    }
}
