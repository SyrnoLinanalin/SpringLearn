package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class universityLoggingAspect {
 /*   @Before("execution(* getStudent())")
    public void beforeGetStudentsGetLoggingAdvice(){
        System.out.println("beforeGetStudentsGetLoggingAdvice: логируем получение" +
                "списка студентов перед методом getStudenst");
    }*/

/*    @AfterReturning(pointcut = "execution(* getStudent())",
            returning = "studentList")
    public void afterReturningGetStudentsGetLoggingAdvice(List<Student> studentList){
        Student first = studentList.get(0);
        String nameSurname = first.getNameSurname();
        nameSurname = "Mr. " + nameSurname;
        first.setNameSurname(nameSurname);

        double avgGrade  = first.getAvgGrade();
        avgGrade = avgGrade + 1;
        first.setAvgGrade(avgGrade);

        System.out.println("afterReturningGetStudentsGetLoggingAdvice: логируем получение" +
                "списка студентов после работы  метода getStudenst");
    }*/
/*
    @AfterThrowing(pointcut = "execution(* getStudent())",
    throwing = "exception")
    public void afterThrowingGetStudentsGetLoggingAdvice(Throwable exception){


        System.out.println("afterReturningGetStudentsGetLoggingAdvice: " +
                "LOG EXCEPRION" + exception);
    }*/


    @After("execution(* getStudent())")
    public void afterGetStudentLoggingAdvice(){
        System.out.println("afterGetStudentLoggingAdvice logging exception or end");
    }
}
