package trial;

public class wallet extends payment{

	public double cost() {
		service s1=new mobileRechargeService();
		service s2=new landlineService();
		service s3=new internetPaymentService();
	    service s4=new donationService();
		double value=0;
	    if(s1.getCost()!=0.0)
	    {  
	    	value = s1.getCost();
	    	 setdiscservice("mobile");
	    }
	    else if(s2.getCost()!=0)
	    {
	    	value = s2.getCost();
	    	setdiscservice("landline");
	    }
	    else if(s3.getCost()!=0)
	    {
	    	value = s3.getCost();
	    	setdiscservice("internet");
	    }
	    	
	    else if(s4.getCost()!=0)
	    {
	    	value = s4.getCost();
	    	setdiscservice("donations");
	    }
		if(s1.supportsCashOnDelivery()) {
			return value;
		}
		else {
			System.out.println("This service doesn't support wallet");
			return 0;
		}
	}
	}


