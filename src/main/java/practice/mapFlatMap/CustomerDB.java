package main.java.practice.mapFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDB {

    public static List<Customer> getCustomerList(){
        return Stream.of(
                new Customer(101,"Gaurav","gpatel@gmail.com", Arrays.asList("12123323","44124234")),
                new Customer(102,"Nayan","Nayan@gmail.com", Arrays.asList("534214343","512313123")),
                new Customer(103,"Pratik","Pratik@gmail.com", Arrays.asList("6131323","6234243")),
                new Customer(104,"Deepesh","Deepesh@gmail.com", Arrays.asList("8345345345","72423424"))
        ).collect(Collectors.toList());
    }
}
