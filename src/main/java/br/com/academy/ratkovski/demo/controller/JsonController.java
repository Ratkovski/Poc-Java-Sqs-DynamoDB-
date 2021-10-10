package br.com.academy.ratkovski.demo.controller;

import br.com.academy.ratkovski.demo.service.JsonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts/")
@RequiredArgsConstructor
public class JsonController {

    private final JsonService jsonService;

    @GetMapping("{userId}")
    public ResponseEntity<Void> consultaJson(@PathVariable String userId) {
        try {
            jsonService.consultarEPublicar(userId);
            return ResponseEntity.ok().build();
        } catch (RuntimeException runtimeException) {
            runtimeException.printStackTrace();
            return ResponseEntity.badRequest().build();
        }
    }
}
