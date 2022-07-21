package br.com.io.github.grochase.adpters.in.v1.web.exception.response_error;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class ResponseError implements Serializable {

    private static final long serialVersionUID = -7936551501603456464L;

    private Integer status;
    private OffsetDateTime timestamp;
    private String type;
    private String title;
    private String urlError;
    private String userMessage;
    private String exception;
    private String exceptionMessage;
    private List<ErrorDetail> datails;
}
