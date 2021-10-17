package br.com.academy.ratkovski.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class JsonDto {
    @JsonProperty
    private String userId;
    @JsonProperty
    private String id;
    @JsonProperty
    private String title;
    @JsonProperty
    private String body;
}
