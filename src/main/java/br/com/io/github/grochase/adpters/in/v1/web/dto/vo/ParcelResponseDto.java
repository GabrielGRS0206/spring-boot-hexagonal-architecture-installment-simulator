package br.com.io.github.grochase.adpters.in.v1.web.dto.vo;

import io.swagger.v3.oas.annotations.media.Schema;
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
@Schema
public class ParcelResponseDto {

    @Schema(name = "value", description = "Value total", example = "120.00")
    private BigDecimal value;

    @Schema(name = "dueDate", description = "Due date", example = "2022-09-01")
    private LocalDate dueDate;

    @Schema(name = "dateCreate", description = "Date create", example = "2022-04-01")
    private LocalDateTime dateCreate;

    @Schema(name = "parcel", description = "Parcel", example = "01/10")
    private String parcel;

    @Schema(name = "parcel", description = "Parcel", example = "01/10")
    private String description;
}
