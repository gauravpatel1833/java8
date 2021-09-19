package main.java.practice.interview;

import java.util.Arrays;
import java.util.OptionalDouble;

public class SquareAverage {


    /*Given a list of numbers, square them and filter the numbers which are greater 10000
    and then find average of them.( Java 8 APIs only)*/

    public static void main(String[] args) {
        Integer[] arr=new Integer[]{100,24,13,44,114,200,40,112};

        OptionalDouble average = Arrays.stream(arr)
                .mapToInt(s -> s * s)
                .filter(n -> n > 10000)
                .average();

        if(average.isPresent()){
            System.out.println("Average is :"+average.getAsDouble());
        }

    }
}
