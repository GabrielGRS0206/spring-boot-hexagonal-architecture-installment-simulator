package br.com.io.github.grochase.adpters.in.documentation;

import br.com.io.github.grochase.adpters.in.v1.web.exception.response_error.ResponseError;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ApiResponses(value = {
        @ApiResponse(responseCode = "204", description = "Resource successfully deleted"),
        @ApiResponse(responseCode = "404", description = "The resource you were trying to access was not found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseError.class)))})
public @interface SwaggerDocumentationDELETE {

}
