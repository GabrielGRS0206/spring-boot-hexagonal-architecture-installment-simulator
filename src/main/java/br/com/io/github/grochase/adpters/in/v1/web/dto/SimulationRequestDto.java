package br.com.io.github.grochase.adpters.in.v1.web.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema
public class SimulationRequestDto {

    @NotNull
    @NotBlank
    @DecimalMin(value = "0", message = "Value min 0")
    @Schema(name = "valueTotal", description = "Value total", example = "120.0")
    private BigDecimal valueTotal;

    @NotNull
    @NotBlank
    @Schema(name = "firstDueDate", description = "First date invoice", example = "2022-01-12")
    private LocalDate firstDueDate;

    @NotNull
    @NotBlank
    @Positive(message = "Value min 1")
    @Schema(name = "quantityParcel", description = "Quantity parcel", example = "10")
    private Integer quantityParcel;

    @NotNull
    @NotBlank
    @Schema(name = "description", description = "Invoice monthly", example = "Invoice monthly ref netflix")
    private String description;
}
