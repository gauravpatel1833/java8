package com.java8.practice.sorting.map;

import java.util.*;

public class TraditionalMapSort {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("gaurav",2);
        map.put("nayan",1);
        map.put("abhishek",3);

        List<Map.Entry<String,Integer>> entries = new ArrayList<>(map.entrySet());

       /* Java 6
       Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });*/

        //Java 8
        Collections.sort(entries,((o1, o2) -> o1.getValue()-o2.getValue()));

        System.out.println(entries);
    }
}
