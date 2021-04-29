package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {


        System.out.println("METHOD START");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        University university = context.getBean("university", University.class);

        UniLibrary library = context.getBean("uniLibrary",UniLibrary.class);
        String bookName = library.returnBook();
        System.out.println("RETURN BOOK" + bookName);

        context.close();
        System.out.println("METHOD END");
    }
}
