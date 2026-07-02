package br.com.petz.cliente_pet.pet.application.api;

import br.com.petz.cliente_pet.pet.domain.Porte;
import br.com.petz.cliente_pet.pet.domain.SexoPet;
import br.com.petz.cliente_pet.pet.domain.TipoPet;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;
import java.time.LocalDate;

@Value
public class PetAlteracaoRequest {
    @NotBlank
    private String nomePet;
    private Porte porte;
    @NotNull
    private TipoPet tipo;
    private String microchip;
    @NotBlank
    private String raca;
    @NotNull
    private SexoPet sexo;
    private String pelagemCor;
    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataNascimento;
    private String rga;
    private Integer Peso;

}

