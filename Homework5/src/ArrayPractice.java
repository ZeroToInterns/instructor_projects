
public class ArrayPractice {

	private int[] list;
	
	public ArrayPractice(){		
		list = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	}
	
	
	public int sum(){
		int sum = 0;
		
		for(int i = 0; i < list.length; i++){
			sum += list[i];
		}
		
		return sum;
	}
	
	
	public double average(){

		double average = sum()/list.length;
		
		return average;
	}
	
	
	public int[][] create2DArray(int x, int y){
		int[][] myArray = new int[y][x];
		
		return myArray;
	}
	
	public int findMax(){
		int max = 0;
		for(int num : list){
			if(num > max){
				max = num;
			}
		}
		return max;
	}
	
	
	public int find2DMax(int[][] myArray){
		int max = 0;
		for(int i = 0; i < myArray.length; i++){
			for(int j= 0; j < myArray[i].length; j++){
				int value = myArray[i][j];
				
				if(value > max){
					max = value;
				}
			}
		}
		return max;
	}
	
	
}
