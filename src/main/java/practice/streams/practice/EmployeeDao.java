package main.java.practice.streams.practice;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

    public static List<Employee> getEmployeeList(){

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(1,"Gaurav",600000,"IT"));
        employeeList.add(new Employee(2,"Deepesh",700000,"Cafe"));
        employeeList.add(new Employee(3,"Nayan",200000,"IT"));
        employeeList.add(new Employee(4,"Pratik",900000,"Core"));

        return employeeList;
    }
}
