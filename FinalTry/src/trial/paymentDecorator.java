package trial;

import java.util.ArrayList;

public class paymentDecorator extends payment
{
	//ArrayList<Double>specificDiscount=new ArrayList<>();
	//ArrayList<double>=new ArrayList<>();
	
	
	private payment wrappee;
	private double discount;
	paymentDecorator(payment dd)
	{
		this.wrappee = dd;
	}

	public double cost(service s) 
	{
		return s.getCost();	
	}
	public double addDiscount(double discount) {
		return this.discount = discount;
	}
	
}
