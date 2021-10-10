package br.com.academy.ratkovski.demo.service;

import br.com.academy.ratkovski.demo.client.JsonClient;
import br.com.academy.ratkovski.demo.domain.Json;
import br.com.academy.ratkovski.demo.dto.JsonDto;
import br.com.academy.ratkovski.demo.mapper.JsonMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JsonService {

    private JsonClient jsonClient;

    public Json consultar(String userId) {
        final JsonDto jsonDto = jsonClient.getUserId(userId);
        final Json json = JsonMapper.INSTANCE.mapFrom(jsonDto);
        return json;
    }
}