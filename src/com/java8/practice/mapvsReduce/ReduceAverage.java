package com.java8.practice.mapvsReduce;

import com.java8.practice.streams.practice.Employee;
import com.java8.practice.streams.practice.EmployeeDao;

import java.util.List;
import java.util.OptionalDouble;

public class ReduceAverage {

    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeDao.getEmployeeList();

        OptionalDouble average = employeeList.stream()
                .filter(e -> e.getDepartment().equals("IT"))
                .map(e -> e.getSalary())
                .mapToDouble(d -> d.doubleValue())
                .average();

        if(average.isPresent()){
            System.out.println("average salary of IT is :"+average.getAsDouble());
        }
    }
}
