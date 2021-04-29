package spring_introduction;

public interface Pet {
    public default void say(){
        System.out.printf("Gow Gow");
    }
}
