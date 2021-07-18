package com.java8.practice.functionalInterface;

public class CalculatorImpl {

    public static void main(String[] args) {

        //Functional interface is like an anonymous function with this lamba approach
        //we don't need to implement the interface
        Calculator calculator = (a,b) -> a+b;
        System.out.println(calculator.sum(1,5));
    }
}
