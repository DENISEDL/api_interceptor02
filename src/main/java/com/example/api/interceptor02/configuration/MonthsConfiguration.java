package com.example.api.interceptor02.configuration;

import com.example.api.interceptor02.interceptors.MonthInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MonthsConfiguration implements WebMvcConfigurer {

    public MonthsConfiguration(MonthInterceptor monthInterceptor) {
        this.monthInterceptor = monthInterceptor;
    }

    @Autowired
    private MonthInterceptor monthInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(monthInterceptor).addPathPatterns("/months");
    }
}