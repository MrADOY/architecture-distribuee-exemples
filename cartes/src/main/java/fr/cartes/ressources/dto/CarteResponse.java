package fr.cartes.ressources.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CarteResponse {
    private String numeroCarte;

    public String getNumeroCarte() {
        return numeroCarte;
    }

    public void setNumeroCarte(String numeroCarte) {
        this.numeroCarte = numeroCarte;
    }

    public CarteResponse(String numeroCarte) {
        this.numeroCarte = numeroCarte;
    }
}
