
public class Person {
	
	private static final int MY_CONSTANT = 123456789;
	//instance variables
	private static String name = "Michael";
	private static int age = 22;
	private static String hairColor = "Black";
	private static String eyeColor = "Black";
	private static double weight = 160;
	private static String height = "5'4";
	private static char gender = 'M';
	
	public Person(){
		System.out.println("Created a new person");
	}
	
	//main method
	public static void main(String[] args){
		Person myPerson = new Person();
		System.out.println("Hello my age is: " + (myPerson.age + 3));
		
		Person secondPerson = new Person();
	}
	
	//example of local variables and scope
	public void printVariables(){
		String myName = "Michael";
		System.out.println(myName);
		myName = "James";
		System.out.println(name);
	}
	
}
