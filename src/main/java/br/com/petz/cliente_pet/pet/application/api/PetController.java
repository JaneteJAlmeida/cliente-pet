package br.com.petz.cliente_pet.pet.application.api;

import br.com.petz.cliente_pet.pet.application.service.PetService;
import br.com.petz.cliente_pet.pet.domain.Pet;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class PetController implements PetAPI {
    private final PetService petService;

        @Override
    public PetResponse postCliente(UUID idCliente, PetRequest petRequest) {
        log.info("[inicia] PetController - postPet");
        log.info("idCliente] {}", idCliente);
        PetResponse pet = petService.criaPet(idCliente, petRequest);
        log.info("[finaliza] PetController - postPet");
        return pet;
    }
}
