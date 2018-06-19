
public class SodaCan implements Comparable{
	private double radius;
	private double height;
	private double capacity;
	public static final double FLUID_OUNCES_CONVERSION = 0.554112554;
	
	public SodaCan(){
		this.radius = 1.12109;
		this.height = 4.704;
	}
	
	public SodaCan(double radius, double height){
		if(height < 0 || radius < 0){
			this.height = 4.704;
			this.radius = 1.12109;
		}
		else{
			this.radius = radius;
			this.height = height;
		}
		//caluculate volume
		double volume = Math.PI * radius * radius * height;
		
		//convert volume to fluid ounces and update capacity
		this.capacity = volume * FLUID_OUNCES_CONVERSION ;
	}
	
	//returns the radius of the soda can
	public double getRadius(){
		return this.radius;
	}
	
	//gets the height of the soda can
	public double getHeight(){
		return this.height;
	}
	
	//drinks a certain amount of soda from the capacity
	public void drink(double fluidOunces){
		if(this.capacity < fluidOunces){
			System.out.println("You don't have enough soda to drink that much!");
		}
		else{
			this.capacity -= fluidOunces;
		}
	}
	
	//returns the current capacity of soda in the can
	public double getContents(){
		return this.capacity;
	}

	@Override
	public int compareTo(Object o) {
		SodaCan otherSoda = (SodaCan) o;
		if(this.capacity > otherSoda.capacity){
			return 1;
		}
		else if(this.capacity < otherSoda.capacity){
			return -1;
		}
		else{
			return 0;
		}
	}
}
