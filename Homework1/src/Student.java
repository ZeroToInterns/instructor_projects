
public class Student {
	private String name;
	private double GPA;
	
	public Student(String name, double GPA){
		this.name = name;
		this.GPA = GPA;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String newName){
		this.name = newName;
		System.out.println("The new name is " + newName);
	}
	
	public double getGPA(){
		return GPA;
	}
	
	public void changeGPA(double newGPA){
		this.GPA = newGPA;
		System.out.println("The new GPA is " + newGPA);
	}
	
	
	
}
