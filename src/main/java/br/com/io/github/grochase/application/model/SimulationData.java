package br.com.io.github.grochase.application.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SimulationData {

    private BigDecimal valueTotal;
    private LocalDate firstDueDate;
    private int quantityParcel;
    private int intervalDays;
    private String description;
}
