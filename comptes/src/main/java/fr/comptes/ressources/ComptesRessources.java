package fr.comptes.ressources;

import fr.comptes.ressources.dto.CarteResponse;
import fr.comptes.ressources.dto.CompteResponse;
import fr.comptes.service.ComptesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class ComptesRessources {

    @Autowired
    ComptesService comptesService;

    @GetMapping("{id}/cartes")
    public ResponseEntity<CompteResponse> getCartes(@PathVariable("id") String id) {
        List<CarteResponse> listeDesCartes = this.comptesService.getListeDesCartes();
        return ResponseEntity.ok(CompteResponse.builder().id(id).cartes(listeDesCartes).build());
    }
}
