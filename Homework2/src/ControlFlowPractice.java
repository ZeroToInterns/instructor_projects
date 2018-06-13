
public class ControlFlowPractice{

	//calculates the cost based on the distance given
	public double calculateCost(double distance){
		if(distance >= 50 && distance <= 100){
			return 100.0;
		}
		else if(distance >= 25 && distance < 50){
			return 50.0;
		}
		else if(distance >= 0 && distance < 25){
			return 10.0;
		}
		else{
			return 0.0;
		}
	}
	
	//prints the value depending on the value given
	public void rollDice(int value){
		switch(value){
		case 1:
			System.out.println("The value rolled is : 1");
			break;
		case 2:
			System.out.println("The value rolled is : 2");
			break;
		case 3:
			System.out.println("The value rolled is : 3");
			break;
		case 4:
			System.out.println("The value rolled is : 4");
			break;
		case 5:
			System.out.println("The value rolled is : 5");
			break;
		case 6:
			System.out.println("The value rolled is : 6");
			break;
		default:
			System.out.println("Not a valid roll");
		}
	}
	
	public int findLetter(String letter, String word){
		//letter  = "O"
		//word = "Hello World"
		//count == 1
		int count = 0;
		
		for(int i = 0; i < word.length(); i++){
			
			if(word.substring(i, i+1).equals(letter)){
				if(count != 1){
					count++;
				}
				else{
					return i;
				}
			}
		}
		return 0;
	}
	
	
	
	
	
	
}
