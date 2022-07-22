package br.com.io.github.grochase.adpters.in.v1.web.controller;

import br.com.io.github.grochase.adpters.in.documentation.SwaggerDocumentationGET;
import br.com.io.github.grochase.adpters.in.documentation.SwaggerDocumentationPOST;
import br.com.io.github.grochase.adpters.in.v1.web.datamanager.InstallmentSimulatorDataManager;
import br.com.io.github.grochase.adpters.in.v1.web.dto.SimulationRequestDto;
import br.com.io.github.grochase.adpters.in.v1.web.dto.SimulationResponseDto;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/simulations")
@RequiredArgsConstructor
public class InstallmentSimulatorController {

    private final InstallmentSimulatorDataManager installmentSimulatorDataManager;

    @PostMapping
    @SwaggerDocumentationPOST
    @Operation(description = "Simulator parcels")
    public ResponseEntity<SimulationResponseDto> generate(@RequestBody SimulationRequestDto requestDto) {
        return ResponseEntity.ok(installmentSimulatorDataManager.simulate(requestDto));
    }

    @GetMapping("/{id}")
    @SwaggerDocumentationGET
    @Operation(description = "Find by id simulator")
    public ResponseEntity<SimulationResponseDto> findById(@PathVariable String id) {
        System.out.println("---------"+id);
        return ResponseEntity.ok(installmentSimulatorDataManager.findById(id));
    }

}
