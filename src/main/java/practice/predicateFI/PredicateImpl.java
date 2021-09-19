package main.java.practice.predicateFI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateImpl {

    //Predicate is a functional interface which is like test functionality true/false
    //It has a test method like conditional check which take input and return true or false ex: to check no is even/odd

    public static void main(String[] args) {

        Predicate<Integer> predicate = (num) -> {
            if(num % 2 == 0){
                return true;
            }else{
                return false;
            }
        };

        System.out.println("Number is even : "+predicate.test(4));

        Predicate<Integer> predicateOptimize = t -> t%2 == 0;
        System.out.println("Number is even : "+predicateOptimize.test(5));

        //In java 8 stream filter method use predicate to filter data.
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        list.stream().filter(t -> t%2==0).forEach(t -> System.out.println("Numbers:"+t));
    }
}
