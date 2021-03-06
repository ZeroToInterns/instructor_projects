import java.util.HashSet;
import java.util.Scanner;

public class LoopFun {

	//Just for testing purposes
	public static void main(String[] args){
		LoopFun f = new LoopFun();
		System.out.println(f.getPermutationCount(8));
		System.out.println(f.removeDuplicates("seeped"));
//		System.out.println(f.removeDuplicatesHashSet("seeped"));
		System.out.println(f.largestPowerLessThan(15));
		System.out.println(f.largestPowerLessThan(8));
		System.out.println(f.largestPowerLessThan(0));
		System.out.println(f.largestPowerLessThan(2));
		
		System.out.println(f.sumSeries(3));
		System.out.println(f.sumOdd(5));
		
		System.out.println(f.product(3));
		System.out.println(f.getECount("hi my name is michael"));
	}
	
	//returns the total number of permutations of a given number n
	public int getPermutationCount(int n){
		if(n <= 0){
			return 0;
		}
		
		int numOfPermutations = 1;
		
		for(int i = 1; i <= n; i++){
			numOfPermutations = numOfPermutations * i;
		}
		return numOfPermutations;
	}
	
	
	//removes all duplicates from the parameter word
	public String removeDuplicates(String word){
		if(word.equals("")){
			throw new RuntimeException();
		}
		
		String result = "";
		//looping through the word and checking if my result string already has that letter in it
		for(int i = 0; i < word.length(); i++){
			String currentLetter = word.substring(i, i+1);
			if(!result.contains(currentLetter)){
				result = result + currentLetter;
			}
		}
		return result;
	}
	
	//removes duplicates using a hashset
	public String removeDuplicatesHashSet(String word){
		
		HashSet<String> set = new HashSet<String>();
		
		String result = "";
		
		for(int i = 0; i < word.length(); i++){
			String currentLetter = word.substring(i, i+1);
			if(set.add(currentLetter)){
				result += currentLetter;
			}
		}
		return result;
	}

	//calculates the sum of the first n numbers from the series starting from
	//the number two and decreasing by half every step
	public double sumSeries(int n){
		
		double startingNum = 2;
		double result = 0;
		
		
		for(int i = 0; i < n; i++){
			result += startingNum;
			startingNum = startingNum/2;
		}
		
		
		return result;
	}
	
	
//	Alternate solution
//	public double sumSeries(int n){
//		double result = 0;
//		int count = 0;
//		
//		for(int i = 2; count < n; i=i/2){
//			result += i;
//			count++;
//		}
//		return result;
//	}
	
	
	//Asks the user for input and returns the product of the ints
	public int product(int n){
		Scanner in = new Scanner(System.in);
		if(n == 0){
			return 0;
		}
		if(n < 0){
			return -1;
		}
		
		int product = 1;
		for(int i = 1; i <= n; i++){
			System.out.print("Enter integer " + i + ": ");
			product = product * in.nextInt();
		}
		
		return product;
	}
	
	
	//returns the largest power of 2 that gives a value less than parameter
	public int largestPowerLessThan(int value){
		if(value == 0 || value == 1){
			return -1;
		}
		
		for(int i = 0; i < value; i++){
			if(value <= (int) Math.pow(2, i)){
				return i - 1;
			}
		}
		//will never get here
		return 0;
	}
	
//	//calculate the sum of all odd numbers less than the value given
//	public int sumOdd(int value){
//		
//		int sum = 0;
//		
//		for(int i = 0; i < value; i++){
//			if(i%2 == 1 && i > 0){
//				sum += i;
//			}
//		}
//		return sum;
//	}
	
//	alternate method using for loop 
	public int sumOdd(int value){
		int sum = 0;
		
		for(int i = 1; i < value; i=i+2){
			sum += i;
		}
		return sum;
	}
	
	
	//gets the number of e or E in the word
	public int getECount(String word){
		int count = 0;
		for(int i = 0; i < word.length(); i++){
			String currentLetter = word.substring(i, i+1);
			if(currentLetter.equalsIgnoreCase("e")){
				count++;
			}
		}
		return count;
	}
}


