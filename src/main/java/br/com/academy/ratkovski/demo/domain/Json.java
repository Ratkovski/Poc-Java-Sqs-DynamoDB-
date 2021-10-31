package br.com.academy.ratkovski.demo.domain;

import lombok.*;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Getter
@Setter
//@NoArgsConstructor
public class Json implements Serializable {

    private static final long serialVersionUID = 7833604624484844109L;

    private String userId;
    private String id;
    private String title;
    private String body;

}
