package trial;

import java.util.ArrayList;

public class donationService extends service{
	
	public ArrayList<donationsServiceProvider> DSPlist=new ArrayList<>();
	private double cost;
	 
	  public donationService(schools s,cancerHospitals c,ngo n)
	  {
		  DSPlist.add(s);
		  DSPlist.add(n);
		  DSPlist.add(c);
	  }
	  public donationService() {
		// TODO Auto-generated constructor stub
	}
	public ArrayList<donationsServiceProvider> printProviders()
	  {
		return DSPlist;  
	  }

	@Override
	public void setCost(double cost) {
		this.cost = cost;		
	}
	@Override
	public double getCost() {
		return cost;
	}
	public String toString() {
		String var=" Donation Service ";
		 return var;
	}
	public  boolean supportsCashOnDelivery(){
		boolean support=true; 
		if(support) {
			System.out.println("payments options 1-credit card ");
			return true;
		}
		else {
			System.out.println("payments options 1-credit card 2-wallet 3-cash on delivery");
			return false;
		}
	}
}
