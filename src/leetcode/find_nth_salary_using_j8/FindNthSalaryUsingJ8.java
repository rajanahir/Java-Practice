package leetcode.find_nth_salary_using_j8;

import leetcode.sort_list_of_employee_using_j8.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class FindNthSalaryUsingJ8 {

    public static void main(String[] args) {
        int nth = 2;
        List<Employee> empList = Arrays.asList(new Employee(1, "Rajan", "IT", 5000),
                new Employee(5, "Sandeep", "Admin", 2000),
                new Employee(2, "Kulwant", "Accounts", 3000),
                new Employee(3, "Sushil", "IT", 6000),
                new Employee(4, "Rajeev", "IT", 5000)
        );

        Integer salaies = empList.stream().sorted((x,y) -> y.getSalary() - x.getSalary())
                .map(Employee::getSalary).distinct().skip(2).findFirst().get();
        System.out.println(salaies);

        String[] a = {"abc", "def"};
        String[] b = a.clone();

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

     }

}
