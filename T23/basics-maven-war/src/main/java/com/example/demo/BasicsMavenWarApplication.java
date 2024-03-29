package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BasicsMavenWarApplication {
    public static void main(String[] args) {
      SpringApplication.run(BasicsMavenWarApplication.class, args);
    }
    @GetMapping("/")
    public String home() {
      return "Home\nThis project was created with maven\n";
    }
	@GetMapping("/welcome")
    public String welcome() {
      return "Welcome!";
    }
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
      return String.format("Hello %s!", name);
    }
}