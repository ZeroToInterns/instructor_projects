package evening;

public class StringLoop {

	//print the numbers 1 - 100
	public void printHundred(){
		for(int i = 1; i <= 100; i++){
			System.out.println("The value of i is: " + i);
		}
	}
	
	//prints the even numbers from 0 - 100
	public void printEvens(){
		for(int i = 0; i <= 100; i += 2){
			System.out.println("The even number is: " + i);
		}
	}
	
	//print the odds from 1 - 100
	public void printOdds(){
		for(int i = 1; i <= 100; i+=2){
			System.out.println("The odd number is: " + i);
		}
	}
	
	//printO method loops through a string and prints "Found O!" when it hits an O
//	public void printOs(String word){
//		//iterates by the letter
//		for(String letter : word){
//			if(letter.equalsIgnoreCase("o")){
//				System.out.println("Found O!");
//			}
//		}
//	}
	
	
	//create a method that takes in a string and print the pattern in this specific format
	//H
	//ee
	//lll
	//llll
	//ooooo
	//     
	//WWWWWWW
	//oooooooo
	public void printPattern(String word){
		for(int i = 0; i < word.length(); i++){
			for(int j = 0; j < i +1; j++){
				System.out.print(word.substring(i, i+1));
			}
			System.out.println("");
		}
	}
	
	
}
