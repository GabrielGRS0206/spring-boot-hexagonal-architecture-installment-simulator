package br.com.io.github.grochase.adpters.in.v1.web.dto;

import br.com.io.github.grochase.adpters.in.v1.web.dto.vo.ParcelResponseDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema
public class SimulationResponseDto {

    @Schema(name = "id", description = "Simulator id", example = "3r34rf34t34")
    private String id;

    @Schema(name = "parcels", description = "Parcels generateds")
    private List<ParcelResponseDto> parcels;
}
