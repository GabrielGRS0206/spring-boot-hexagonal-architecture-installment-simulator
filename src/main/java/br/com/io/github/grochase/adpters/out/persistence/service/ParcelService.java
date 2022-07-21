package br.com.io.github.grochase.adpters.out.persistence.service;

import br.com.io.github.grochase.adpters.out.persistence.repository.ParcelRepository;
import br.com.io.github.grochase.application.model.Parcel;
import br.com.io.github.grochase.ports.out.ParcelRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ParcelService implements ParcelRepositoryPort {

    private final ParcelRepository repository;

    @Override
    public Parcel save(Parcel invoice) {
        return repository.save(invoice);
    }

    @Override
    public Boolean delete(Parcel invoice) {
        repository.delete(invoice);

        //TODO adicionar validate exclusão
        return Boolean.TRUE;
    }
}
