package com.thg.naomikennedy.personalorganiser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PersonalOrganiserApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonalOrganiserApplication.class, args);
    }

}
