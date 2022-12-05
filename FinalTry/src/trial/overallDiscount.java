package trial;

import java.util.Dictionary;

public class overallDiscount extends paymentDecorator{

	private service s;
	double discount=0.0;
	overallDiscount(payment dd) 
	{
		super(dd);
	}
	
	public double addDiscount(double discount) 
	{
		double value = s.getCost();
		return value * discount;
	}
	public double getOverallDiscount()

    {
	return discount;
	
    }
	public void setOverallDiscount(double discount)
	{
		this.discount=discount;
	}
	
}
