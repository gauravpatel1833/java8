package main.java.practice.functionalInterface;

@FunctionalInterface
public interface Calculator {

    int sum(int a,int b);
    //String multiply(int a,int b);
    //Functional interface can have only one abstract method
    // but can have multiple default or static methods
}
