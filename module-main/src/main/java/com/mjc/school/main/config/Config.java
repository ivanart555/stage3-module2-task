package com.mjc.school.main.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.Scanner;

@Configuration
@ComponentScan(basePackages = {"com.mjc.school"})
@EnableAspectJAutoProxy
public class Config {
    @Bean
    public Scanner scanner() {
        return new Scanner(System.in);
    }
}
