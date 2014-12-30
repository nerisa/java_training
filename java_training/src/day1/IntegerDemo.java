/** WAP called IntergerDemo which accepts int values beyond its range.
 *Try to print and see what exception the system throws. 
 */

package day1;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author nerisa
 *
 */

public class IntegerDemo {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int valueOutRange;
		System.out.println("Enter an integer out of its range");

		try {
			valueOutRange = userInput.nextInt();
			System.out.println(valueOutRange);
		} catch (InputMismatchException e) {
			System.out.println("Exception occured while providing input : "+e.getMessage());
		}finally{
			userInput.close();
		}

	}

}
