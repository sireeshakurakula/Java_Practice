package practice;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Employee1 employee = new Employee1();

		System.out.println("Enter name:");
		employee.setName(sc.next());

		System.out.println("Enter id:");
		employee.setId(sc.nextInt());

		System.out.println("Enter salary:");
		employee.setSalary(sc.nextDouble());
     
		System.out.println("Details---/n Name=" + employee.getName() +", Id=" + employee.getId() +", Salary=" + employee.getSalary());

	}

}
 
class Employee1 {
	private String name;
	private int id;
	private double salary;

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public double getSalary() {
		return salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}