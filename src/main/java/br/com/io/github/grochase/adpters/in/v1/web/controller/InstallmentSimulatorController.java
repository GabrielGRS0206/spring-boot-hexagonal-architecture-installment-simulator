package br.com.io.github.grochase.adpters.in.v1.web.controller;

import br.com.io.github.grochase.adpters.in.documentation.SwaggerDocumentationPOST;
import br.com.io.github.grochase.adpters.in.v1.web.datamanager.InstallmentSimulatorDataManager;
import br.com.io.github.grochase.adpters.in.v1.web.dto.SimulationRequestDto;
import br.com.io.github.grochase.adpters.in.v1.web.dto.SimulationResponseDto;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/payments",
        produces = {"application/json"},
        consumes = {"application/json"})
@RequiredArgsConstructor
public class InstallmentSimulatorController {

    private final InstallmentSimulatorDataManager installmentSimulatorDataManager;

    @PostMapping("/simulator_parcels")
    @SwaggerDocumentationPOST
    @Operation(description = "Simulator parcels")
    public SimulationResponseDto generate(@RequestBody SimulationRequestDto requestDto) {
        return installmentSimulatorDataManager.simulate(requestDto);
    }
}
