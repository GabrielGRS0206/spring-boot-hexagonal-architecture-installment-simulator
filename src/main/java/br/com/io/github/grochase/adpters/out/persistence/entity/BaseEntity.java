package br.com.io.github.grochase.adpters.out.persistence.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BaseEntity {

    private LocalDateTime dateHourCreate;
    private LocalDateTime dateHourChange;
}
