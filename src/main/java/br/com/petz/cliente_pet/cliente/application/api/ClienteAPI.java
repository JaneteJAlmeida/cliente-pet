package br.com.petz.cliente_pet.cliente.application.api

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/cliente")
public interface ClienteAPI {
    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping
    ClienteResponse postCiente(@RequestBody ClienteRequest clienteRequeste);

}
