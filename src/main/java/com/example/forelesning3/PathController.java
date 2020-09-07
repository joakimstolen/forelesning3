package com.example.forelesning3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathController {

    @GetMapping(path = "/")
    public String home(){
        if( MyTogglzFeatures.FEATURE_ONE.isActive() ) {
            return "Welcome to homepage";
        } else {
            return "Not an active feature";
        }
    }

    @GetMapping(path = "/ping")
    public String ping(){
        return "pong";
    }

    @GetMapping(path = "/pong")
    public String pong(){
        return "ping";
    }


    @GetMapping(path = "/pingpong")
    public String pingPong(){
        return "pingPong";
    }

    @GetMapping(path = "/jokke")
    public String helloCreator(){
        return "hello Joakim";
    }
}
