package evening;

public class Thermometer {
	
	private double temperature;
	
	public void raiseTemp(double currentTemp){
		while(currentTemp < 90){
			currentTemp++;
		}
		
		temperature = currentTemp;
	}
	
	public int divide(int num1, int num2){
		if(num2 != 0){
			return num1/num2;
		}
		else{
			return 0;
		}
		
	}
	
	
	public static void main(String[] args){
		Thermometer therm = new Thermometer();
		therm.raiseTemp(91);
	}
}
