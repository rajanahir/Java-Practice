package core;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CoreConcepts {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, 9000000, "Rajan Ahir");
		Employee e2 = new Employee(2, 8000000, "Sushil Sharma");
		Employee e3 = new Employee(3, 7000000, "Kulwant Singh");
		Employee e4 = new Employee(4, 8000000, "Sandeep Dhanda");
		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);

		/******
		 * Converting Stream to Map *** The ArrayList of Employee Object with attribute
		 * id,salary and name is streamed to collect new Map (Key, Value) Key as
		 * Employee::id Value as Employee::salery
		 * 
		 **/

		Map<Integer, String> map = list.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));

		/**
		 * Find the employee from ArrayList<Employee> Object having maximum salary using
		 * steram.
		 * 
		 **/

		System.out.println(map);
	}
}

class Employee {
	public Employee(int i, int j, String string) {
		// TODO Auto-generated constructor stub
		this.id = i;
		this.salary = j;
		this.name = string;
	}

	public int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int salary;
	public String name;
}