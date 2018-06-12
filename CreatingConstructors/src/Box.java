
public class Box {
	
	private double length;
	private double width;
	private double height;
	
	
	//I want to create a Box
	public Box(double length, double width, double height){
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	//Constructor OVERLOADING
	public Box(double sideLength){
		this.length = sideLength;
		this.width = sideLength;
		this.height = sideLength;
	}

	public static void main(String[] args) {
		System.out.println("Hello welcome to my first program");

		Box firstBox = new Box(10);
		Box thirdBox = firstBox;
		
//		Box secondBox = new Box(10, 15, 20);
//		System.out.println(secondBox.getVolume());
		
		System.out.println(firstBox.equals(thirdBox));
	}
	
//	@Override
//	public boolean equals(Object obj){
//		return true;
//	}
	
	
	//non static length = 5, width = 5, height = 5
	public double getVolume(){
		double result = computeArea() *  this.height;
		return result;
	}
	
//	//static
//	public static double getVolume(double length, double width, double height){
//		double result = length * width * height;
//		return result;
//	}
	
	
	public double computeArea(){
		double result = this.length * this.width;
		return result;
	}
	
	
	//gets the length of the instance and returns it
	public double getLength(){
		return this.length;
	}
	
	//sets a new value for the instance's length
	public void setLength(double newLength){
		this.length = newLength;
	}
	
	public static double addTwoNumbers(double num1, double num2){
		double result = num1 + num2;
		return result;
	}
	
	
	
	
}