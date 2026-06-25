package br.com.petz.cliente_pet.cliente.application.api;


import br.com.petz.cliente_pet.cliente.domain.Cliente;

import java.util.List;
import java.util.UUID;

public class ClienteListResponse {
    private UUID idCliente;
    private String nomeCompleto;
    private String cpf;
    private String celular;
    private String email;


    public static List<ClienteListResponse> converte(List<Cliente> clientes) {
        return null;
    }
}
