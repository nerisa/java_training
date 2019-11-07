package dec29;

/**
 * Finds the number of and sum of all integers greater than 100 and less than
 * 200 that are divisible by 7.
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
