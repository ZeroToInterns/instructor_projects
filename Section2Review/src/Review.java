import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.TreeSet;

public class Review {

	public static void main(String[] args) {
//		int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		int[] result = reverseArray(myArray);
//		for(int i = 0; i < result.length; i++){
//			System.out.print(result[i] + " ");
//		}
		
		
		int[] myArray2 = {2, 4, 3, 4, 1, 2, 2};
		int[] result2 = removeDuplicate(myArray2);
		for(int i = 0; i < result2.length; i++){
			System.out.print(result2[i] + " ");
		}

	}
	
	public static int[] reverseArray(int[] list){
		Stack<Integer> myStack = new Stack<Integer>();
		int[] temp = new int[list.length];
		
		for(int i = 0; i < list.length; i++){
			myStack.push(list[i]);
		}
		
		for(int i = 0; i < list.length; i++){
			temp[i] = myStack.pop();
		}
		return temp;
	}
	
	public static int[] removeDuplicate(int[] list){
		TreeSet<Integer> mySet = new TreeSet<Integer>();
		List<Integer> temp = new ArrayList<Integer>();
		
		for(int i = 0; i <list.length; i++){
			if(mySet.add(list[i])){
				//we have not added this number yet
				temp.add(list[i]);
			}
		}
		
		int[] result = new int[temp.size()];
		for(int i = 0; i <temp.size(); i++){
			result[i] = temp.get(i);
		}
		
		return result;
		
	}

	
	
	
	
	public static int countMostFrequent(int[] list){
		int[] count = new int[50];
		
		for(int i = 0; i < list.length; i++){
			count[list[i]]++;
			count[i]++;
		}
		
		int max = 0;
		int result = 0;
		for(int i= 0; i < count.length; i++){
			if(count[i] > max){
				max = count[i];
				result = i;
			}
		}
		
		return result;
	}
	
	
	
}
