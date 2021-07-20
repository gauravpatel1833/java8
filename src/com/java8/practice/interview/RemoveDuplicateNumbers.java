package com.java8.practice.interview;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RemoveDuplicateNumbers {

    public static void main(String[] args) {
        Integer[] arr=new Integer[]{1,2,3,4,3,2,4,2};

        Set<Integer> collect = Arrays.stream(arr).collect(Collectors.toSet());
        collect.forEach(s -> System.out.println(s));

        System.out.println("Using distinct");

        Stream<Integer> distinct = Arrays.stream(arr).distinct();
        distinct.forEach(s -> System.out.println(s));

        ////Remove duplicates and list in decreasing order and find second max
        Arrays.stream(arr).distinct().sorted(Comparator.reverseOrder()).skip(1).limit(1).findFirst().get();

        //Remove duplicates and list in decreasing order
        List<Integer> collect1 = Arrays.stream(arr).distinct().sorted((i1, i2) -> i2.compareTo(i1)).collect(Collectors.toList());
        System.out.println(collect1);

        Integer secondMax = Arrays.stream(arr).distinct().sorted((i1, i2) -> i2.compareTo(i1)).skip(1).limit(1).findFirst().get();
        System.out.println("secondMax:"+secondMax);

    }
}
