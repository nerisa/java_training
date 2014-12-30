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
	/**
	 * performs simple calculations of two user entered numbers
	 * @author nerisa
	 * @param firstNumber operand of the operations
	 * @param secondNumber operand of the operations
	 */
	static Scanner userInput=new Scanner(System.in);
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
		try{
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
		}finally{
			choice.close();
		}
		
	}
	public static void add(){
		//Adds the user entered variables and displays the result
		double result=0.0;
		System.out.println("Enter the two nos to be added");
		try{
			firstNumber=Double.parseDouble(userInput.nextLine());
			secondNumber=Double.parseDouble(userInput.nextLine());
		}catch (NumberFormatException e){
			System.err.println("Expcetion while formatting number: "+ e.getMessage());
		}
		result=firstNumber+secondNumber;
		System.out.printf("Result= %f", result);
	}
	
	public static void subtract(){
		//subtracts the user entered variables and prints the result
		double result=0.0;
		try{
			System.out.println("Enter the minuend");
			firstNumber=Double.parseDouble(userInput.nextLine());
			System.out.println("Enter the subtrahend");
			secondNumber=Double.parseDouble(userInput.nextLine());
		}catch (NumberFormatException e){
			System.err.println("Expcetion while formatting number: "+ e.getMessage());
		}
		result=firstNumber-secondNumber;
		System.out.printf("Result= %f", result);
	}

	public static void multiply(){
		//Multiplies the user entered variables and displays the result
		double result=0.0;
		System.out.println("Enter the two nos to be multiplied");
		try{
			firstNumber=Double.parseDouble(userInput.nextLine());
			secondNumber=Double.parseDouble(userInput.nextLine());
		}catch (NumberFormatException e){
			System.err.println("Expcetion while formatting number: "+ e.getMessage());
		}
		result=firstNumber*secondNumber;
		System.out.printf("Result= %f", result);
	}
	
	public static void divide(){
		//computes dividend/divisor and prints the result 
		double result=0.0;
		do{
			try{
				System.out.println("\nEnter the dividend");
				firstNumber=Double.parseDouble(userInput.nextLine());
				System.out.println("Enter the divisor");
				secondNumber=Double.parseDouble(userInput.nextLine());
			}catch (NumberFormatException e){
				System.err.println("Expcetion while formatting number: "+ e.getMessage());
			}
			if(secondNumber==0){
				System.out.println("Divisor cannot be 0");
			}
		}while(secondNumber==0);
		result=firstNumber/secondNumber;
		System.out.printf("Result= %f", result);
		
	}
	
	public static void modulus(){
		//computes the remainder of dividend/divisor and prints the result
		double result=0.0;
		do{
			try{
				System.out.println("Enter the dividend");
				firstNumber=Double.parseDouble(userInput.nextLine());
				System.out.println("Enter the divisor");
				secondNumber=Double.parseDouble(userInput.nextLine());
			}catch (NumberFormatException e){
				System.err.println("Expcetion while formatting number: "+ e.getMessage());
			}
			if(secondNumber==0){
				System.out.println("Divisor cannot be 0");
			}
		}while(secondNumber==0);
		result=firstNumber%secondNumber;
		System.out.printf("Result= %f", result);
	}
}
