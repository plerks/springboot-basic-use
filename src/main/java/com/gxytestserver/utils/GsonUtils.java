package com.gxytestserver.utils;

import org.springframework.context.annotation.Bean;

import com.google.gson.Gson;

public class GsonUtils {
    @Bean
    public Gson gson() {
        return new Gson();
    }
}