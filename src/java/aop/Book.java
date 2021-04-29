package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Comix")
    private String name;
    @Value("Dostaevski")
    private String author;
    @Value("1866")
    public int yearPublic;
    public String getName(){
        return name;

    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublic() {
        return yearPublic;
    }
}
