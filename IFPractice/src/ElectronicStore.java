
public class ElectronicStore {

	public static double getPrice(String item, boolean isDamaged){
		double price;
		if(item.equals("Macbook")){
			price = 1000.99;
		}
		else if(item.equals("Phone")){
			price = 899.9;
		}
		else if(item.equals("Charger")){
			price = 19.99;
		}
		else if(item.equals("IPad")){
			price = 699.99;
		}
		else if(item.equals("TV")){
			price = 2000.99;
		}
		else{
			price = 0;
		}
		
		if(isDamaged){
			price = price/2.0;
		}
		return price;
	}
}
