/**Write a program that displays the temperatures from 0 degrees Celsius to 100 degrees Celsius 
 * and its Fahrenheit equivalent. 
 * Note that the conversion from Celsius to Fahrenheit uses the following formula: 
 * F = C * 9/5 + 32;
 * 
 */
package dec29;

/**
 * displays temperature in celcius from 0 to 100 and its fahrenheit equivalent
 * 
 * @author nerisa
 * 
 */
public class TemperatureDisplayer {
	public static void main(String[] args) {
		double celsius = 0.0;
		double fahrenheit = 0.0;
		do {
			fahrenheit = celsius * (9.0 / 5.0) + 32;
			// \u2103=degree celsius symbol \u2109=degree fahrenheit symbol
			System.out
					.printf("%.2f \u2103= %.2f \u2109\n", celsius, fahrenheit);
			celsius++;
		} while (celsius <= 100);

	}

}
