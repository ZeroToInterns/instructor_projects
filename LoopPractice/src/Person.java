
public class Person implements Comparable{

	private String name;
	private double GPA;
	public int age;
	
	
	
	@Override
	//create a compareTo method that compares people by age
	public int compareTo(Object o){
		Person otherPerson = (Person) o;
		if(this.GPA > otherPerson.GPA){
			return 1;
		}
		else if(this.GPA < otherPerson.GPA){
			return -1;
		}
		else{
			return 0;
		}
		
		//cast object to a person
		//if the intances gpa is less than the otherpersons gpa
			//print -1
		//if the intances gpa is more than the otherpersons gpa
			//print 1
		//else print 0
		
	}
	


//	@Override
//	public void speak() {
//		System.out.println("Hello my name is Michael");
//	}
}
