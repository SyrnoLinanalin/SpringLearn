package com.example.demo;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.Cat;
import spring_introduction.Dog;
import spring_introduction.Person;
import spring_introduction.Pet;
public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Pet pet = context.getBean("myPet", Pet.class);
        // Pet pet = new Cat();
        Person person = context.getBean("myPerson", Person.class);
        person.callPet();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
    }
}
