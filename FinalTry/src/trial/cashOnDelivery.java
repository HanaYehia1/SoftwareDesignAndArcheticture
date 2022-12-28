package trial;

public class cashOnDelivery extends payment{


	public double cost() {
		service s1=new mobileRechargeService();
		service s2=new landlineService();
		service s3=new internetPaymentService();
	    service s4=new donationService();
		double value=2;
	    if(s1.getCost()>0)
	    {  
	    	System.out.println(s1.getCost());
	    	 setdiscservice("mobile");
	    	  return  s1.getCost();
	    }
	    else if(s2.getCost()!=0)
	    {
	    	setdiscservice("landline");
	    	return value = s2.getCost();
	    }
	    else if(s3.getCost()!=0)
	    {
	    	setdiscservice("internet");
	    	return value = s3.getCost();
	    }
	    	
	    else if(s4.getCost()!=0)
	    {
	    	setdiscservice("donations");
	    	return value = s4.getCost();
	    }
		if(s1.supportsCashOnDelivery()) {
			return value;
		}
		else {
			System.out.println("This service doesn't support cash on delivery");
			return 0;
		}
	}
}
