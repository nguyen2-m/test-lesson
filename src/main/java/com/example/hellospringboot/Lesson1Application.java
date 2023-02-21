package com.example.hellospringboot;

import ch.qos.logback.core.Context;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.function.ServerResponse;

@SpringBootApplication
public class Lesson1Application {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(Lesson1Application.class, args);

//        Outfit outfit = context.getBean(Outfit.class);
//        System.out.println(outfit);
//        outfit.wear();

        GirlFriend girlFriend = context.getBean(GirlFriend.class);

        System.out.println(girlFriend);
        System.out.println(girlFriend.outfit);
        girlFriend.outfit.wear();
    }

}
