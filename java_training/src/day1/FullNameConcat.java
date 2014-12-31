package day1;

import java.util.Scanner;

/**
 * WAP which gets 4 args from the console:initial,first name,middle name and
 * last name. Display the concatenated full name
 * 
 * @author nerisa
 */
public class FullNameConcat {
	public static void main(String[] args) {
		String salutation;
		String firstName;
		String middleName;
		String lastName;
		String choice = "y";
		String nameSeparater = " ";
		StringBuilder fullName = new StringBuilder();
		Scanner inputValue = new Scanner(System.in);
		do {
			System.out.println("Enter your salutation");
			salutation = inputValue.nextLine().trim();
			if (salutation.isEmpty()) {
				System.out.println("Salutation is a required field");
			}
		} while (salutation.isEmpty());
		fullName.append(salutation);
		fullName.append(nameSeparater);
		do {
			System.out.println("Enter your first name");
			firstName = inputValue.nextLine().trim();
			if (firstName.isEmpty()) {
				System.out.println("First name is a required field");
			}

		} while (firstName.isEmpty());
		fullName.append(firstName);
		fullName.append(nameSeparater);
		do {
			System.out.println("Enter your middle name");
			middleName = inputValue.nextLine().trim();
			if (middleName.isEmpty()) {
				System.out.println("Leave it empty?(y/n)");
				choice = inputValue.nextLine();
			}

		} while (choice.equalsIgnoreCase("n") && middleName.isEmpty());
		if (!middleName.isEmpty()) {
			fullName.append(middleName);
			fullName.append(nameSeparater);
		}
		do {
			System.out.println("Enter your last name");
			lastName = inputValue.nextLine().trim();
			fullName.append(lastName);
		} while (lastName.isEmpty());
		System.out.printf("Your full name is: %s", fullName);
		inputValue.close();

	}
}
