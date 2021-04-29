package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NEwLoggingAspect {
        @Around("execution(public String returnBook())")
        public  Object returnBook(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
            System.out.println("RETURN BOOK ADVICE TRY");
            Object targetMethodResult = null;
            try {
                targetMethodResult = proceedingJoinPoint.proceed();
            } catch (Exception e){

                System.out.println("RETURN BOOK ADVICE CATCH EXCEPTIOMN " + e);
                throw e;
            }

            System.out.println("RETURN BOOK ADVICE SUCSSEFUL");

        return targetMethodResult;
        }
}
