package com.java8.practice.interview;

import com.java8.practice.interview.model.Employee;
import com.java8.practice.interview.model.EmployeeDao;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeGroupBy {

    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeDao.getEmployeeList();

        Employee e3=new Employee("Mary",24);
        employeeList.add(e3);

        Map<String, List<Employee>> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getName));
        collect.forEach((k,v) -> System.out.println(k + "-->"+v));

    }
}
