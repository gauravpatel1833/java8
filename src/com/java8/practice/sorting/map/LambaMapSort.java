package com.java8.practice.sorting.map;

import java.util.*;

public class LambaMapSort {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("gaurav",2);
        map.put("nayan",1);
        map.put("abhishek",3);

        //Sort based on key
        //map.entrySet().stream().sorted((o1,o2) -> o1.getKey().compareTo(o2.getKey())).forEach(o -> System.out.println(o.getKey()));

        //map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

        //Sort based on value
        //map.entrySet().stream().sorted((o1,o2) -> o1.getValue() - o2.getValue()).forEach(o -> System.out.println(o));

        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
    }
}
