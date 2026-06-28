package br.com.petz.cliente_pet.cliente.application.api;

import lombok.Builder;
import lombok.Getter;
import java.util.UUID;

@Getter
@Builder
public class ClienteResponse {
    private UUID idCliente;
}
