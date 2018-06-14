
public class ElectricCar {
	private int maxRange;
	private int currentRange;
	private String make;
	
	public ElectricCar(String theMake, int theMaxRange){
		this.make = theMake;
		this.maxRange = theMaxRange;
		this.currentRange = 0; //The car is uncharged when created
	}
	
	ElectricCar car = new ElectricCar("Tesla", 15);
	
	
	
	
	//charges the car to the maxRange
	public void charge(){
		this.currentRange = this.maxRange;
	}
	//reduces the currentRange by the distance specified
	public void drive(int miles){
		if(miles > this.currentRange){
			System.out.println("You don't have enough gas to go that far!");
		}
		else{
			this.currentRange -= miles;
		}
	}
	
	//gets the make of the car
	public String getMake(){
		return this.make;
	}
	
	//gets the currentRange
	public int getCurrentRange(){
		return this.currentRange;
	}
	
	//gets the max range
	public int getMaxRange(){
		return this.maxRange;
	}
}
