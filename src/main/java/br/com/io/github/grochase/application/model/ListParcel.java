package br.com.io.github.grochase.application.model;

import br.com.io.github.grochase.application.generator.model.GeneratedParcel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collation = "simulator_parcel")
public class ListParcel {

    @Id
    private String id;

    private List<GeneratedParcel> parcels;
}
