/**WAP which gets 4 args from the console:initial,first name,middle name and last name.
 * Display the concatenated full name
 * 
 */
package day1;

import java.util.Scanner;

/**
 * @author nerisa
 *
 */
public class FullNameConcat {
	public static void main(String[] args){
		String salutation=new String();
		String firstName=new String();
		String middleName=new String();
		String lastName=new String();
		StringBuilder fullName=new StringBuilder();
		Scanner inputValue=new Scanner(System.in);
		do{
			System.out.println("Enter your salutation");
			salutation=inputValue.nextLine().trim();
			fullName.append(salutation);
		}while(salutation.isEmpty());
		fullName.append(' ');
		do{
			System.out.println("Enter your first name");
			firstName=inputValue.nextLine().trim();
			fullName.append(firstName);
		}while(firstName.isEmpty());
		fullName.append(' ');
		System.out.println("Enter your middle name");
		middleName=inputValue.nextLine().trim();
		if(!middleName.isEmpty()){
			fullName.append(middleName);
			fullName.append(' ');
		}
		do{
			System.out.println("Enter your last name");
			lastName=inputValue.nextLine().trim();
			fullName.append(lastName);
		}while(lastName.isEmpty());
		System.out.printf("Your full name is: %s",fullName);
		inputValue.close();
		
	}
}
