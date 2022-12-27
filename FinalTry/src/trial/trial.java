package trial;

import java.util.ArrayList;
import java.util.Scanner;

public class trial 
{

	public static void printMenu() {
		System.out.println("Please choose an service you want to pay for");
		System.out.println("1- Mobile Service Recharge");
		System.out.println("2- Internet Service Recharge");
		System.out.println("3- Landline Service Charge");
		System.out.println("4- Donations");
		System.out.println("If you wish to return to the menu press any number other than mentioned above ");

	}
	public static void main(String[] args) {
		form f=new form();
		ArrayList<String>nameu=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		admin adm=new admin();
		account acc=new account();
		userController r=new userController();
		ArrayList<transaction>t=new ArrayList<>();
		transaction ta = new transaction();
		boolean output1=false;
		String username;
		int choice2;
		int choice;
		do {
			System.out.println("if you are user press 1 , if you are admin press 2 , to exit press 3");
			choice2=sc.nextInt();
		if(choice2==1) {
		do
		{
		  System.out.println("Please choose 1.sign up  2.pay service  3.search for service 4. Add To your Wallet 5.Show discounts 6.Exit");
		  choice=sc.nextInt();
	   if(choice ==1 || choice ==2) {
		if(choice==1 ) 
		{
		
		System.out.println("Please enter your username");
		username=sc.next();
		System.out.println("Please enter your email");
		String email=sc.next();
		System.out.println("Please enter your password");
		String password=sc.next();
		output1=r.signUp(username, email, password);
		if(output1==true)
			nameu.add(username);
		else
			System.out.println("email or username already existed in system please choose enter another one ");
		
		
		}
		else if(choice==2)
		{
			System.out.println("Please enter your username");
			 username=sc.next();
			System.out.println("Please enter your password");
			String password=sc.next();
            output1 = r.signIn(username, password);
            if(output1==true)
    			nameu.add(username);
            else
            	System.out.println("user not found please sign up first");
           
           
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
				service serviceName = new mobileRechargeService();
				mobileServiceProvider ms = new etisalatMS();
				etisalatMS es= new etisalatMS();
				es.createForm(f);
				ms.display();
				for(int i=0;i<f.getFields().size();i++)
				{
					f.getFields().get(i).execute(sc.nextDouble());
				}
				t.add(new transaction(f.getFields().get(0).getInfo(),f.getFields().get(1).getInfo(),serviceName,"payment",nameu.get(nameu.size()-1)));	
				break;
			}
			case 2:
			{
				
				mobileServiceProvider ms = new vodafoneM();
				vodafoneM vf=new vodafoneM();
				vf.createForm(f);
				ms.display();
				service serviceName = new mobileRechargeService();
				for(int i=0;i<f.getFields().size();i++)
				{
					f.getFields().get(i).execute(sc.nextDouble());
				}
				for(int i=0;i<f.getFields().size();i++)
				{
					
					System.out.println(f.getFields().get(i).getInfo());
				}
				t.add(new transaction(f.getFields().get(0).getInfo(),f.getFields().get(1).getInfo(),serviceName,"payment",nameu.get(nameu.size()-1)));		
				break;
				
			}
			case 3:{
				service serviceName = new mobileRechargeService();
				mobileServiceProvider ms = new orangeMS();
				orangeMS os=new orangeMS();
				os.createForm(f);
				ms.display();
				for(int i=0;i<f.getFields().size();i++)
				{
					f.getFields().get(i).execute(sc.nextDouble());
				}
				t.add(new transaction(f.getFields().get(0).getInfo(),f.getFields().get(1).getInfo(),serviceName,"payment",nameu.get(nameu.size()-1)));
				break;
		    	}
			case 4:{
				mobileServiceProvider ms = new weMS();
				weMS wems=new weMS();
				wems.createForm(f);
				service serviceName = new mobileRechargeService();
				ms.display();
				for(int i=0;i<f.getFields().size();i++)
				{
					f.getFields().get(i).execute(sc.nextDouble());
				}
				t.add(new transaction(f.getFields().get(0).getInfo(),f.getFields().get(1).getInfo(),serviceName,"payment",nameu.get(nameu.size()-1)));
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
				service serviceName = new internetPaymentService();
				internetServiceProvider ms = new etisalatIS();
				etisalatIS eis=new etisalatIS();
				eis.createForm(f);
				ms.display();
				for(int i=0;i<f.getFields().size();i++)
				{
					f.getFields().get(i).execute(sc.nextDouble());
				}
				t.add(new transaction(f.getFields().get(0).getInfo(),f.getFields().get(1).getInfo(),serviceName,"payment",nameu.get(nameu.size()-1)));
				break;
			}
			case 2:{
				service serviceName = new internetPaymentService();
				internetServiceProvider ms = new vodafoneIS();
				vodafoneIS voIs=new vodafoneIS();
				voIs.createForm(f);
				ms.display();
				for(int i=0;i<f.getFields().size();i++)
				{
					f.getFields().get(i).execute(sc.nextDouble());
				}
				t.add(new transaction(f.getFields().get(0).getInfo(),f.getFields().get(1).getInfo(),serviceName,"payment",nameu.get(nameu.size()-1)));
				break;
			}
			case 3:{
				service serviceName = new internetPaymentService();
				internetServiceProvider ms = new orangeIS();
				orangeIS oIs=new orangeIS();
				oIs.createForm(f);
				ms.display();
				for(int i=0;i<f.getFields().size();i++)
				{
					f.getFields().get(i).execute(sc.nextDouble());
				}
				t.add(new transaction(f.getFields().get(0).getInfo(),f.getFields().get(1).getInfo(),serviceName,"payment",nameu.get(nameu.size()-1)));
				break;
		    	}
			case 4:{
				internetServiceProvider ms = new weIS();
				service serviceName = new internetPaymentService();
				weIS weis=new weIS();
				weis.createForm(f);
				ms.display();
				for(int i=0;i<f.getFields().size();i++)
				{
					f.getFields().get(i).execute(sc.nextDouble());
				}
				t.add(new transaction(f.getFields().get(0).getInfo(),f.getFields().get(1).getInfo(),serviceName,"payment",nameu.get(nameu.size()-1)));
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
				service serviceName = new landlineService();
				quarterReceipt quartRec=new quarterReceipt();
				quartRec.createForm(f);
				ms.display();
				for(int i=0;i<f.getFields().size();i++)
				{
					f.getFields().get(i).execute(sc.nextDouble());
				}
				t.add(new transaction(f.getFields().get(0).getInfo(),f.getFields().get(1).getInfo(),serviceName,"payment",nameu.get(nameu.size()-1)));
					break;
			}
			case 2:{
				service serviceName = new landlineService();
				landlineServiceProvider ms = new monthlyReceipt();
				monthlyReceipt Mrec=new monthlyReceipt();
				Mrec.createForm(f);
				ms.display();
				for(int i=0;i<f.getFields().size();i++)
				{
					f.getFields().get(i).execute(sc.nextDouble());
				}
				t.add(new transaction(f.getFields().get(0).getInfo(),f.getFields().get(1).getInfo(),serviceName,"payment",nameu.get(nameu.size()-1)));
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
				service serviceName = new donationService();
				donationsServiceProvider ms = new ngo();
				ngo N=new ngo();
				N.createForm(f);
				ms.display();
				for(int i=0;i<f.getFields().size();i++)
				{
					f.getFields().get(i).execute(sc.nextDouble());
				}
				t.add(new transaction(f.getFields().get(0).getInfo(),f.getFields().get(1).getInfo(),serviceName,"payment",nameu.get(nameu.size()-1)));
					break;
			}
			case 2:{
				service serviceName = new donationService();
				donationsServiceProvider ms = new schools();
				schools sco=new schools();
				sco.createForm(f);
				ms.display();
				for(int i=0;i<f.getFields().size();i++)
				{
					f.getFields().get(i).execute(sc.nextDouble());
				}
				t.add(new transaction(f.getFields().get(0).getInfo(),f.getFields().get(1).getInfo(),serviceName,"payment",nameu.get(nameu.size()-1)));
					break;
			}
			case 3:{
				service serviceName = new donationService();
				donationsServiceProvider ms = new cancerHospitals();
				cancerHospitals cHosi=new cancerHospitals();
				cHosi.createForm(f);
				ms.display();
				for(int i=0;i<f.getFields().size();i++)
				{
					f.getFields().get(i).execute(sc.nextDouble());
				}
				t.add(new transaction(f.getFields().get(0).getInfo(),f.getFields().get(1).getInfo(),serviceName,"payment",nameu.get(nameu.size()-1)));
				
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
			 service serviceName= null;
			System.out.println("Please enter your username");
              username=sc.next();
            System.out.println("Please enter your cardnumber");
            String password=sc.next();
            System.out.println("Please enter amount of money you want to be added");
            double amount;
    		amount=sc.nextDouble();
            
            if(r.addtowallet(username,amount ,password )==true)
            {
            	t.add(new transaction(0,amount,serviceName ,"add to wallet",username));
	
            }
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
				System.out.println("1.add discount 2.list user transaction 3.Exit");
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
				else if(choice3==2)
				{
					System.out.println("Please enter your username");
		             username=sc.next();
					adm.usertransaction(t, username);
					
				}
				
				
			}	
				
			while(choice3!=3);
		}
		
	}
        
	while(choice2!=3);

}
}
