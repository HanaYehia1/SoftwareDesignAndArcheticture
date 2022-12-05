package trial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class trial {

	public static void printMenu() {
		System.out.println("Please choose an option");
		System.out.println("1- Mobile Service Recharge");
		System.out.println("2- Internet Service Recharge");
		System.out.println("3- Landline Service Charge");
		System.out.println("4- Donations");

	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		admin adm=new admin();
		userController r=new userController();
		ArrayList<transaction>t=new ArrayList<>();
		transaction ta = new transaction();
		boolean output1=false;
		int choice2;
		int choice;
		do {
			System.out.println("if you are user press 1 , if you are admin press 2 , to exit press 3");
			choice2=sc.nextInt();
		if(choice2==1) {
		do
		{
		  System.out.println("Please choose 1.sign up  2.sign in  3.search for service 4. Add To your Wallet 5.Show discounts 6.Exit");
		  choice=sc.nextInt();
	   if(choice ==1 || choice ==2) {
		if(choice==1 ) 
		{
		
		System.out.println("Please enter your username");
		String username=sc.next();
		System.out.println("Please enter your email");
		String email=sc.next();
		System.out.println("Please enter your password");
		String password=sc.next();
		output1=r.signUp(username, email, password);
		
		}
		else if(choice==2)
		{
			System.out.println("Please enter your email");
			String email=sc.next();
			System.out.println("Please enter your password");
			String password=sc.next();
            output1 = r.signIn(email, password);
            
		}
		if(output1==true) {
		printMenu();
		int option = sc.nextInt();
		switch (option) {
		case 1:{
			serviceProducer s=new serviceProducer();
			String name = "mobile";
			System.out.println("Please choose the number of the service provider for your service");
			s.searchService(name);
			int serviceProviderNum = sc.nextInt();
			switch(serviceProviderNum) {
			case 1:{
				mobileServiceProvider ms = new etisalatMS();
				ms.createForm();
				ms.display();
				String mobileNum=sc.next();
				String amount = sc.next();
				service serviceName = new mobileRechargeService();
				t.add(new transaction(mobileNum,amount,serviceName));
				for( transaction ts:t) {
				System.out.println(ts.getTyepe()+" "+ts.getService().toString()+" "+ ts.getAmount());
				}
				break;
			}
			case 2:{
				mobileServiceProvider ms = new vodafoneM();
				ms.createForm();
				ms.display();
				String mobileNum=sc.next();
				String amount = sc.next();
				service serviceName = new mobileRechargeService();
				t.add(new transaction(mobileNum,amount,serviceName));
				for( transaction ts:t) {
					System.out.println(ts.getTyepe()+" "+ts.getService().toString()+" "+ ts.getAmount());
					}				break;
			}
			case 3:{
				mobileServiceProvider ms = new orangeMS();
				ms.createForm();
				ms.display();
				String mobileNum=sc.next();
				String amount = sc.next();
				service serviceName = new mobileRechargeService();
				t.add(new transaction(mobileNum,amount,serviceName));
				for( transaction ts:t) {
					System.out.println(ts.getTyepe()+" "+ts.getService().toString()+" "+ ts.getAmount());
					}
				break;
		    	}
			case 4:{
				mobileServiceProvider ms = new weMS();
				ms.createForm();
				ms.display();
				String mobileNum=sc.next();
				String amount = sc.next();
				service serviceName = new mobileRechargeService();
				t.add(new transaction(mobileNum,amount,serviceName));
				for( transaction ts:t) {
					System.out.println(ts.getTyepe()+" "+ts.getService().toString()+" "+ ts.getAmount());
					}
				break;
			   }
			}
			break;
		}
		case 2:{
			serviceProducer s=new serviceProducer();
			internetPaymentService sp = new internetPaymentService();
			String name = "internet";
			System.out.println("Please choose the number of the service provider for your service");
			s.searchService(name);
			int serviceProviderNum = sc.nextInt();
			switch(serviceProviderNum) {
			case 1:{          
				internetServiceProvider ms = new etisalatIS();
				ms.createForm();
				ms.display();
				String mobileNum=sc.next();
				String amount = sc.next();
				service serviceName = new internetPaymentService();
				t.add(new transaction(mobileNum,amount,serviceName));
				for( transaction ts:t) {
					System.out.println(ts.getTyepe()+" "+ts.getService().toString()+" "+ ts.getAmount());
					}
				break;
			}
			case 2:{
				internetServiceProvider ms = new vodafoneIS();
				ms.createForm();
				ms.display();
				String mobileNum=sc.next();
				String amount = sc.next();
				service serviceName = new internetPaymentService();
				t.add(new transaction(mobileNum,amount,serviceName));
				for( transaction ts:t) {
					System.out.println(ts.getTyepe()+" "+ts.getService().toString()+" "+ ts.getAmount());
					}				break;
			}
			case 3:{
				internetServiceProvider ms = new orangeIS();
				ms.createForm();
				ms.display();
				String mobileNum=sc.next();
				String amount = sc.next();
				service serviceName = new internetPaymentService();
				t.add(new transaction(mobileNum,amount,serviceName));
				for( transaction ts:t) {
					System.out.println(ts.getTyepe()+" "+ts.getService().toString()+" "+ ts.getAmount());
					}				break;
		    	}
			case 4:{
				internetServiceProvider ms = new weIS();
				ms.createForm();
				ms.display();
				String mobileNum=sc.next();
				String amount = sc.next();
				service serviceName = new internetPaymentService();
				t.add(new transaction(mobileNum,amount,serviceName));
				for( transaction ts:t) {
					System.out.println(ts.getTyepe()+" "+ts.getService().toString()+" "+ ts.getAmount());
					}
				break;
			   }
			}
			break;

		}case 3:{
			serviceProducer s=new serviceProducer();
			landlineService sp = new landlineService();
			String name = "landline";
			System.out.println("Please choose the number of the service provider for your service");
			s.searchService(name);
			int serviceProviderNum = sc.nextInt();
			switch(serviceProviderNum) {
			case 1:{
				landlineServiceProvider ms = new quarterReceipt();
				ms.createForm();
				ms.display();
				String mobileNum=sc.next();
				String amount = sc.next();
				service serviceName = new landlineService();
				t.add(new transaction(mobileNum,amount,serviceName));
				for( transaction ts:t) {
					System.out.println(ts.getTyepe()+" "+ts.getService().toString()+" "+ ts.getAmount());
					}
					break;
			}
			case 2:{
				landlineServiceProvider ms = new monthlyReceipt();
				ms.createForm();
				ms.display();
				String mobileNum=sc.next();
				String amount = sc.next();
				service serviceName = new landlineService();
				t.add(new transaction(mobileNum,amount,serviceName));
				for( transaction ts:t) {
					System.out.println(ts.getTyepe()+" "+ts.getService().toString()+" "+ ts.getAmount());
					}
					break;
		     	}
			}
			break;

		}case 4:{
			serviceProducer s=new serviceProducer();
			donationService sp = new donationService();
			String name = "donations";
			System.out.println("Please choose the number of the service provider for your service");
	 		s.searchService(name);
	 		int serviceProviderNum = sc.nextInt();
			switch(serviceProviderNum) {
			case 1:{
				donationsServiceProvider ms = new ngo();
				ms.createForm();
				ms.display();
				String mobileNum=sc.next();
				String amount = sc.next();
				service serviceName = new donationService();
				t.add(new transaction(mobileNum,amount,serviceName));
				for( transaction ts:t) {
					System.out.println(ts.getTyepe()+" "+ts.getService().toString()+" "+ ts.getAmount());
					}
					break;
			}
			case 2:{
				donationsServiceProvider ms = new schools();
				ms.createForm();
				ms.display();
				String mobileNum=sc.next();
				String amount = sc.next();
				service serviceName = new donationService();
				t.add(new transaction(mobileNum,amount,serviceName));
				for( transaction ts:t) {
					System.out.println(ts.getTyepe()+" "+ts.getService().toString()+" "+ ts.getAmount());
					}
					break;
			}
			case 3:{
				donationsServiceProvider ms = new ngo();
				ms.createForm();
				ms.display();
				String mobileNum=sc.next();
				String amount = sc.next();
				service serviceName = new donationService();
				t.add(new transaction(mobileNum,amount,serviceName));
				
					break;
		    	}
			}
	}
		}
	}
	   }
		else if (choice==3)
		{
			System.out.println("Please enter the type of service");
	        String service=sc.next();
	        
	        serviceProducer s=new serviceProducer();
	        s.searchService(service);
		}
	
		else if (choice==4)
		{
			System.out.println("Please enter your username");
            String email=sc.next();
            System.out.println("Please enter your cardnumber");
            String password=sc.next();
            System.out.println("Please enter amount of money you want to be added");
            double amount;
    		amount=sc.nextDouble();
            r.addtowallet(email,amount ,password);
		}
		else if(choice==5)
		{
			
			adm.displayDiscount();
		}
		else
		{
			System.out.println("Invalid choice");
		}
		}
				while(choice!=6);
	}
		else if(choice2==2)//do
		{
			int choice3;
			
			do
			{
				System.out.println("1.add discount 2.Exit");
				choice3=sc.nextInt();
				
				if(choice3==1)
				{
					
					System.out.println("for overall discount press 1 for specific discount press 2");
					int discountchoice;
					double amount;
					String serviceName;
					discountchoice=sc.nextInt();
					
					System.out.println("enter discount amount");
					amount=sc.nextDouble();
					if(discountchoice==1)
						{
						adm.addoverallDiscount(amount);
						}
					else
					{
						System.out.println("enter service name");
						serviceName=sc.next();
						adm.addSpecificDiscount(amount, serviceName);
					}
						
				}
				
				
			}	
				
			while(choice3!=2);
		}
		
	}
        
	while(choice2!=3);

}
}
