package com.digitalinnovationone.springbootconfig;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Value("${app.home}")
    private String appHome;

    @Value("${app.message}")
    private String appMessage;

    @Value("${app.calc}")
    private String appCalc;

    @GetMapping("/")
    public String getAppHome(){return appHome; }

    @GetMapping("/message")
    public String getAppMessage(){
        return appMessage;
    }

    @GetMapping("/calc")
    public String getAppCalc() { return appCalc; }

}
