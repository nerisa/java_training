package com.lftechnology.december31;

/**
 * Main class that creates the object of Distance class
 * 
 * @author nerisa
 * 
 */
public class DistanceMain {
	public static void main(String[] args) {
		Distance distance1 = new Distance();
		Distance distance2 = new Distance();
		distance1.setData(2, 12.8f);
		distance2.setData(4, 8.5f);
		System.out.println("1st Distance= ");
		distance1.display();
		System.out.println("2nd Distance= ");
		distance2.display();
		distance1.addDistance(distance2);
		distance1.compareDistance(distance2);

	}

}

/**
 * Create a class called Distance that includes two private data members feet
 * (type int) and inches (type float). Use a method setData to set values to
 * instance variables. Provide a method display that displays the feet and
 * inches, a member function addDistance for adding two distances, and a member
 * function compareDistance for comparing two distances.
 * 
 * @author nerisa
 * 
 */
class Distance {
	private int feet;
	private float inches;

	/**
	 * Sets the private data members of the class
	 * 
	 * @param setFeet
	 * @param setInches
	 */
	public void setData(int feet, float inches) {
		if (inches >= 12) {
			this.feet = (int) inches / 12;
			this.inches = (float) inches - this.feet * 12;
			this.feet += feet;
		} else {
			this.inches = inches;
			this.feet = feet;
		}
	}

	/**
	 * @return the private data feet of the class
	 */
	public int getFeet() {
		return feet;
	}

	/**
	 * @return the private data inches of the class
	 */
	public float getInches() {
		return inches;
	}

	/**
	 * Displays the data of the object
	 */
	public void display() {
		System.out.println(feet + " feet " + inches + " inches ");
	}

	/**
	 * Adds two instances of the Distance class
	 * 
	 * @param d
	 *            Object to be added
	 */
	public void addDistance(Distance d) {
		int resultFeet = 0;
		float resultInches = 0;
		resultInches = inches + d.getInches();
		if (resultInches > 12) {
			resultFeet = (int) resultInches / 12;
			resultInches = resultInches - (float) resultFeet * 12;
		}
		System.out.println("Sum= " + (resultFeet + feet + d.getFeet())
				+ "feet " + resultInches + "inches");

	}

	/**
	 * Converts a given number to feet and inches
	 * 
	 * @param number
	 * @return Object of the Distance class that contains the converted Distance
	 */
	private Distance convertToDistance(float number) {
		Distance d = new Distance();
		int resultFeet = (int) number / 12;
		float resultInches = number - (float) resultFeet * 12;
		d.setData(resultFeet, resultInches);
		return d;
	}

	/**
	 * Compares two instances of Distance class
	 * 
	 * @param d
	 *            Distance to be compared
	 */
	public void compareDistance(Distance d) {
		if (inches == d.getInches() && feet == d.getFeet()) {
			System.out.println("Equal");
		} else {
			System.out.println("Not equal");
			float difference = Math.abs((inches + (float) feet * 12)
					- (d.getInches() + (float) d.getFeet() * 12));
			Distance diffDistance = convertToDistance(difference);
			System.out.println("Differnce= " + diffDistance.getFeet() + "feet "
					+ diffDistance.getInches() + "inches");
		}
	}
}
