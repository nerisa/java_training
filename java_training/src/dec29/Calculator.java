/**Write a program using switch statement to develop a simple calculator for +, -, *, /, and % operators.
 * 
 */
package dec29;

import java.util.Scanner;

/**
 * @author nerisa
 *
 */
public class Calculator {
	static Scanner userInput1=new Scanner(System.in);
	static Scanner userInput2=new Scanner(System.in);
	static double firstNumber,secondNumber;
	public static void main(String[] args) {
		Scanner choice=new Scanner(System.in);
		String userChoice;
		System.out.println(	"1. Add\n"+
							"2. Subtract\n"+
							"3. Multiply\n"+
							"4. Divide\n"+
							"5. Remainder");
		System.out.println("Enter the required operation:");
		userChoice=choice.nextLine();
		switch(userChoice){
			case "1":  	add();
						break;
			case "2":	subtract();
						break;
			case "3":	multiply();
						break;
			case "4":	divide();
						break;
			case "5":	modulus();
						break;
			default:	System.out.println("Invalid choice");
						break;
			
		}
		choice.close();
		
	}
	public static void add(){
		double result=0.0;
		System.out.println("Enter the two nos to be added");
		try{
			firstNumber=Double.parseDouble(userInput1.nextLine());
			secondNumber=Double.parseDouble(userInput2.nextLine());
		}catch (NumberFormatException e){
			System.out.println("Invalid numbers");
		}
		result=firstNumber+secondNumber;
		System.out.printf("Result= %f", result);
	}
	
	public static void subtract(){
		double result=0.0;
		try{
			System.out.println("Enter the minuend");
			firstNumber=Double.parseDouble(userInput1.nextLine());
			System.out.println("Enter the subtrahend");
			secondNumber=Double.parseDouble(userInput2.nextLine());
		}catch (NumberFormatException e){
			System.out.println("Invalid numbers");
		}
		result=firstNumber-secondNumber;
		System.out.printf("Result= %f", result);
	}

	public static void multiply(){
		double result=0.0;
		System.out.println("Enter the two nos to be multiplied");
		try{
			firstNumber=Double.parseDouble(userInput1.nextLine());
			secondNumber=Double.parseDouble(userInput2.nextLine());
		}catch (NumberFormatException e){
			System.out.println("Invalid numbers");
		}
		result=firstNumber*secondNumber;
		System.out.printf("Result= %f", result);
	}
	
	public static void divide(){
		double result=0.0;
		try{
			System.out.println("Enter the dividend");
			firstNumber=Double.parseDouble(userInput1.nextLine());
			System.out.println("Enter the divisor");
			secondNumber=Double.parseDouble(userInput2.nextLine());
		}catch (NumberFormatException e){
			System.out.println("Invalid numbers");
		}
		result=firstNumber/secondNumber;
		System.out.printf("Result= %f", result);
		
	}
	
	public static void modulus(){
		double result=0.0;
		try{
			System.out.println("Enter the dividend");
			firstNumber=Double.parseDouble(userInput1.nextLine());
			System.out.println("Enter the divisor");
			secondNumber=Double.parseDouble(userInput2.nextLine());
		}catch (NumberFormatException e){
			System.out.println("Invalid numbers");
		}
		result=firstNumber%secondNumber;
		System.out.printf("Result= %f", result);
	}
}
