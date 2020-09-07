package com.example.forelesning3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathController {

    @GetMapping(path = "/ping")
    public String ping(){
        return "pong";
    }

    @GetMapping(path = "/pong")
    public String pong(){
        return "ping";
    }


}
