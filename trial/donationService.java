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

}
