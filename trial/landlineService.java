package trial;

import java.util.ArrayList;

public class landlineService extends service{

	public ArrayList<landlineServiceProvider> LSPlist=new ArrayList<>();
	private double cost;
	 
	  public landlineService(monthlyReceipt m,quarterReceipt q)
	  {
		  LSPlist.add(m);
		  LSPlist.add(q);
	  }
	  public ArrayList<landlineServiceProvider> printProviders()
	  {
		return LSPlist;  
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
