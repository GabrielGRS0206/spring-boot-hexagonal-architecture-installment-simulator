package br.com.io.github.grochase.adpters.in.v1.web.controller;

import br.com.io.github.grochase.adpters.in.documentation.SwaggerDocumentationGET;
import br.com.io.github.grochase.adpters.in.documentation.SwaggerDocumentationPOST;
import br.com.io.github.grochase.adpters.in.v1.web.datamanager.InstallmentSimulatorDataManager;
import br.com.io.github.grochase.adpters.in.v1.web.dto.SimulationRequestDto;
import br.com.io.github.grochase.adpters.in.v1.web.dto.SimulationResponseDto;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/simulations")
@RequiredArgsConstructor
@Log4j2
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
        log.info("Id -> "+id);
        return ResponseEntity.ok(installmentSimulatorDataManager.findById(id));
    }

}
