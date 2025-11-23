package es.daw.apihotelesmvc.service;

import es.daw.apihotelesmvc.dto.HotelesDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.List;
//ESTO ES UNA CLASE QUE SE CONECTA A UN SERVICIO EXTERNO
@Service
@RequiredArgsConstructor
public class HotelesService {

    private final WebClient webClientAPI;

    public List<HotelesDTO> getHoteles(){
// el webclient devuelve un array
        HotelesDTO [] hoteles;

        try {
            hoteles = webClientAPI
                    .get()
                    .uri("/hoteles")
                    .retrieve()
                    .bodyToMono(HotelesDTO[].class)
                    .block();
        } catch (Exception e) {
            throw new ConnectionApiRestException("Could not connect to APIHotel ");
        }
    return new ArrayList<>(List.of(hoteles));

    }
}
