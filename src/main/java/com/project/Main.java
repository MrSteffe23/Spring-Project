package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
//    @GetMapping("/hello") //e un REST endpoint
//    public GreetResponse greet(){
//        GreetResponse response =  new GreetResponse(
//                "Hello",
//                List.of("Java", "GoLang", "C"),
//                new Person("Alex", 28, 30000)
//        );
//        return response;
//    }
//
//    record Person(String name, int age, double savings){}
//    record GreetResponse(
//            String greet,
//            List<String> favProgrammingLanguages,
//            Person person
//    ){}
}
