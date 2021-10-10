package br.com.academy.ratkovski.demo.controller;

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

    @GetMapping("{userId}")
    public ResponseEntity<Void> consultaJson(@PathVariable String userId) {
            return ResponseEntity.ok().build();
    }

}
