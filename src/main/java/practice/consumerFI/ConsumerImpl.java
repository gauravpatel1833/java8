package main.java.practice.consumerFI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerImpl {

    //Consumer is a functional interface which accept body but doesn't have any return type
    //Consumer interface has accept method only
    //In stream api foreach accept only consumer functional interfaces

    public static void main(String[] args) {
        Consumer<Integer> consumer = t -> System.out.println("Print:"+t);
        consumer.accept(7);

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        list.stream().forEach(consumer);
        //or
        list.stream().forEach(t -> System.out.println("Printing:"+t));
    }
}
