package com.example.demo1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class Demo1Controller {
    @Autowired
    private NewRelicLogger newRelicLogger;

    @RequestMapping("/exampleone")
    public String exampleone() {
        String message = "Hello, DEMO1!";
        this.newRelicLogger.log(message);
        return message;
    }
}
