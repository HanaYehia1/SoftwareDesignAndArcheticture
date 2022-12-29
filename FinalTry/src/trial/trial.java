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
		
		ArrayList<String>nameu=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		admin adm=new admin();
		//account acc=new account();
		userController r=new userController();
		//transaction ta = new transaction();
//		overallDiscount ds;
		boolean checkuser=false;
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
		  System.out.println("Please choose 1.sign up  2.pay service  3.search for service 4. Add To your Wallet 5.Show discounts 6.refund 7.show refunds status 8.Exit");
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
            if(nameu.size()>1) {
        		for(int i=0;i<nameu.size();i++)
        		{
        			if(nameu.get(i).equalsIgnoreCase(username))
        			{
        			
        				checkuser=true;
        				break;
        			}
        		}
        		}
           
           
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
				//de ghlat lazem mat-get-esh setted felmain b enha payment fa msh 3rfa han3mlha ezay mara payment wmara add to wallet wmanhothash felmain
				service serviceName = new mobileRechargeService();
				mobileServiceProvider ms = new etisalatMS();
				etisalatMS es= new etisalatMS();
				payment overall=new overallDiscount(new creditCard());
				payment spec=new specificDiscount(new creditCard());
				form f=new form();
				ms.display();
				int number=sc.nextInt();
				double amount=sc.nextDouble();
				es.createForm(f,serviceName,number,amount);
				adm.createUsertransactionPay( number, r.totalmoney(overall, spec, serviceName, checkuser), serviceName, nameu);
				//t.add(new transaction(f.getFields().get(0).getInfo(),r.totalmoney(overall, spec, serviceName, checkuser),serviceName,"payment",nameu.get(nameu.size()-1)));	
				System.out.println("enter cardnumber");
				while(true) 
				{
				String cardN=sc.next();
				if(r.checkcardnumber(cardN)==true)
					break;
				}
				break;
			}
			case 2:
			{
				String typeTran="payment";
				service serviceName = new mobileRechargeService();
				mobileServiceProvider ms = new vodafoneM();
				vodafoneM vf=new vodafoneM();
				form f=new form();
				ms.display();
				payment overall=new overallDiscount(new creditCard());
				payment spec=new specificDiscount(new creditCard());
				int number=sc.nextInt();
				double amount=sc.nextDouble();
				vf.createForm(f,serviceName,number,amount);
				vf.createForm(f,serviceName,number,amount);
				adm.createUsertransactionPay( number, r.totalmoney(overall, spec, serviceName, checkuser), serviceName, nameu);
				//t.add(new transaction(f.getFields().get(0).getInfo(),f.getFields().get(1).getInfo(),serviceName,"payment",nameu.get(nameu.size()-1)));		
				break;
				
			}
			case 3:{
				service serviceName = new mobileRechargeService();
				mobileServiceProvider ms = new orangeMS();
				form f=new form();
				orangeMS os=new orangeMS();
				ms.display();
				int number=sc.nextInt();
				double amount=sc.nextDouble();
				os.createForm(f,serviceName,number,amount);
				
				//t.add(new transaction(f.getFields().get(0).getInfo(),f.getFields().get(1).getInfo(),serviceName,"payment",nameu.get(nameu.size()-1)));
				break;
		    	}
			case 4:{
				mobileServiceProvider ms = new weMS();
				weMS wems=new weMS();
				form f=new form();
				service serviceName = new mobileRechargeService();
				ms.display();
				int number=sc.nextInt();
				double amount=sc.nextDouble();
				wems.createForm(f,serviceName,number,amount);
				
				//t.add(new transaction(f.getFields().get(0).getInfo(),f.getFields().get(1).getInfo(),serviceName,"payment",nameu.get(nameu.size()-1)));
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
				form f=new form();
				ms.display();
				double number=sc.nextDouble();
				double amount=sc.nextDouble();
				eis.createForm(f,serviceName,number,amount);
				
				//t.add(new transaction(f.getFields().get(0).getInfo(),f.getFields().get(1).getInfo(),serviceName,"payment",nameu.get(nameu.size()-1)));
				break;
			}
			case 2:{
				service serviceName = new internetPaymentService();
				internetServiceProvider ms = new vodafoneIS();
				vodafoneIS voIs=new vodafoneIS();
				form f=new form();
				ms.display();
				double number=sc.nextDouble();
				double amount=sc.nextDouble();
				voIs.createForm(f,serviceName,number,amount);
				
				//t.add(new transaction(f.getFields().get(0).getInfo(),f.getFields().get(1).getInfo(),serviceName,"payment",nameu.get(nameu.size()-1)));
				break;
			}
			case 3:{
				service serviceName = new internetPaymentService();
				internetServiceProvider ms = new orangeIS();
				orangeIS oIs=new orangeIS();
				form f=new form();
				ms.display();
				double number=sc.nextDouble();
				double amount=sc.nextDouble();
				oIs.createForm(f,serviceName,number,amount);
			
				
				//t.add(new transaction(f.getFields().get(0).getInfo(),f.getFields().get(1).getInfo(),serviceName,"payment",nameu.get(nameu.size()-1)));
				break;
		    	}
			case 4:{
				internetServiceProvider ms = new weIS();
				service serviceName = new internetPaymentService();
				weIS weis=new weIS();
				form f=new form();
				ms.display();
				double number=sc.nextDouble();
				double amount=sc.nextDouble();
				weis.createForm(f,serviceName,number,amount);
				
				//t.add(new transaction(f.getFields().get(0).getInfo(),f.getFields().get(1).getInfo(),serviceName,"payment",nameu.get(nameu.size()-1)));
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
				form f=new form();
				ms.display();
				double number=sc.nextDouble();
				double amount=sc.nextDouble();
				quartRec.createForm(f,serviceName,number,amount);
				
				//t.add(new transaction(f.getFields().get(0).getInfo(),f.getFields().get(1).getInfo(),serviceName,"payment",nameu.get(nameu.size()-1)));
					break;
			}
			case 2:{
				service serviceName = new landlineService();
				landlineServiceProvider ms = new monthlyReceipt();
				monthlyReceipt Mrec=new monthlyReceipt();
				form f=new form();
				ms.display();
				double number=sc.nextDouble();
				double amount=sc.nextDouble();
				Mrec.createForm(f,serviceName,number,amount);
				
				
				//t.add(new transaction(f.getFields().get(0).getInfo(),f.getFields().get(1).getInfo(),serviceName,"payment",nameu.get(nameu.size()-1)));
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
				form f=new form();
				ms.display();
				double number=sc.nextDouble();
				double amount=sc.nextDouble();
				N.createForm(f,serviceName,number,amount);
				
				//t.add(new transaction(f.getFields().get(0).getInfo(),f.getFields().get(1).getInfo(),serviceName,"payment",nameu.get(nameu.size()-1)));
					break;
			}
			case 2:{
				service serviceName = new donationService();
				donationsServiceProvider ms = new schools();
				schools sco=new schools();
				form f=new form();
				ms.display();
				double number=sc.nextDouble();
				double amount=sc.nextDouble();
				sco.createForm(f,serviceName,number,amount);
				
				
				//t.add(new transaction(f.getFields().get(0).getInfo(),f.getFields().get(1).getInfo(),serviceName,"payment",nameu.get(nameu.size()-1)));
					break;
			}
			case 3:{
				service serviceName = new donationService();
				donationsServiceProvider ms = new cancerHospitals();
				cancerHospitals cHosi=new cancerHospitals();
				form f=new form();
				ms.display();
				double number=sc.nextDouble();
				double amount=sc.nextDouble();
				cHosi.createForm(f,serviceName,number,amount);
			
				
				//t.add(new transaction(f.getFields().get(0).getInfo(),f.getFields().get(1).getInfo(),serviceName,"payment",nameu.get(nameu.size()-1)));
				
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
            	//t.add(new transaction(0,amount,serviceName ,"add to wallet",username));
	
            }
		}
		else if(choice==5)
		{
			
			adm.displayDiscount();
		}
		else if(choice==6)
		{
			
			System.out.println("Please enter your name");
			String gname = sc.next();
			
			if(adm.checkRefundRequest(gname)==true)//ana not sure elheta de to3tbar logic wla la keda bs mafesh ay setting aw keda da mograd calling l-functions
			{
				System.out.println("Enter index of transaction you want to have a refund request on (starting from 0)");
				int index=sc.nextInt();
				adm.applyRefundRequest(index, gname);
			
			}
			
			
		}
	   
		else if (choice ==7)
		{
			System.out.println("Please enter your name");
			String gname = sc.next();
			adm.ShowListOfRefunds(gname);
			
		}
		else
			System.out.println("Invalid choice");
			
		}
				while(choice!=8);
	}
		else if(choice2==2)//do
		{
			int choice3;
			
			do
			{
				System.out.println("1.add discount 2.list user transaction 3.show lists of refund requests 4.Exit");
				choice3=sc.nextInt();
				
				if(choice3==1)
				{
					
					System.out.println("for overall discount press 1 for specific discount press 2");
					int discountchoice;
					double amount;
					int serviceName;
					discountchoice=sc.nextInt();
					
					System.out.println("enter discount amount");
					amount=sc.nextDouble();
					if(discountchoice==1)
						{
						adm.addoverallDiscount(amount);
						}
					else
					{
						System.out.println("choose service type \n"+"1. Mobile Recharge Service \n"+"2. Internet Payment Service \n"+"3. Landline Service\n"+"4. Donation Service\n");
						serviceName=sc.nextInt();
						if(serviceName==1) {
							service service = new mobileRechargeService();
							adm.addSpecificDiscount(amount,service);}
						else if(serviceName==2) {
							service service = new internetPaymentService();
							adm.addSpecificDiscount(amount,service);}
						else if(serviceName==3) {
							service service = new landlineService();
							adm.addSpecificDiscount(amount, service);}
						else if(serviceName==4) {
							service service = new donationService();
							adm.addSpecificDiscount(amount, service);}
						
						
					}
					
						
				}
				else if(choice3==2)
				{
					System.out.println("Please enter your username");
		             username=sc.next();
					 adm.usertransaction(username);
					 
					
				}
				else if(choice3==3)
				{
					
					adm.DisplayListOFrefunds();
					System.out.println("enter 1 to accept requests and 2 to deny requests");
					int choice9=sc.nextInt();
					System.out.println("please enter the index of refund request you want to accept/deny : ");
					int Hindex=sc.nextInt();	
					adm.HandelRefundrequest(Hindex, choice9);
					
					
			    }
				
				
			}	
				
			while(choice3!=4);
		}
		
	}
        
	while(choice2!=3);

}
}
