package com.phase2.phase2.model;

import java.util.ArrayList;

import com.phase2.phase2.serviceproviders.etisalatMS;
import com.phase2.phase2.serviceproviders.mobileServiceProvider;
import com.phase2.phase2.serviceproviders.orangeMS;
import com.phase2.phase2.serviceproviders.vodafoneM;
import com.phase2.phase2.serviceproviders.weMS;


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
		public String toString() {
			String var=" Mobile Recharge Service ";
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
