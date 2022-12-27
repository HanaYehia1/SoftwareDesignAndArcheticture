package trial;

import java.util.ArrayList;


public class admin {
	
	ArrayList<Double>SDlist1=new ArrayList<>();
	ArrayList<String>SDlist2=new ArrayList<>();
	ArrayList<Double>overallList=new ArrayList<>();
	public void addSpecificDiscount(double disType,String serviceName)
	{ 
		
	     SDlist1.add(disType);
	     SDlist2.add(serviceName);
	     System.out.println("discount added successfully ");
	     
	}
	public void addoverallDiscount(double disType)
	{ 
		overallList.add(disType);
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
