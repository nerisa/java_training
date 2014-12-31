/**
 * 
 */
package dec29;

/**
 * finds the number and sum of multiples of 7 between 100 and 200
 * 
 * @author nerisa
 * 
 */
public class MultipleFinder {
	public static void main(String[] args) {
		int startingPoint = 100;
		int sum = 0;
		int count = 0;
		int divisor = 7;
		do {
			startingPoint++;
			if (startingPoint % divisor == 0) {
				sum = sum + startingPoint;
				count++;
			}
		} while (startingPoint < 200);
		System.out.printf("Sum= %d\n", sum);
		System.out.printf("Number of multiples= %d", count);
	}

}
