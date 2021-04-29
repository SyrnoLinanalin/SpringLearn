package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.Dog;

public class Test4 {
    public static void main(String[] args) {
       ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

   /* Dog myDog = context.getBean("myPet",Dog.class);
    Dog yourDog = context.getBean("myPet", Dog.class);
    yourDog.setName("Strelka");
    myDog.setName("Narkosha");*/
/*
        System.out.println(myDog.getName());
        System.out.println(yourDog.getName());*/
        context.close();

    }
}
