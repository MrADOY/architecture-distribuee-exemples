package fr.comptes.service;

import fr.comptes.ressources.dto.CarteResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class ComptesService {
    @Autowired
    private WebClient.Builder webClient;
    public List<CarteResponse> getListeDesCartes() {
        return webClient.baseUrl("http://cartes/")
                .build()
                .get()
                .uri("cartes")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToFlux(CarteResponse.class)
                .collectList()
                .block();
    }
}
