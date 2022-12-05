package trial;

import java.util.ArrayList;

public abstract class service 
{
	
	public abstract void setCost(double cost);
	public abstract double getCost();
	public  boolean supportsCashOnDelivery() {
		if(supportsCashOnDelivery()) {
			System.out.println("payments options 1-credit card 2-wallet 3-cash on delivery");
			return true;
		}
		else {
			System.out.println("payments options 1-credit card 2-wallet");
			return false;
		}
	}
	//ArrayList<Double>specificDiscount=new ArrayList<>();
	
}
