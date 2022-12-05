package trial;

import java.util.ArrayList;
import java.util.Arrays;

public class admin {
	
	ArrayList<Double>SDlist1=new ArrayList<>();
	ArrayList<String>SDlist2=new ArrayList<>();//string
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

}
