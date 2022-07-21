package br.com.io.github.grochase.adpters.in.v1.web.exception;



public class DtoInvalidoException extends RuntimeException {

    public DtoInvalidoException(String mensagem) {
        super(mensagem);
    }

    public DtoInvalidoException(StringBuilder builder) {
        this(builder.toString().replaceFirst("\\|", ""));
    }

}
