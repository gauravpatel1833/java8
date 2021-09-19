package main.java.practice.optional;

import main.java.practice.mapFlatMap.Customer;
import main.java.practice.mapFlatMap.CustomerDB;

import java.util.List;

public class OptionalWithStream {

    public static void main(String[] args) {
        Customer customer = getCustomerByEmailId("gpatel@gmail.com");
    }

    private static Customer getCustomerByEmailId(String email) {
        List<Customer> customerList = CustomerDB.getCustomerList();
        return customerList.stream()
                            .filter( c -> email.equalsIgnoreCase(c.getEmail()))
                            .findAny()
                            .orElseThrow(() -> new IllegalArgumentException("no customer present with this email id"));
    }
}
