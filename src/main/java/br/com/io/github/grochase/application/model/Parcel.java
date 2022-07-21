package br.com.io.github.grochase.application.model;

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
public class Parcel {

    private String id;
    private String clientId;
    private BigDecimal value;
    private LocalDate dueDate;
    private LocalDateTime dateCreate;
    private String parcel;
    private String description;
}
