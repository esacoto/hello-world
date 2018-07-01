package samples.api.springboot.controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@EnableAutoConfiguration
public class Controller {

    @RequestMapping("/hello")
    public String index() {
        return "Greetings from Spring Boot!";
    }


    public static void main(String[] args) {
        SpringApplication.run(Controller.class);
    }

}
