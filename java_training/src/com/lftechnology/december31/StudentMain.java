package com.lftechnology.december31;

/**
 * Main class
 * 
 * @author nerisa
 * 
 */
public class StudentMain {

	public static void main(String[] args) {
		Student[] student = new Student[5];
		student[0] = new Student("Ram", 3, "23",
				new int[] { 88, 56, 80, 90, 88 });
		student[1] = new Student("Shyam", 4, "23", new int[] { 88, 78, 80, 90,
				88 });
		student[2] = new Student("Hari", 5, "23", new int[] { 88, 56, 50, 90,
				88 });
		student[3] = new Student("Sita", 6, "23", new int[] { 88, 56, 80, 80,
				88 });
		student[4] = new Student("Gopal", 7, "23", new int[] { 88, 56, 80, 90,
				58 });
		for (int i = 0; i < student.length; i++) {
			student[i].displayData();
			System.out.println("\n");
		}

	}

}

/**
 * Write a program that calculates percentage and GPA of 5 studen ts. Each of
 * the students has following attributes: name, class, rollnum, and marks
 * obtained in 5 subjects.
 * 
 * @author nerisa
 * 
 */
class Student {
	private String name;
	private int grade;
	private String rollNum;
	private int marks[] = new int[5];

	public Student(String name, int grade, String rollNum, int[] marks) {
		this.name = name;
		this.grade = grade;
		this.rollNum = rollNum;
		for (int i = 0; i < marks.length; i++) {
			this.marks[i] = marks[i];
		}
	}

	/**
	 * Calculates the percentage
	 * 
	 * @return the calculated percentage
	 */
	public float calculatePercentage() {
		float sum = 0;
		for (int i = 0; i < marks.length; i++) {
			sum += marks[i];
		}
		return ((float) sum / marks.length);
	}

	/**
	 * Calculates the GPA
	 * 
	 * @return the calculate GPA
	 */
	public float calculateGPA() {
		return ((float) (calculatePercentage() / 100) * 4);
	}

	/**
	 * Displays all the data of a particular student
	 */
	public void displayData() {
		System.out.println("Name: " + name);
		System.out.println("Class: " + grade);
		System.out.println("Roll No: " + rollNum);
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Mark " + (i + 1) + "=" + marks[i]);
		}
		System.out.printf("Percentage:%.2f ", calculatePercentage());
		System.out.printf("GPA:%.1f", calculateGPA());
	}

}
