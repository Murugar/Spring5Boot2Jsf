package com.iqmsoft.boot.jsf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.iqmsoft.boot.jsf.scope.SessionRepAwareScopeMetadata;


@SpringBootApplication
@ComponentScan(scopeResolver = SessionRepAwareScopeMetadata.class)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
