package com.horacerta.controller;

import java.time.LocalTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
 public class HoraCertaController {

    @GetMapping("/time")
    public LocalTime time() {
        return LocalTime.now();
    }
}