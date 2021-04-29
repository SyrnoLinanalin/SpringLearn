package aop;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component

public class University {

    private List<Student> student = new ArrayList<>();

    public void addStudent(){
        Student st1 = new Student("Fanil Fanilov", 4, 7.5);
        Student st2 = new Student("Ivan Ivanov", 2, 2.3);
        Student st3 = new Student("Sasha Sosi", 1, 4.5);
        student.add(st1);
        student.add(st2);
        student.add(st3);
    }

    public  List<Student> getStudent(){
        System.out.println("НАЧАЛО РАБОТЫ");
        //System.out.println(student.get(3));
        System.out.println("Information from method getStidents");
        System.out.println(student);
        return student;
    }
}
