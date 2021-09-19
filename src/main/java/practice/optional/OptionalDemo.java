package main.java.practice.optional;

import main.java.practice.mapFlatMap.Customer;
import java.util.Arrays;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        Customer customer = new Customer(101,"Gaurav",null, Arrays.asList("12123323","44124234"));

        /* Optional has three methods
                  empty,
                  of,
                  ofnullable
        * */

        Optional<Object> empty = Optional.empty();
        System.out.println(empty);

        Optional<String> emailOf = Optional.of(customer.getEmail());
        //Will throw null pointer if email is null
        System.out.println(emailOf);

        Optional<String> emailOfNullable = Optional.ofNullable(customer.getEmail());
        //Will not throw any error even if email is null
        System.out.println(emailOfNullable);

        //Will throw null pointer as value of email was null
        //System.out.println(emailOfNullable.get());

        //Ideally we should check with ifpresent
        if(emailOfNullable.isPresent()){
            System.out.println(emailOfNullable.get());
        }
        {
            //If you want to return some default value if it is null
            System.out.println(emailOfNullable.orElse("defaultValue"));
        }

        //To throw an exception if null
        System.out.println(emailOfNullable.orElseThrow(() -> new IllegalArgumentException("email is null")));

        emailOfNullable.map(String::toUpperCase).orElseGet(() -> "value is empty");


    }
}
