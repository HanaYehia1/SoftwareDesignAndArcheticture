package trial;

import java.util.ArrayList;


public class overallDiscount extends paymentDecorator{

    payment pay= new cashOnDelivery();
	private admin ad=new admin();
	overallDiscount(payment pay) 
	{
		super(pay);
	}
	

	
	public double getDiscount()

    {
	  return ad.getdiscountpr("overall", " ");
	
    }
	public double addDiscount() 
	{
		
		return getDiscount()*service.getCost();
	}

	
}
