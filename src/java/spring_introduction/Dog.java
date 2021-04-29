package spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component()
@Scope
public class Dog implements Pet {
    private String name;
    public Dog(){
        System.out.println("Dog bean done!");
    }

    public void say(){
        System.out.println("Gow Gow");
    }
    /*@PostConstruct
    public void init(){
        System.out.println("Class dog init method");
    }
    @PreDestroy
    public  void  destroy(){
        System.out.println("Class dog sectroy method");
    }*/
/*
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/
}
