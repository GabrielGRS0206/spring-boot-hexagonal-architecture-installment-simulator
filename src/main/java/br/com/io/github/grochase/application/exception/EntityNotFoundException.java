package br.com.io.github.grochase.application.exception;

import java.util.UUID;

public class EntityNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 2418133965202445456L;

    public EntityNotFoundException(String mensagem) {
        super(mensagem);
    }

    public EntityNotFoundException(UUID id) {
        this(String.format("There is no record with code %s", id.toString()));
    }

}
