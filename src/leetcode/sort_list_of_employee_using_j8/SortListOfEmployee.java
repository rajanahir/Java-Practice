package leetcode.sort_list_of_employee_using_j8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortListOfEmployee {

    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(new Employee(1, "Rajan", "IT", 5000),
                new Employee(5, "Sandeep", "Admin", 2000),
                new Employee(2, "Kulwant", "Accounts", 3000),
                new Employee(3, "Sushil", "IT", 6000),
                new Employee(4, "Rajeev", "IT", 5000)
        );
        //Collections.sort(empList);
        //System.out.println(empList.toString());




        //**
        // Using Java 8
        // **//
        List<Employee> sortedEmpList = empList.stream().sorted((x,y) -> x.getSalary() - y.getSalary()).collect(Collectors.toList());
        System.out.println(sortedEmpList);
    }
}
