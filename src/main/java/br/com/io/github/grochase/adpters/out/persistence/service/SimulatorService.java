package br.com.io.github.grochase.adpters.out.persistence.service;

import br.com.io.github.grochase.adpters.out.persistence.repository.SimulatorRepository;
import br.com.io.github.grochase.application.exception.BusinessException;
import br.com.io.github.grochase.application.model.ListParcel;
import br.com.io.github.grochase.ports.out.SimulatorRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SimulatorService implements SimulatorRepositoryPort {

    private final SimulatorRepository simulatorRepository;

    @Override
    public ListParcel save(ListParcel listParcel) {
        return simulatorRepository.save(listParcel);
    }

    @Override
    public ListParcel findById(String id) {
        return simulatorRepository.findById(id).orElseThrow(() -> new BusinessException(
                "Simulation not found ".concat(id)
        ));
    }
}
