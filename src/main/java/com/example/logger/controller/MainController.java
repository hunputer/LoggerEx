package com.example.logger.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    private final Logger Logger = LoggerFactory.getLogger(MainController.class.getName());

    @GetMapping("/")
    public void main(){
        Logger.info("main info");
        Logger.error("main error");
        Logger.warn("main warn");
    }
}
