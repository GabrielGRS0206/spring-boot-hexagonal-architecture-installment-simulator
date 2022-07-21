package br.com.io.github.grochase.application.generator.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GeneratedParcel {
    private BigDecimal valueParcel;
    private String parcel;
    private LocalDate dueDate;
    private LocalDateTime dateCreate;
    private String description;
}
