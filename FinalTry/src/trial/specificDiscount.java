package trial;

public class specificDiscount extends paymentDecorator
{

	payment pay;
	admin ad;

	specificDiscount(payment pay) 
	{
		super(pay);
	}

	public double addDiscount() {
		return ad.getdiscountpr("specific", pay.getdisservice());
		
	}
	public double getdiscount()
	{
		return addDiscount()*pay.cost() ;
		
	}
	
}
