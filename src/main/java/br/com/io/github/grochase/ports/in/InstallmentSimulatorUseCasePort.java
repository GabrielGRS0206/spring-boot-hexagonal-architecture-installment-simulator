package br.com.io.github.grochase.ports.in;

import br.com.io.github.grochase.application.model.ListParcel;
import br.com.io.github.grochase.application.model.SimulationData;

public interface InstallmentSimulatorUseCasePort {

    ListParcel save(ListParcel listParcel);

    ListParcel generate(SimulationData parcelLot);
}
