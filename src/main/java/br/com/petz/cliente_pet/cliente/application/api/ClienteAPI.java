package br.com.petz.cliente_pet.cliente.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/cliente")
public interface ClienteAPI {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    ClienteResponse postCliente(@RequestBody @Valid ClienteRequest clienteRequest);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<ClienteListResponse> getTodosClientes();

    @GetMapping(value = "/{idCliente}")
    @ResponseStatus(code = HttpStatus.OK)
    ClienteDetalhadoResponse getClienteAtravesId(@PathVariable UUID idCliente);

    @DeleteMapping(value = "/{idCliente}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    Void deletaClienteAtravesId(@PathVariable UUID idCliente);

    @PatchMapping(value = "/{idCliente}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    ClienteResponse patchAlteraCliente(@PathVariable UUID idCliente, @RequestBody @Valid ClienteAlteracaoRequest clienteAlteracaoRequest);


}
