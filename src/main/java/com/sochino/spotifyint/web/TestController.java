package com.sochino.spotifyint.web;

import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Timed
@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World!";
    }
}
