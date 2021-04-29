package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_introduction.MyConfig;
import spring_introduction.Person;
import spring_introduction.Pet;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean("personBean", Person.class);
        //person.callPet();
        System.out.println(person.getAge());
        System.out.println(person.getSurname());

    /*    Pet cat = context.getBean("catBean", Pet.class);
        Pet cat1 = context.getBean("catBean", Pet.class);*/
        context.close();
    }
}
