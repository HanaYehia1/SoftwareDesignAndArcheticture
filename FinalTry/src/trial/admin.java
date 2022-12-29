package trial;

import java.util.ArrayList;


public class admin {
	
	static ArrayList<Double>SDlist1=new ArrayList<>();
	static ArrayList<service>SDlist2=new ArrayList<>();
	static ArrayList<Double>overallList=new ArrayList<>();
	double value;
	public void addSpecificDiscount(double disvalue,service serviceName)
	{ 
		
	     SDlist1.add(disvalue);
	     SDlist2.add(serviceName);
	     System.out.println("discount added successfully ");
	     
	}
	public void addoverallDiscount(double disvalue)
	{ 
		overallList.add(disvalue);
		System.out.println("discount added successfully ");
		
   
	}
public void displayDiscount()
{
	System.out.println("discounts on all services ="+overallList.toString());
	for(int i=0;i<SDlist1.size();i++)
	{
		System.out.println("specific discount Name"+SDlist2.toString()+"amount"+SDlist1.toString());
	}
}
public double getdiscountpr(String typediscount,service servicename)
{
	if(typediscount.equalsIgnoreCase("overall"))
	{
		if(overallList.size()!=0)
		     return overallList.get(0);
	}
	else if(typediscount.equalsIgnoreCase("specific"))
	{
		if(overallList.size()!=0)
		{
		for(int i=0;i<1;i++)
		{
			
			if(SDlist2.get(i).getClass()==servicename.getClass())
			{
				return SDlist1.get(i);
		    }
			
			}}
		
	}
	return 1;
}

public void usertransaction(ArrayList<transaction> t, String username) {
	
	for(int i=0;i<t.size();i++)
	{
		
		if(username.equalsIgnoreCase(t.get(i).getuser()))
		{
			if(t.get(i).getTypetransaction().equalsIgnoreCase("payment"))
			   System.out.println(" mobile number= "+t.get(i).getTyepe()+" "+t.get(i).getService().toString()+" "+t.get(i).getTypetransaction() +" amount of transaction is"+ t.get(i).getAmount());
			if(t.get(i).getTypetransaction().equalsIgnoreCase("add to wallet"))
				System.out.println(" "+t.get(i).getTypetransaction() +" amount of transaction is "+ t.get(i).getAmount());
				
		}
		
	}
}


}
