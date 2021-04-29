package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {
/*
    @Pointcut("execution(* aop.UniLibrary.*(..))")
    private void allMetgodsFromUniLibrary(){}

    @Pointcut("execution(public void aop.UniLibrary.returnMagazin())")
    private void returnMagazinFromUbiLibrary(){}

    @Pointcut("allMetgodsFromUniLibrary() && !returnMagazinFromUbiLibrary()")
    private void allMethodsExceptReturnMagazinFromUniLibrary(){}


    @Before("allMethodsExceptReturnMagazinFromUniLibrary()")
    public void beforeAllMethodsExceptReturnMagazinAdvice(){
        System.out.println("LOG # 10");
    }*/
/*

    @Pointcut("execution (* aop.UniLibrary.get*())")
    private void   allGetMethodsFromUniLibrary(){}

    @Pointcut("execution (* aop.UniLibrary.return*())")
    private void allReturnsFromUniLibrary(){}

    @Pointcut("allGetMethodsFromUniLibrary() || allReturnsFromUniLibrary()")
    private void allGetAndReturnsFromUniLibrary(){}


    @Before("allGetMethodsFromUniLibrary()")
    private void bedoreGetLoggingAdvice(){
        System.out.println("bedoreGetLoggingAdvice: writing LOG1");
    }

    @Before("allReturnsFromUniLibrary()")
    private void bedoreReturnLoggingAdvice(){
        System.out.println("bedoreReturnLoggingAdvice: writing LOG2");
    }

    @Before("allGetAndReturnsFromUniLibrary()")
    public void  bedoreGetAndReturnLoggingAdvice(){
        System.out.println("bedoreGetAndReturnLoggingAdvice: writing LOG3");
    }

*/





    @Before("aop.aspects.MyPointcuts.allAddMethods()")
     public  void beforeAddLoggingAdvice(JoinPoint joinPoint){

        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        System.out.println("methotdSignature =" + methodSignature);
        System.out.println("methotdSignature getMethod =" + methodSignature.getMethod());
        System.out.println("methotdSignature getReturnType =" + methodSignature.getReturnType());
        System.out.println("methotdSignature getName =" + methodSignature.getName());

        if(methodSignature.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();
            for(Object obj:arguments){
                if(obj instanceof Book){
                    Book myBook =(Book) obj;
                    System.out.println("INFO o knige " +
                            myBook.getName() + "AVTOR " +myBook.getAuthor() +
                        "YEAR PUBLIC " + myBook.getYearPublic());
                }
                else  if(obj instanceof  String){
                    System.out.println("knigu v biblioteku add " + obj);
                }

            }


        }

        System.out.println("beforeGetLoggingAdvice:логирование попытки получить книгу/журнал ");
        System.out.println("_____________________________________________________");
    }

}
