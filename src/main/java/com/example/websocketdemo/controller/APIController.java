package com.example.websocketdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tanmay
 * @date 17/05/20
 **/

@RestController
public class APIController {

    @GetMapping("/heartbeat")
    public String greeting() {
        return "OK";
    }
}
