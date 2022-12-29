package trial;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class admin {
	ArrayList<transaction>refundList=new ArrayList<>();
	ArrayList<transaction>t=new ArrayList<transaction>();
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

public void usertransaction(String username) 
{
	for(int i=0;i<t.size();i++)
	{
		
		if(username.equalsIgnoreCase(t.get(i).getuser().get(i)))
		{
			
			if(t.get(i).getTypetransaction().equalsIgnoreCase("payment"))
			   System.out.println(" mobile number= "+t.get(i).getTyepe()+" "+t.get(i).getService().toString()+" "+t.get(i).getTypetransaction() +" amount of transaction is"+ t.get(i).getAmount());
			if(t.get(i).getTypetransaction().equalsIgnoreCase("add to wallet"))
				System.out.println(" "+t.get(i).getTypetransaction() +" amount of transaction is "+ t.get(i).getAmount());
				
		}
		
	}
}
public void createUsertransaction(int num,double amount, service serviceName,String typetransaction,ArrayList<String>names)
{
	if(t.size()==0)
	{
		
		t.add(new transaction(num,amount,serviceName,typetransaction,names));	
		
	}
	else
		for(int i=0;i<t.size();)
		{
			t.add(new transaction(num,amount,serviceName,typetransaction,names));
			break;
		}
	
}
public boolean checkRefundRequest(String name)
{
	for(int i=0;i<t.size();i++)
{
	if(name.equalsIgnoreCase(t.get(i).getuser().get(i)))
	{
      System.out.println(" "+t.get(i).getService().toString()+" " +" amount of transaction is"+ t.get(i).getAmount());
      return true;
	
	}
	
}
	System.out.println("You didn't make a transaction to make a refund!!!");
	return false;
	
}
public void applyRefundRequest(int index,String name)

{
	if(refundList.size()==0)
	{
		
		refundList.add(new transaction(t.get(index).getAmount(),t.get(index).getService()));
		
	}
	else
		for(int i=0;i<refundList.size();)
		{
			refundList.add(new transaction(t.get(index).getAmount(),t.get(index).getService()));
			break;
		}

	System.out.println("Request added succesfully ");
}

public void DisplayListOFrefunds()
{
	for(int i=0;i<refundList.size();i++)
	{
	System.out.println("Amount= "+refundList.get(i).getAmount()+" "+"service name"+refundList.get(i).getService().toString());
	}
	
}
public void AcceptRefund(int index)

{
	
}


}

