package com.phase2.phase2.model;

import java.util.ArrayList;

import com.phase2.phase2.serviceproviders.landlineServiceProvider;
import com.phase2.phase2.serviceproviders.monthlyReceipt;
import com.phase2.phase2.serviceproviders.quarterReceipt;

public class landlineService extends service{

	public ArrayList<landlineServiceProvider> LSPlist=new ArrayList<>();
	private double cost;
	 
	  public landlineService(monthlyReceipt m,quarterReceipt q)
	  {
		  LSPlist.add(m);
		  LSPlist.add(q);
	  }
	  public landlineService() {
		// TODO Auto-generated constructor stub
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
	public String toString() {
		String var=" Landline Service ";
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
