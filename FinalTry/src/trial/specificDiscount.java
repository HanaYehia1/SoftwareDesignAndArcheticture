package trial;

public class specificDiscount extends paymentDecorator
{
	private service s;
	String service;
	double amount;

	specificDiscount(paymentDecorator dd) 
	{
		super(dd);
	}

	public double addDiscount(double discount) {
		double value = s.getCost();
		return value * discount;
	}
	public double getamount()
	{
		return amount ;
		
	}
	public String getservice()
	{
		return service ;
		
	}
}
