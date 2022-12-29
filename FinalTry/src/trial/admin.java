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
			if(t.get(i).getTypetransaction().equalsIgnoreCase("refund"))
				System.out.println(" "+t.get(i).getTypetransaction() +" amount of transaction is "+ t.get(i).getAmount());
				
		}
		
	}
}
public void createUsertransactionPay(int num,double amount, service serviceName,ArrayList<String>names)
{
	
	t.add(new transaction(num,amount,serviceName,"payment",names));	
	
}
public void createUsertransactionRefund(int num,double amount, service serviceName,ArrayList<String>names)
{
	
	t.add(new transaction(num,amount,serviceName,"refund",names));	
	
}
public void createUsertransactionWallet(int num,double amount, service serviceName,ArrayList<String>names)
{
	
	t.add(new transaction(num,amount,serviceName,"add to wallet",names));	
	
}
public boolean checkRefundRequest(String name)
{
	boolean checkRefundRequest=false;
	if(t.size()>0)
{
	for(int i=0;i<t.size();i++)
{
	if(name.equalsIgnoreCase(t.get(i).getuser().get(i)))
	{
      System.out.println(" index: "+i+" "+t.get(i).getService().toString()+"" +" amount of transaction is "+ t.get(i).getAmount()+t.get(i).getTypetransaction());
	
      checkRefundRequest=true;
	}
	
	
}
}
	

	if(checkRefundRequest==true)
	{
		return true;
	}
	System.out.println("You didn't make a transaction to make a refund!!!");
	return false;
		
	
}
public void applyRefundRequest(int index,String name)

{
	refundList.add(new transaction(t.get(index).getAmount(),t.get(index).getService(),"Waiting for acceptance", name,index));
	System.out.println("Request added succesfully ");
}

public void DisplayListOFrefunds()
{
	
	for(int i=0;i<refundList.size();i++)
	{
		if(refundList.get(i).getTypetransaction().equalsIgnoreCase("Waiting for acceptance"))
	    System.out.println("Amount= "+refundList.get(i).getAmount()+" "+"service name:"+refundList.get(i).getService().toString()+" index "+i);
	}
	
	
}
public void HandelRefundrequest(int index ,int choice)

{
	if(choice==1)
	{
		refundList.get(index).setTransactionStatus("accepted");
	}
	else
		refundList.get(index).setTransactionStatus("not accepted");
	
}



public void ShowListOfRefunds(String name)
{
	int counter=0;
	if(refundList.size()>0)
	{
		for(int i=0;i<refundList.size();i++)
		{
			if(name.equalsIgnoreCase(refundList.get(i).getUsernamr()))
			{
				System.out.println("refunds requests: "+" "+refundList.get(i).getAmount()+" Amount "+refundList.get(i).getService().toString()+ ", Status: "+refundList.get(i).getTypetransaction());
				counter++;
			}
			
		}
	}
	
	 if(refundList.size()==0&& counter==0)
		System.out.println("No refunds requests");
	
	 if(counter==0)
		System.out.println("No refunds requests");
		
}
}

