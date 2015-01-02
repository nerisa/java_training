package com.lftechnology.december31;

/**
 * Main class
 * 
 * @author nerisa
 * 
 */
public class TimeMain {

	public static void main(String[] args) {
		Time time1 = new Time(300);
		Time time2 = new Time(2, 60, 60);
		time1.displayTime();
		time2.displayTime();
		Time addedTime = time1.addTime(time2);
		System.out.println("added time:");
		addedTime.displayTime();
	}

}

/**
 * Create a class called Time with three attributes hours, minutes, and seconds.
 * Use appropriate constructor (s) to initialize instance variables. Also, use a
 * display method to display the time in hh:mm:ss format. Modify the class to
 * add two time objects that correctly results in addition of times.
 * 
 * @author nerisa
 * 
 */
class Time {
	private int hours;
	private int minutes;
	private int seconds;

	/**
	 * Constructor to convert the seconds into instance variables
	 * 
	 * @param seconds
	 */
	public Time(int seconds) {
		if (seconds >= 60) {
			this.minutes = seconds / 60;
			if (this.minutes >= 60) {
				this.hours = this.minutes / 60;
				this.minutes = this.minutes % 60;
			}
			this.seconds = seconds % 60;
		} else {
			this.hours = 0;
			this.minutes = 0;
			this.seconds = seconds;
		}
	}

	/**
	 * Constructor to set the instance variables
	 * 
	 * @param hours
	 * @param minutes
	 * @param seconds
	 */
	public Time(int hours, int minutes, int seconds) {
		if (seconds >= 60) {
			this.minutes = minutes + seconds / 60;
			if (this.minutes >= 60) {
				this.hours = hours + this.minutes / 60;
				this.minutes = this.minutes % 60;
			}
			this.seconds = seconds % 60;
		} else {
			this.hours = hours;
			this.minutes = minutes;
			this.seconds = seconds;
		}
	}

	/**
	 * @return the hours variable of the object
	 */
	public int getHours() {
		return hours;
	}

	/**
	 * @return the minutes variable of the object
	 */
	public int getMinutes() {
		return minutes;
	}

	/**
	 * @return the seconds variable of the object
	 */
	public int getSeconds() {
		return seconds;
	}

	/**
	 * Adds two objects of the Time class
	 * 
	 * @param t
	 * @return
	 */
	public Time addTime(Time t) {
		int sum = seconds + t.getSeconds() + ((minutes + t.getMinutes()) * 60)
				+ ((hours + t.getHours()) * 60 * 60);
		return (new Time(sum));

	}

	/**
	 * Displays the instance variables in hh:mm:ss format
	 * 
	 */
	public void displayTime() {
		System.out.println(hours + ":" + minutes + ":" + seconds);
	}
}