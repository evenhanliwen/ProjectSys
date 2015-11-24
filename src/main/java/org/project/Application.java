package org.project;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args) {
    	SpringApplication app = new SpringApplication(Application.class);  

        app.setWebEnvironment(true);  

        Set<Object> set = new HashSet<Object>();  
        //set.add("classpath:applicationContext.xml");  
        app.setSources(set);  
        app.run(args);  
    }
}