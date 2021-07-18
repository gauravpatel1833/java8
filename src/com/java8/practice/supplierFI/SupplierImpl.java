package com.java8.practice.supplierFI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierImpl {

    //Supplier is a functional Interface which don't accept any body but has return type
    //It has get Method
    //Use case :- In stream api when we use filter and we don't have any data in case
    //to return something or dummy data we use this supplier get() method

    public static void main(String[] args) {
        Supplier<String> supplier = () -> {
            return "Hello Gaurav";
        };

        Supplier<String> supplier2= () -> "Hello Gaurav";

        System.out.println(supplier.get());

        List<String> list = Arrays.asList();
        System.out.println(list.stream().findAny().orElseGet(supplier2));

        System.out.println(list.stream().findAny().orElseGet(() -> "Dummy"));
    }
}
