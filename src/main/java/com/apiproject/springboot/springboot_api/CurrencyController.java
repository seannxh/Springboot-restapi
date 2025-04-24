package com.apiproject.springboot.springboot_api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {
    private CurrencyServiceConfig configuration;

    public CurrencyController(CurrencyServiceConfig configuration){
        this.configuration = configuration;
    }

    @RequestMapping("/currency")
    public CurrencyServiceConfig retrieveAllCourses(){
        return configuration;
    }
}
