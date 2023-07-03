package com.noidea.cemantixapi.dao;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.noidea.cemantixapi.beans.WordValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CemantixDaoImpl implements CemantixDao {
    private final WebClient webClient;

    public CemantixDaoImpl(@Value("${api.url}") String apiUrl) {
        this.webClient = WebClient.builder()
                .baseUrl(apiUrl)
                .build();
    }

    @Override
    public List<WordValue> getMostSimilar(String word, int size) {
        final String s = webClient.get()
                .uri(uriBuilder -> uriBuilder.queryParam("word", word).build())
                .retrieve()
                .bodyToMono(String.class)
                .block();

        try {
            // Hug does not give a "normal" json response, but a List<List<Object>> :(
            // Converting as "json string" into beans
            ObjectMapper mapper = new ObjectMapper();
            List<List<Object>> jsonList = mapper.readValue(s, new TypeReference<List<List<Object>>>() {});

            // Convertir en objets MyObject
            return jsonList.stream()
                    .map(obj -> new WordValue(obj.get(0).toString(), (double) obj.get(1)))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
