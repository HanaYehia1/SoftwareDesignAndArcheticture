package trial;

import java.util.ArrayList;


public class admin {
	
	ArrayList<Double>SDlist1=new ArrayList<>();
	ArrayList<String>SDlist2=new ArrayList<>();
	ArrayList<Double>overallList=new ArrayList<>();
	double value;
	public void addSpecificDiscount(double disvalue,String serviceName)
	{ 
		
	     SDlist1.add(disvalue);
	     SDlist2.add(serviceName);
	     System.out.println("discount added successfully ");
	     
	}
	public double addoverallDiscount(double disvalue)
	{ 
		System.out.println("discount added successfully ");
		return value=disvalue;
   
	}
public void displayDiscount()
{
	System.out.println("discounts on all services ="+overallList.toString());
	for(int i=0;i<SDlist1.size();i++)
	{
		System.out.println("specific discount Name"+SDlist2.toString()+"amount"+SDlist1.toString());
	}
}
public double getdiscountpr(String typediscount,String servicename)
{
	if(typediscount.equalsIgnoreCase("overall"))
	{
		return addoverallDiscount(10);
	}
	else if(typediscount.equalsIgnoreCase("specific"))
	{
		for(int i=0;i<SDlist2.size();i++)
		{
			if(SDlist2.get(i).equalsIgnoreCase(servicename))
				return SDlist1.get(i)%100;
		}
		
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
