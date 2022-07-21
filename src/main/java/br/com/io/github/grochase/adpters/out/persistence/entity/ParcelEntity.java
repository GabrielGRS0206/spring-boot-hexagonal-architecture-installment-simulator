package br.com.io.github.grochase.adpters.out.persistence.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Document
public class ParcelEntity {

    @Id
    private String id;
    private String clientId;
    private BigDecimal value;
    private LocalDate dueDate;
    private LocalDate dateCreate;
    private String parcel;
    private String description;
}
