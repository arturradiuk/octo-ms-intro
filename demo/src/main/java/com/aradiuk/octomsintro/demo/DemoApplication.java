package com.aradiuk.octomsintro.demo;

import com.aradiuk.octomsintro.inframapper.HelloMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.aradiuk.octomsintro")
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private HelloMapper helloMapper;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println(helloMapper.map());
    }
}
