package fr.cartes.ressources;

import fr.cartes.ressources.dto.CarteResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping
public class CartesRessources {
    @Value("${server.port}")
    private int serverPort;

    @GetMapping
    public ResponseEntity<List<CarteResponse>> getCartes() {
        System.out.println(String.format("Hey je suis le serveur : %s", serverPort));
        CarteResponse carte1 = new CarteResponse("1234");
        CarteResponse carte2 = new CarteResponse("5678");
        return ResponseEntity.ok(Arrays.asList(carte1, carte2));
    }
}
