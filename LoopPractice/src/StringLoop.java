
public class StringLoop {

	public void printHundred(){
		for(int i= 0; i <= 100; i++){
			System.out.println("The value is " + i);
		}
	}
	
	public void printEvens(){
		for(int i= 0; i <= 100; i += 2){
			System.out.println("The value is " + i);
		}
	}
	
	public void printOddss(){
		for(int i= 1; i <= 100; i += 2){
			System.out.println("The value is " + i);
		}
	}
	
	//using the loop count variable to find the substring
	public int countNumberOfO(String word){
		int count = 0;
		for(int i = 0; i < word.length(); i++){
			if(word.substring(i, i+1).equalsIgnoreCase("o")){
				count++;
			}
		}
		return count;
	}
	
	//using modified for loops to iterate over the entire string
	//error because string is not a subclass of Collection
//	public int countOs(String word){
//		int count = 0;
//		for(String firstLetter : word){
//			if(firstLetter.equalsIgnoreCase("o")){
//				count++;
//			}
//		}
//		return count;
//	}

	public void printPattern(String word){
		for(int i = 0; i < word.length(); i++){
			for(int j = 0; j < i+1; j++){
				String letter = word.substring(i, i+1);
				System.out.print(letter);
			}
			System.out.println("");
		}
	}


	public void printString(String word){
		try{
			for(int i = 0; i < word.length() +1 ; i++){
				System.out.print(word.substring(i, i+1));
			}
		}
		catch(IndexOutOfBoundsException exception){
			exception.printStackTrace();
		}

	}



}
