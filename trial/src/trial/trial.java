package trial;

import java.util.ArrayList;
import java.util.Scanner;

public class trial {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		registration r=new registration();
		service mr = new mobileRechargeService();
		mobileServiceProvider ms = new etisalatMS();
		field f = new textField();
		ArrayList<transaction> t=new ArrayList<>();
		
		int choice;
				do
		{
		  System.out.println("Please choose 1.sign up  2.sign in  3.search for service");
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
		else
		{
			System.out.println("Invalid choice");
		}
		}
		while(choice!=5);
		}
        
	

}
