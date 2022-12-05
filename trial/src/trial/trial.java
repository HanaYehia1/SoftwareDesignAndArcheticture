package trial;

import java.util.ArrayList;
import java.util.Scanner;

public class trial {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		usercontroller r=new usercontroller();
		service mr = new mobileRechargeService();
		mobileServiceProvider ms = new etisalatMS();
		field f = new textField();
		ArrayList<transaction> t=new ArrayList<>();
		
		int choice;
				do
		{
		  System.out.println("Please choose 1.sign up  2.sign in  3.search for service 5.add money from credit card to wallet 6.exit");
		  choice=sc.nextInt();

		if(choice==1) 
		{
		
		System.out.println("Please enter your username");
		String username=sc.next();
		System.out.println("Please enter your email");
		String email=sc.next();
		System.out.println("Please enter your password");
		String password=sc.next();
		r.signUp(username, email, password);
		
		}
		else if(choice==2)
		{
			System.out.println("Please enter your email");
			String email=sc.next();
			System.out.println("Please enter your password");
			String password=sc.next();
            r.signIn(email, password);
		}
		else if (choice==3)
		{
			System.out.println("Please enter the type of service");
	        String service=sc.next();
	        
	        serviceProducer s=new serviceProducer();
	        s.searchService(service);
		}
		else if(choice==4)
		{
			ms.createForm();
			ms.display();
			String mobileNum=sc.next();
			String amount = sc.next();
			t.add(new transaction(mobileNum,amount));
				System.out.println(t); //create(service , serviceprovider
		}
		else if (choice==5)
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
		else
		{
			System.out.println("Invalid choice");
		}
		}
		while(choice!=6);
		}
        
	

}
