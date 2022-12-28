package trial;


public class overallDiscount extends paymentDecorator{

	private admin ad=new admin();
	overallDiscount(payment pay) 
	{
		super(pay);
	}
	
	public double cost(service c) 
	{
		if(ad.getdiscountpr("overall",null)==1)
			return super.cost(c);
		else 
			return ((100-ad.getdiscountpr("overall",null))/100)*super.cost(c);
		
	}

	
}
