package leetcode.sort_list_of_employee_using_j8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee  { //implements Comparable<Employee>
    private int id;
    private String name;
    private String department;
    private int salary;


//    @Override
//    public int compareTo(Employee o) {
//        return this.salary - o.getSalary();
//    }
}
