package main.java.practice.interview;

import main.java.practice.interview.model.Employee;
import main.java.practice.interview.model.EmployeeDao;

import java.util.List;
import java.util.Optional;

public class EmployeeCountWithAge {

    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeDao.getEmployeeList();

        long count = employeeList.stream().filter(e -> e.getAge() > 25).count();

        System.out.println("No. of Employees with age 25 : "+count);

        Optional<Employee> employee = employeeList.stream().filter(e -> e.getName().equals("Mary")).findAny();
        if(employee.isPresent()){
            System.out.println(employee.get().getName());
        }


    }
}
