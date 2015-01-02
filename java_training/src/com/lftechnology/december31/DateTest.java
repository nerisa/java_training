package com.lftechnology.december31;

/**
 * Write a test application named DateTest that demonstrates class Date's
 * capabilities.
 * 
 * @author nerisa
 * 
 */
public class DateTest {

	public static void main(String[] args) {
		Date date = new Date(2, 1, 2015);
		date.displayDate();
		date.setDay(3);
		date.displayDate();
		date.setMonth(2);
		date.displayDate();
		date.setYear(2016);
		date.displayDate();

	}

}

/**
 * Create a class called Date that includes three pieces of information as
 * instance variables a month (type int), a day (type int) and a year (type
 * int). Your class should have a constructor that initializes the three
 * instance variables and assumes that the values provided are correct. Provide
 * a set and a get method for each instance variable. Provide a method
 * displayDate that displays the month, day and year separated by forward
 * slashes (/).
 * 
 * @author nerisa
 * 
 */
class Date {
	private int day;
	private int month;
	private int year;

	/**
	 * Sets the instance variables
	 * 
	 * @param day
	 * @param month
	 * @param year
	 */
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;

	}

	/**
	 * Sets the instance variable day
	 * 
	 * @param day
	 */
	public void setDay(int day) {
		this.day = day;
	}

	/**
	 * Sets the instance variable month
	 * 
	 * @param month
	 */
	public void setMonth(int month) {
		this.month = month;
	}

	/**
	 * Sets the instance variable year
	 * 
	 * @param year
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the instance variable day
	 */
	public int getDay() {
		return day;
	}

	/**
	 * @return the instance variable month
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * @return the instance variable year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * Displays the Date in dd/mm/yy format
	 */
	public void displayDate() {
		System.out.println(day + "/" + month + "/" + year);
	}

}
