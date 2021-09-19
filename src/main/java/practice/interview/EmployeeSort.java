package main.java.practice.interview;

import main.java.practice.interview.model.Employee;
import main.java.practice.interview.model.EmployeeDao;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSort {

    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeDao.getEmployeeList();
        System.out.println("Without sort :"+employeeList);

        List<Employee> sortList = employeeList.stream().sorted((e1, e2) -> e1.getAge() - e2.getAge()).collect(Collectors.toList());
        sortList.forEach(e -> System.out.println(e.getName() + "-" + e.getAge()));

        System.out.println("Original List will remain unchange as we are using stream");
        employeeList.forEach(e -> System.out.println(e.getName() + "-" + e.getAge()));

        System.out.println("to change orginal copy don't use steam");
        employeeList.sort((e1, e2) -> e1.getAge() - e2.getAge());
        employeeList.forEach(e -> System.out.println(e.getName() + "-" + e.getAge()));


        String employeeNames = employeeList.stream().map(e -> e.getName()).collect(Collectors.joining(","));
        System.out.println("All names : "+employeeNames);

    }
}
