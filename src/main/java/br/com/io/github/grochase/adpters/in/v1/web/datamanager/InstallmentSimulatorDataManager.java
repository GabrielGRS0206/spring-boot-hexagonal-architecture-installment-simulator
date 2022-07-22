package br.com.io.github.grochase.adpters.in.v1.web.datamanager;

import br.com.io.github.grochase.adpters.in.v1.web.dto.SimulationRequestDto;
import br.com.io.github.grochase.adpters.in.v1.web.dto.SimulationResponseDto;
import br.com.io.github.grochase.adpters.in.v1.web.mapper.InstallmentSimulatorMapper;
import br.com.io.github.grochase.application.model.ListParcel;
import br.com.io.github.grochase.ports.in.InstallmentSimulatorUseCasePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InstallmentSimulatorDataManager {

    private final InstallmentSimulatorUseCasePort installmentSimulatorUseCasePort;
    private final InstallmentSimulatorMapper installmentSimulatorMapper;

    public SimulationResponseDto simulate(SimulationRequestDto requestDto) {

        ListParcel listParcel = installmentSimulatorUseCasePort.generate(installmentSimulatorMapper.map(requestDto));

        installmentSimulatorUseCasePort.save(listParcel);

        return SimulationResponseDto.builder()
                .id(listParcel.getId())
                .parcels(installmentSimulatorMapper.map(listParcel))
                .build();
    }

    public SimulationResponseDto findById(String id) {

        ListParcel listParcel = installmentSimulatorUseCasePort.findById(id);

        return SimulationResponseDto.builder()
                .id(listParcel.getId())
                .parcels(installmentSimulatorMapper.map(listParcel))
                .build();
    }
}
