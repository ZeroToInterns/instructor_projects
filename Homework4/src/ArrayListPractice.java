import java.util.ArrayList;

public class ArrayListPractice {
	
	public static void main(String[] args){
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Blue");
		myList.add("Yellow");
		myList.add("Red");
		myList.add("Green");
		myList.add("Purple");
		myList.add("Black");
		myList.add("Brown");
		myList.add("Green");
		myList.add("Rainbow");
		myList.add("Blue");
		
//		insertFirst(myList, "Black");
//		System.out.println(myList);
//		
//		addToSecondLast(myList, "Green");
//		System.out.println(myList);
		
//		System.out.println("Green appears this many times: " + countColors(myList, "Green"));
		
		replaceColor(myList, "Blue", "Orange");
		System.out.print(myList);
	}
	
	
	
	
	//inserts element at beginning of the array list
	public static void insertFirst(ArrayList<String> list, String color){
		list.add(0, color);
	}
	
	
	//adds to second to last position
	public static void addToSecondLast(ArrayList<String> list, String color){
		list.add(list.size()-1, color);
	} 
	
	
	//counts the number of times the color shows up in the list
	public static int countColors(ArrayList<String> colors, String color){
		int count =0;
		for(int i = 0; i < colors.size(); i++){
			if(colors.get(i).equals(color)){
				count++;
			}
		}
		return count;
	}
	
	
	//replaces all instances of the color in the list with the new color
	public static void replaceColor(ArrayList<String> colors, String color, String newColor){
		for(int i = 0; i < colors.size(); i++){
			if(colors.get(i).equals(color)){
				colors.set(i, newColor);
			}
		}
	}
}
