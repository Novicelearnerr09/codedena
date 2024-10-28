package com.sayaliblog.blogappapis;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;

import java.util.Map;

@SpringBootApplication
public class BlogAppApisApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogAppApisApplication.class, args);
        System.out.println("Chal jayega");
    }
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }


}
