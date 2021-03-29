package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/testSecured")
    @PreAuthorize("hasRole('app-user')")
    public ResponseEntity<?> securedController() {
        return ResponseEntity.ok("Hello world!");
    }

    @GetMapping("/testFree")
    public ResponseEntity<?> freeController() {
        return ResponseEntity.ok("Hello world!");
    }
}
