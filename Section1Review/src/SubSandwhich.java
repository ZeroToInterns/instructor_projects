
public class SubSandwhich {
	public static final int CHICKEN = 0;
	public static final int PASTRAMI = 1;
	public static final double COST_FOR_EXTRA_MEAT = 1.50;
	private int type;
	private int size;
	private boolean extraMeat;
	
	
	public SubSandwhich(int theType, int theSize, boolean extraMeat){
		//set the type of the sandwhich to chicken or pastrami
		if(theType != CHICKEN && theType != PASTRAMI){
			this.type = PASTRAMI;
		}
		else{
			this.type = theType;
		}
		
		//set the size of the sandwhich
		if(theSize != 6 && theSize != 12){
			this.size = 12;
		}
		else{
			this.size = theSize;
		}
		
		this.extraMeat = extraMeat;
	}
	
	public int getSize(){
		return this.size;
	}
	
	public void setSize(int newSize){
		this.size = newSize;
	}
	
	public boolean isExtraMeat(){
		return this.extraMeat;
	}
	
	public String getType(){
		if(this.type == CHICKEN){
			return "chicken";
		}
		else{
			return "pastrami";
		}
	}
	
	
	//returns the cost of the sandwhich
	public double getCost(){
		
		double price = 0.0;
		//if the sandwhich has extra meat, add 1.50 to the price
		if(this.isExtraMeat()){
			price = 1.50;
		}

		if(this.getSize() == 6){
			//if the size is 6 inches and type is chicken
			if(this.getType().equals("chicken")){
				return price + 5.50;
			}
			//if the size is 6 inches and type is pastrami
			else{
				return price + 6.95;			
			}
		}
		else{
			//if the size is 12 and type is chicken
			if(this.getType().equals("chicken")){
				return price + 8.95;
			}
			//if the size is 12 and type is pastrami
			else{
				return price + 9.50;
			}
		}
	}
}
