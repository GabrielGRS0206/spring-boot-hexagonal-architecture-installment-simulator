package br.com.io.github.grochase.adpters.out.persistence.repository;

import br.com.io.github.grochase.application.model.Parcel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ParcelRepository extends MongoRepository<Parcel, String> {
}
