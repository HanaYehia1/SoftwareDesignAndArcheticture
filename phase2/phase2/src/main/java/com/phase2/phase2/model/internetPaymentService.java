package com.phase2.phase2.model;

import java.util.ArrayList;

import com.phase2.phase2.serviceproviders.etisalatIS;
import com.phase2.phase2.serviceproviders.internetServiceProvider;
import com.phase2.phase2.serviceproviders.orangeIS;
import com.phase2.phase2.serviceproviders.vodafoneIS;
import com.phase2.phase2.serviceproviders.weIS;



public class internetPaymentService extends service{

	double cost;
	public ArrayList<internetServiceProvider> ISPlist=new ArrayList<>();
	 
	  public internetPaymentService(etisalatIS e2,vodafoneIS v2,orangeIS o2,weIS w2)
	  {
		  ISPlist.add(e2);
		  ISPlist.add(v2);
		  ISPlist.add(o2);
		  ISPlist.add(w2);
	  }
	  public internetPaymentService() {
		// TODO Auto-generated constructor stub
	}
	public ArrayList<internetServiceProvider> printProviders()
	  {
		return ISPlist;  
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
		String var=" Internet Payment Service ";
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
