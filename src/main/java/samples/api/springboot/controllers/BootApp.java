package samples.api.springboot.controllers;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



/*
  command line springbooth application.
 */

@SpringBootApplication
public class BootApp implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(BootApp.class,args);

    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("hello from the command line");
    }
}
