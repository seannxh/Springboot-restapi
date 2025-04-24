package com.apiproject.springboot.springboot_api;

//currency-service.url=
//currency.service.username=
//currency.service.key=

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "currency-service")
@Component // Spring to manage
public class CurrencyServiceConfig {
    private String url;
    private String username;
    private String key;


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
