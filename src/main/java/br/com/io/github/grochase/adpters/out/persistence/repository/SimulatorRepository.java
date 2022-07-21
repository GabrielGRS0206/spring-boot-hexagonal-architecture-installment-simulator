package br.com.io.github.grochase.adpters.out.persistence.repository;

import br.com.io.github.grochase.application.model.ListParcel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SimulatorRepository extends MongoRepository<ListParcel, String> {
}
