
public class SodaCan {
	private double radius;
	private double height;
	private double capacity;
	
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
		
	}
}
