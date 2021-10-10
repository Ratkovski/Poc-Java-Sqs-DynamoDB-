package br.com.academy.ratkovski.demo.service;

import br.com.academy.ratkovski.demo.client.JsonClient;
import br.com.academy.ratkovski.demo.domain.Json;
import br.com.academy.ratkovski.demo.dto.JsonDto;
import br.com.academy.ratkovski.demo.mapper.JsonMapper;
import br.com.academy.ratkovski.demo.messaging.PublicadorDeJson;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JsonService {

    private final JsonClient jsonClient;
    private final PublicadorDeJson publicadorDeJson;

    public void consultarEPublicar(String userId) {
        final JsonDto jsonDto = jsonClient.getUserId(userId);
        final Json json = JsonMapper.INSTANCE.mapFrom(jsonDto);
        publicadorDeJson.publicar(json);
    }
}