package com.polarbookshop.orderservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class MessageController {

    @Value("${message}")
    private String message;

    @GetMapping("/message")
    public ResponseEntity<Mono<String>> getMessage() {
        return ResponseEntity.ok(Mono.just(message));
    }
}
