package com.example.SpringModel;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

}/*@Bean
    public CommandLineRunner demo(EntityRepo repo){
        return (args)->{
            *//*repo.save(new SubEntity("name","subname"));
            repo.save(new SubEntity("name_two","subName_Two"));*//*
        };
    }*/
