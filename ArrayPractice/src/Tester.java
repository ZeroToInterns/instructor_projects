
public class Tester {

	public static void main(String[] args){
		
		BattleShip game1 = new BattleShip();
		game1.printGrid();
		
		game1.placeFishingBoat(0, 1);
		game1.printGrid();
		
		
		game1.placeCarrierBoat(10, 10, "vertical");
		game1.printGrid();
	}
}
