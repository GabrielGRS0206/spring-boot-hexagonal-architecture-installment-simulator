package br.com.io.github.grochase.ports.out;

import br.com.io.github.grochase.application.model.ListParcel;

public interface SimulatorRepositoryPort {

    ListParcel save(ListParcel invoice);

    ListParcel findById(String id);
}
