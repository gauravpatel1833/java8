package main.java.practice.mapFlatMap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

    /*Map is used when we one to just transform the data and has one to one mapping
    Flat Map is used when we one to transform + flattern the data and has one to many mapping
    Map -> one input return one return for transformation
    Flat Map -> one input has many return value for transformation

    Map change [a,b,c] to [A,B,C]
    Flat Map change [[1,2],[3,4],[5,6]] to [1,2,3,4,5,6]
    */
    public static void main(String[] args) {

        List<Customer> customerList = CustomerDB.getCustomerList();

        //Use to map to get list of emails from list of customer
        List<String> emailList = customerList.stream().map(c -> c.getEmail()).collect(Collectors.toList());
        System.out.println("Email list is :"+emailList);

        //When using only map it will return list of list for collection as it is not flattering
        List<List<String>> phoneNumberMapList = customerList.stream().map(c -> c.getPhoneNumbers()).collect(Collectors.toList());
        System.out.println("Simple Map transformation to get phone numbers:"+phoneNumberMapList);

        //When using flatmap for one to many relations and flatmap take input as steam of stream
        List<String> phoneNumberFlatMapList = customerList.stream().flatMap(c -> c.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println("Flat Map transformation to get phone numbers:"+phoneNumberFlatMapList);
    }
}
