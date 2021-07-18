package com.java8.practice.streams.practice;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {

    public static void main(String[] args) {

        List<Employee> employeeList = EmployeeDao.getEmployeeList();

        //Print employee names having salary > 3 lakh
        //employeeList.stream().filter(s -> s.getSalary()>300000).forEach(n -> System.out.println(n.getName()));

        List<Employee> taxEmployees = employeeList.stream().filter(s -> s.getSalary()>300000).collect(Collectors.toList());
        System.out.println(taxEmployees);

    }
}
