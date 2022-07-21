package br.com.io.github.grochase.adpters.in.documentation;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ApiResponses(value = {@ApiResponse(responseCode = "201", description = "Resource saved successfully")})
public @interface SwaggerDocumentationPOST {

}
