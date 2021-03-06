import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your full name: ");
		String fullName = in.nextLine();
		
		//prints the first letter of the name
		System.out.println(fullName.substring(0, 1));
		
		//prints just the first name
		String firstName = fullName.substring(0, fullName.indexOf(" "));
		System.out.println(firstName);
		
		//print the rest of the name
		String lastName = fullName.substring(fullName.indexOf(" ") + 1);
		System.out.println(lastName);
		
		//print from index 4 to index 7 (3 characters)
		String name = fullName.substring(4, 7);
		System.out.println(name);
		in.close();
	}

}
