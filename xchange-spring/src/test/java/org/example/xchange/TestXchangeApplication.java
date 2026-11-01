package org.example.xchange;

import org.springframework.boot.SpringApplication;

public class TestXchangeApplication {

    public static void main(String[] args) {
        SpringApplication.from(XchangeApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
