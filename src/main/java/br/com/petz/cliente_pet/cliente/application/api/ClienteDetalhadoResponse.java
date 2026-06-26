package br.com.petz.cliente_pet.cliente.application.api;

import br.com.petz.cliente_pet.cliente.domain.Sexo;
import lombok.Value;


import java.time.LocalDateTime;
import java.util.UUID;

@Value
public class ClienteDetalhadoResponse {
    private UUID idCliente;
    private String nomeCompleto;
    private String cpf;
    private String celular;
    private String telefone;
    private Sexo sexo;
    private String email;
    private Boolean aceitaTermos;
    private LocalDateTime dataHoraDoCadastro;
}
