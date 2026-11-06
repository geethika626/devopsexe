
package com.example.eventservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class EventserviceApplication {

    List<Map<String, String>> users = new ArrayList<>();

    public static void main(String[] args) {
        SpringApplication.run(EventserviceApplication.class, args);
    }

    @PostMapping("/register")
    public String register(@RequestBody Map<String, String> user) {
        users.add(user);
        return "Registration Successful!";
    }

    @GetMapping("/users")
    public List<Map<String, String>> getUsers() {
        return users;
    }
}
