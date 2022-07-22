package br.com.io.github.grochase.adpters.in.v1.web.mapper;

import br.com.io.github.grochase.adpters.in.v1.web.dto.SimulationRequestDto;
import br.com.io.github.grochase.adpters.in.v1.web.dto.vo.ParcelResponseDto;
import br.com.io.github.grochase.application.generator.model.GeneratedParcel;
import br.com.io.github.grochase.application.model.ListParcel;
import br.com.io.github.grochase.application.model.SimulationData;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class InstallmentSimulatorMapper {

    public SimulationData map(SimulationRequestDto requestDto) {
        return SimulationData.builder()
                .firstDueDate(requestDto.getFirstDueDate())
                .quantityParcel(requestDto.getQuantityParcel())
                .valueTotal(requestDto.getValueTotal())
                .build();
    }

    public List<ParcelResponseDto> map(ListParcel listRecurrenceInvoice) {
        return listRecurrenceInvoice.getParcels().stream().map(e -> this.toDto(e)).collect(Collectors.toList());
    }

    private ParcelResponseDto toDto(GeneratedParcel e) {
        return ParcelResponseDto.builder()
                .value(e.getValueParcel())
                .parcel(e.getParcel())
                .dateCreate(e.getDateCreate())
                .description(e.getDescription())
                .dueDate(e.getDueDate())
                .build();
    }
}
