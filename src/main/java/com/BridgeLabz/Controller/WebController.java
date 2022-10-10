package com.BridgeLabz.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @GetMapping("/home")
    public String home() {
        return "Hello from BridgeLabz";
    }
    @GetMapping("/query")
    public String sayHello(@RequestParam String name){
        return "Hello " +name+" from BridgeLabz";
    }

}
