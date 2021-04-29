package aop;

import org.springframework.stereotype.Component;

@Component()

public class UniLibrary extends AbstractLibrary {

    public void getBook(){
        System.out.println("Берем книгу из UniLibrary");
        System.out.println("_____________________________________________________");

    }
    public void getMagazin(){
        System.out.println("Get Magazin");
        System.out.println("_____________________________________________________");
    }

    public String returnBook(){
        int a = 10/0;
        System.out.println("Вернули книгу в UniLibrary");
       return "VOINA MIR";
    }

    public void  returnMagazin(){
        System.out.println("VOZVRAT MAGAZIN  UniLibrary");
        System.out.println("_____________________________________________________");
    }

    public void addBook(String person_name,Book book ){
        System.out.println("Dobavili knigu  UniLibrary");
        System.out.println("_____________________________________________________");
    }

    public void addMagazin(){
        System.out.println("Dobavili MAGAZIN  UniLibrary");
    }
}
