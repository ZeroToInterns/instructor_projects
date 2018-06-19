import java.util.Scanner;

public class InputApplication {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a your favorite dessert: ");
		//store the favorite dessert in variable
		String favoriteDessert = in.nextLine();
		
		//print the last letter of the input
		System.out.println(favoriteDessert.substring(favoriteDessert.length()-1));
		
		System.out.print("Enter a double: ");
		double num1 = in.nextDouble();
		System.out.print("Enter an integer: ");
		int num2 = in.nextInt();
		
		//print the product as a double
		double product = num1 * num2;
		System.out.println(product);
		
		//print the product as an int
		int intProduct = (int) product;
		System.out.println(intProduct);
	}

}
