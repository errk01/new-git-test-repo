package com.example.tts.demoSpringIntro;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {


    @RequestMapping("/")
    public String home(){
        return "Hello Spring";
    }
}
