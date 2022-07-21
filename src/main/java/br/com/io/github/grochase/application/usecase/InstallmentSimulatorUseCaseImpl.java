package br.com.io.github.grochase.application.usecase;

import br.com.io.github.grochase.application.generator.GeneratorParcel;
import br.com.io.github.grochase.application.model.ListParcel;
import br.com.io.github.grochase.application.model.SimulationData;
import br.com.io.github.grochase.ports.in.InstallmentSimulatorUseCasePort;
import br.com.io.github.grochase.ports.out.SimulatorRepositoryPort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class InstallmentSimulatorUseCaseImpl implements InstallmentSimulatorUseCasePort {

    private final GeneratorParcel generatorParcel;
    private final SimulatorRepositoryPort simulatorRepositoryPort;

    @Override
    public ListParcel save(ListParcel listParcel) {
        return simulatorRepositoryPort.save(listParcel);
    }

    @Override
    public ListParcel generate(SimulationData parcelLot) {
        return generatorParcel.generate(parcelLot);
    }
}
