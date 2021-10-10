package br.com.academy.ratkovski.demo.mapper;

import br.com.academy.ratkovski.demo.domain.Json;
import br.com.academy.ratkovski.demo.dto.JsonDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface JsonMapper {
    JsonMapper INSTANCE = Mappers.getMapper(JsonMapper.class);
    Json mapFrom(final JsonDto jsonDto);
}
