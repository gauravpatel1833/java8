package com.java8.practice.mapvsReduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceDemo {

    //Reduce is for aggregating multiple data to single value
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);

        //Traditional approach
        int sum = 0;
        for (Integer integer : list) {
            sum = sum + integer;
        }
        System.out.println(sum);


        //Using maptoint lambda
        int sum1 = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum1);

        //Using reduce functional programming
        Integer reduceSum = list.stream().reduce(0,(a,b) -> a+b);
        System.out.println(reduceSum);

        Optional<Integer> reduceSumWithMethodReference = list.stream().reduce(Integer::sum);
        System.out.println(reduceSumWithMethodReference.get());


        Integer integer = list.stream().reduce(Integer::max).get();
        System.out.println("Maximum value :"+integer);

        Integer reduceMax = list.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println("max is :"+reduceMax);

    }
}
