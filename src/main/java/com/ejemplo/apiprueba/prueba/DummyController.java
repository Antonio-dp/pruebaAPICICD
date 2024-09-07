package com.ejemplo.apiprueba.prueba;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class DummyController {
    @GetMapping("/dummy/ping")
    public ResponseEntity<String> ping(){
        log.info("GET ping");
        return ResponseEntity.ok("pong");
    }
    @GetMapping("/dummy/tik")
    public ResponseEntity<String> tik(){
        log.info("GET tik");
        return ResponseEntity.ok("tok");
    }
}