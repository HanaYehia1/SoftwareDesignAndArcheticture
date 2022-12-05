package trial;

import java.util.ArrayList;

public class mobileRechargeService extends service{
  public ArrayList<mobileServiceProvider> MSPlist=new ArrayList<>();
  private double cost;
 
  public mobileRechargeService(etisalatMS e,vodafoneM v,orangeMS o,weMS w)
  {
	  MSPlist.add(e);
	  MSPlist.add(v);
	  MSPlist.add(o);
	  MSPlist.add(w);
  }
  public mobileRechargeService() {
}
public ArrayList<mobileServiceProvider> printProviders()
  {
	return MSPlist;  
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
