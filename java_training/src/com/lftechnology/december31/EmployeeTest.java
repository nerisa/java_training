package com.lftechnology.december31;

/**
 * Write a test application named EmployeeTest that demonstrates class
 * Employee's capabilities. Create two Employee objects and display each
 * object's yearly salary. Then give each Employee a 10% raise and display each
 * Employee's yearly salary again.
 * 
 * @author nerisa
 * 
 */
public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee("Hari", "Bahadur", 100);
		Employee e2 = new Employee("Sita", "Thapa", 200);
		System.out.println("Current Salary:");
		System.out.println("Name:" + e1.getFirstName() + " Salary: Rs."
				+ e1.getSalary() * 12);
		System.out.println("Name:" + e2.getFirstName() + " Salary: Rs."
				+ e2.getSalary() * 12);
		e1.changeSalary(10);
		e2.changeSalary(10);
		System.out.println("Changed Salary:");
		System.out.println("Name:" + e1.getFirstName() + " Salary: Rs."
				+ e1.getSalary() * 12);
		System.out.println("Name:" + e2.getFirstName() + " Salary: Rs."
				+ e2.getSalary() * 12);

	}

}

/**
 * Create a class called Employee that includes three pieces of information as
 * instance variables a first name (type String), a last name (type String) and
 * a monthly salary (double). Your class should have a constructor that
 * initializes the three instance variables. Provide a set and a get method for
 * each instance variable.
 * 
 * @author nerisa
 * 
 */
class Employee {
	private String firstName = "";
	private String lastName = "";
	private double salary = 0.0;

	/**
	 * Sets all the instance variables
	 * 
	 * @param firstName
	 * @param lastName
	 * @param salary
	 */
	public Employee(String firstName, String lastName, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	/**
	 * Sets the firstName of the instance of Employee
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Sets the lstName of the instance of Employee
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Sets the salary of the instance of Employee
	 * 
	 * @param salary
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * @return the first name of the instance
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the last name of the instance
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return the salary of the instance
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * Changes the objects salary according to the given percentage
	 * 
	 * @param percentageIncrease
	 */
	public void changeSalary(float percentageIncrease) {
		double increasedSalary = salary + (double) salary * percentageIncrease
				/ 100;
		setSalary(increasedSalary);

	}
}
