package com.iqmsoft.boot.jsf.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.iqmsoft.boot.jsf.scope.ScopeName;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
@Scope(ScopeName.VIEW)
public class HelloWorldBean {

    public String hello() {
        return "Hello World from Spring5 Boot2 Server. Time now: "+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"));
    }
}
