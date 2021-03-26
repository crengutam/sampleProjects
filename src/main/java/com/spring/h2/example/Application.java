package com.spring.h2.example;

import com.spring.h2.example.datasource.UserRepository;
import com.spring.h2.example.model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Created by crenguta.soldatu on 26/03/2021.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner run(UserRepository userRepository) throws Exception {

        return (String[] args) -> {
            User user1 = new User("John", "john@domain.com");
            User user2 = new User("Julie", "julie@domain.com");
            userRepository.save(user1);
            userRepository.save(user2);
            for (User savedUser: userRepository.findAll()){
                System.out.println(savedUser);
            }
        };
    }
}