package main.java.practice.interview;

import main.java.practice.interview.model.Employee;
import main.java.practice.interview.model.EmployeeDao;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeNameOfAge {

    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeDao.getEmployeeList();

        List<String> employeeNameList = employeeList.stream()
                .filter(e -> e.getAge() > 20)
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println("Employees with age > 20 are :"+employeeNameList);
        employeeNameList.forEach((n) -> System.out.println(n));

    }
}
