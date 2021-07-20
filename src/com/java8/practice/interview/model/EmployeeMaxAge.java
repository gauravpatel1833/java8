package com.java8.practice.interview.model;

import java.util.List;

public class EmployeeMaxAge {

    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeDao.getEmployeeList();
        Employee e = employeeList.stream().max((e1,e2) -> e1.getAge() - e2.getAge()).get();
        System.out.println(e.getAge());

        int maxAge = employeeList.stream().mapToInt(emp -> emp.getAge()).max().getAsInt();
        System.out.println("Max age :"+maxAge);
    }
}
