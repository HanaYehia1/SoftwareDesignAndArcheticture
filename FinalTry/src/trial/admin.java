package trial;


import java.util.ArrayList;


public class admin 
{
	// admin will take object from the sub class
	static ArrayList<transaction>refundList=new ArrayList<>();
	static ArrayList<transaction>t=new ArrayList<>();
	double value;
	public void addSpecificDiscount(double disvalue,int serviceName)
    { 

        if(serviceName==1) {
            service service = new mobileRechargeService();
        adminEntity.SDlist1.add(disvalue);
        adminEntity.SDlist2.add(service);}
        else if(serviceName==2) {
            service service = new internetPaymentService();
            adminEntity.SDlist1.add(disvalue);
            adminEntity.SDlist2.add(service);
            }
        else if(serviceName==3) {
            service service = new landlineService();
            adminEntity.SDlist1.add(disvalue);
            adminEntity.SDlist2.add(service);
            }
        else if(serviceName==4){
            service service = new donationService();
            adminEntity. SDlist1.add(disvalue);
            adminEntity.SDlist2.add(service);
            }

         System.out.println("discount added successfully ");

    }
	public void addoverallDiscount(double disvalue)
	{ 
		adminEntity.overallList.add(disvalue);
		System.out.println("discount added successfully ");
		
   
	}
public void displayDiscount()
{
	System.out.println("discounts on all services ="+adminEntity.overallList.toString());
	for(int i=0;i<adminEntity.SDlist1.size();i++)
	{
		System.out.println("specific discount Name"+adminEntity.SDlist2.toString()+"amount"+adminEntity.SDlist1.toString());
	}
}
public double getdiscountpr(String typediscount,service servicename)
{
	if(typediscount.equalsIgnoreCase("overall"))
	{
		if(adminEntity.overallList.size()!=0)
		     return adminEntity.overallList.get(0);
	}
	else if(typediscount.equalsIgnoreCase("specific"))
	{
		if(adminEntity.SDlist2.size()!=0)
		{
		for(int i=0;i<adminEntity.SDlist1.size() ;i++)
		{
			
			if(adminEntity.SDlist2.get(i).getClass()==servicename.getClass())
			{
				return adminEntity.SDlist1.get(i);
		    }
			
			}
		}
		
	}
	return 1;
}

public void usertransaction(String username) 
{
	System.out.println(t.size());
	for(int i=0;i<t.size();i++)
	{
		
		if(username.equalsIgnoreCase(t.get(i).getUsernamr()))
		{
			
			if(t.get(i).getTypetransaction().equalsIgnoreCase("payment"))
			   System.out.println(" mobile number= "+t.get(i).getTyepe()+" "+t.get(i).getService().toString()+" "+t.get(i).getTypetransaction() +" amount of transaction is"+ t.get(i).getAmount());
			if(t.get(i).getTypetransaction().equalsIgnoreCase("add to wallet"))
				System.out.println(" "+t.get(i).getTypetransaction() +" amount of transaction is "+ t.get(i).getAmount());
			
				
		}
		
	}
	ShowListOfRefunds(username);
}
public void createUsertransactionPay(int num,double amount, service serviceName,String names)
{
	
	t.add(new transaction(num,amount,serviceName,"payment",names));	
	
}

public void createUsertransactionWallet(int num,double amount, service serviceName,String names)
{
		
	t.add(new transaction(num,amount,null,"add to wallet",names));	
	
}
public boolean checkRefundRequest(String name)
{
	boolean checkRefundRequest=false;
	if(t.size()>0)
{
	for(int i=0;i<t.size();i++)
{
	if(name.equalsIgnoreCase(t.get(i).getUsernamr())&&t.get(i).getTypetransaction().equalsIgnoreCase("payment"))
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
	    System.out.println("Amount= "+refundList.get(i).getAmount()+" "+"service name:"+refundList.get(i).getService().toString()+" index"+i);
	}
	
	
}
public void HandelRefundrequest(int index ,int choice)

{
	if(refundList.size()>0){
	if(choice==1)
	{
		refundList.get(index).setTransactionStatus("accepted");
	}
	else
		refundList.get(index).setTransactionStatus("not accepted");
	
      }
	
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

