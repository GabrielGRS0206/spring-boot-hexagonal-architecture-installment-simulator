package br.com.io.github.grochase.ports.out;

import br.com.io.github.grochase.application.model.Parcel;

public interface ParcelRepositoryPort {

    Parcel save(Parcel invoice);
    Boolean delete(Parcel invoice);

}
