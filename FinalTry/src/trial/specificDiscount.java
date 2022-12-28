package trial;

public class specificDiscount extends paymentDecorator
{
	
	private admin ad=new admin();

	specificDiscount(payment pay) 
	{
		super(pay);
	}
	
	public double cost(service s) 
	{
		if(ad.getdiscountpr("specific",s)==1)
			return super.cost(s);
		else
			return ((100-ad.getdiscountpr("specific",s))/100)*super.cost(s);
			
	}
	
	
	
	
}
