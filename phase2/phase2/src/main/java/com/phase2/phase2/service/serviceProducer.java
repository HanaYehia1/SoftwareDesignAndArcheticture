package com.phase2.phase2.service;

import java.util.ArrayList;
import com.phase2.phase2.model.donationService;
import com.phase2.phase2.model.internetPaymentService;
import com.phase2.phase2.model.landlineService;
import com.phase2.phase2.model.mobileRechargeService;
import com.phase2.phase2.serviceproviders.cancerHospitals;
import com.phase2.phase2.serviceproviders.etisalatIS;
import com.phase2.phase2.serviceproviders.etisalatMS;
import com.phase2.phase2.serviceproviders.monthlyReceipt;
import com.phase2.phase2.serviceproviders.orangeIS;
import com.phase2.phase2.serviceproviders.orangeMS;
import com.phase2.phase2.serviceproviders.quarterReceipt;
import com.phase2.phase2.serviceproviders.schools;
import com.phase2.phase2.serviceproviders.vodafoneIS;
import com.phase2.phase2.serviceproviders.vodafoneM;
import com.phase2.phase2.serviceproviders.weIS;
import com.phase2.phase2.serviceproviders.ngo;
import com.phase2.phase2.serviceproviders.weMS;

public class serviceProducer {


	monthlyReceipt monthly=new monthlyReceipt();
	quarterReceipt quarter =new quarterReceipt();
    landlineService landline=new landlineService(monthly,quarter);
    etisalatMS e=new etisalatMS();
    vodafoneM v=new vodafoneM();
    orangeMS o=new orangeMS();
    weMS w=new weMS();
    schools school=new schools();
    ngo ngo=new ngo();
    cancerHospitals cancer=new cancerHospitals();
    etisalatIS e2=new etisalatIS();
    vodafoneIS v2=new vodafoneIS();
    orangeIS o2=new orangeIS();
    weIS w2=new weIS();
    mobileRechargeService mobileR=new mobileRechargeService(e,v,o,w);
    internetPaymentService internet=new internetPaymentService(e2,v2,o2,w2);
    donationService donations =new donationService(school,cancer,ngo);
	public ArrayList<String> searchService(String s)
	{
		
		if(s.equalsIgnoreCase("mobile"))
        {
		   ArrayList<String> str=new ArrayList<>();
		   for(int i=0;i<mobileR.printProviders().size();i++)
		      {
			   str.add(mobileR.printProviders().get(i).toString());
                 
		      }
			return str;
        }
		if(s.equalsIgnoreCase("internet"))
		   {
			  ArrayList<String> str=new ArrayList<>();
			  for(int i=0;i<internet.printProviders().size();i++)
		      {
			   str.add(internet.printProviders().get(i).toString());
                 
		      }
			return str;
	        }
		if(s.equalsIgnoreCase("landline"))
        {
			  ArrayList<String> str=new ArrayList<>();
			  for(int i=0;i<landline.printProviders().size();i++)
		      {
			   str.add(landline.printProviders().get(i).toString());
               
		      }
			return str;
        }

        if(s.equalsIgnoreCase("donations"))
        {

			  ArrayList<String> str=new ArrayList<>();
			  for(int i=0;i<donations.printProviders().size();i++)
		      {
			   str.add(donations.printProviders().get(i).toString());
             
		      }
			return str;
        }
		return null;
	}
}
