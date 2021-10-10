package br.com.academy.ratkovski.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Json implements Serializable {

    private static final long serialVersionUID = 7833604624484844109L;

    private String userId;
    private String id;
    private String title;
    private String body;

}
