
public class Circle {

	private double radius;
	
	public double computeArea(double radius){
		double pi = 3.14;
		double area = pi*radius*radius;
		return area;
	}
	
	public static void main(String[] args) {
		Circle circleOne = new Circle();
		
		circleOne.radius = 5.0;
		circleOne.computeArea(5);
		
		Circle circleTwo = new Circle();
		circleTwo.radius = 7.0;
		System.out.println(circleTwo.radius);
		
		Circle three = new Circle();
	}

	

}
