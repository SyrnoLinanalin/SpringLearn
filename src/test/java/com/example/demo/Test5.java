package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.Dog;

public class Test5 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.say();

        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.say();
        context.close();
    }
}