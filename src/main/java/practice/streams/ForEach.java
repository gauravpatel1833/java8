package main.java.practice.streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEach {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Nayan","Gaurav","Deepesh","Pratik","Abhishek");

        //Print all names
        //list.stream().forEach(l -> System.out.println(l));

        //Print names with filter containing 'a'
        //list.stream().filter(l -> l.contains("a")).forEach( n->System.out.println(n));

        Map<Integer,String> map = new HashMap<>();

        map.put(1,"Gaurav");
        map.put(2,"Nayan");
        map.put(3,"Deepesh");
        map.put(4,"Pratik");

        /* Traditional foreach loop but to use pipeline method need to use stream
        map.forEach((k,v) -> {
            System.out.println( k+" : "+v);
        });*/


        //Simple looping over map using stream
        //map.entrySet().stream().forEach(obj -> System.out.println(obj.getKey()+" : "+obj.getValue()));

        //Looping over map with data filtering
        map.entrySet().stream().filter(o -> o.getKey()%2==0)
                .forEach(obj -> System.out.println(obj.getKey()+" : " + obj.getValue()));
    }
}
