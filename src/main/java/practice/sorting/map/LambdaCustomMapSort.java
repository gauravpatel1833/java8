package main.java.practice.sorting.map;

import main.java.practice.sorting.BookVO;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class LambdaCustomMapSort {

    public static void main(String[] args) {
        Map<BookVO,Integer> map = new HashMap<>();
        map.put(new BookVO(2,"Spring","Framework"),2);
        map.put(new BookVO(1,"Hibernate","Database"),1);
        map.put(new BookVO(3,"Java","Core Java"),3);

        //Sort on book name
        /*map.entrySet().stream()
                .sorted(((o1, o2) -> o1.getKey().getName().compareTo(o2.getKey().getName())))
                .forEach(System.out::println);*/

        //Sort on book id
        /*map.entrySet().stream()
                .sorted(((o1, o2) -> o1.getKey().getId() - o2.getKey().getId()))
                .forEach(System.out::println);*/

        //Sort on book id
        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(BookVO::getId))).forEach(System.out::println);

        //sort on book id descending
        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(BookVO::getId).reversed())).forEach(System.out::println);
    }
}
