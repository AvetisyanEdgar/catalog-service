package am.itspace.catalogservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
    @GetMapping("/")
    public ResponseEntity<String> greetings() {
        return ResponseEntity.ok("Hello World");
    }
}
