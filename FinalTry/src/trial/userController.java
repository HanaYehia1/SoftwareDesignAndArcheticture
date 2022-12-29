package trial;

import java.util.ArrayList;

public class userController {
	public ArrayList<account> accounts=new ArrayList<>();

	  account acc=new account();
	  public userController() {}

	  public boolean signUp(String username,String email,String password)
	  {
		  boolean check=false;
	    if(accounts.size()==0)
	    {
	        accounts.add(new account(username,email,password, 0));
	        acc=accounts.get(0);
	        return true;
	    }
	    else 
	    {
	        for(int i=0;i<accounts.size();i++)
	        {
	            acc=accounts.get(i);
	          if(username.equalsIgnoreCase(acc.getuserName())||email.equalsIgnoreCase(acc.getemail()))
	          {
	              check=true;
	        	  break;
	          }
	          
	        }
	    }
	    if(check==false)
	    {  	      
	              accounts.add(new account(username,email,password, 0));
	              System.out.println("registerd");
	              return true;
	    }
		return false;

	  }
	  
	  public boolean signIn(String username,String password)
	  {
		  if(accounts.size()==0)
	      {
	          System.out.println("user not found please sign up first");
        	  return false;  
	      }
		        for(int i=0;i<accounts.size();i++)
		        {
		            acc=accounts.get(i);
		          if(username.equalsIgnoreCase(acc.getuserName()) && password.equalsIgnoreCase(acc.getpassword()))
		          {
		              System.out.println("You have successfully signed in ");
		        	  return true;  
		          }
		          else if(username.equalsIgnoreCase(acc.getuserName()) || password.equalsIgnoreCase(acc.getpassword()))
		          {
		              System.out.println("The email or password you entered are incorrect");
		        	  return false;
		          }
		          
		        }
				return false;
	  }
	  public boolean addtowallet (String username,double amount,String cardnumber)
	  {
	      
	      if(accounts.size()==0)
	      {
	          System.out.println("user not found please sign up first");
	      }
	      for(int i=0;i<accounts.size();i++)
	      {
	          acc=accounts.get(i);
	          if(username.equalsIgnoreCase(acc.getuserName()))
	          {
	        	  checkcardnumber(cardnumber);
	          }

	      }
	      return false;
}
	 public boolean refundrequest(ArrayList<transaction> t, String username) {
		 if(t.size()==0)
		 {
			 System.out.println("No transaction has been made in system yet ");
			 return false;
		 }
		 else 
		 {
			 for(int i=0;i<t.size();i++)
			 {
				 if(t.get(i).getuser().get(i).equalsIgnoreCase(username)&&t.get(i).getTypetransaction().equalsIgnoreCase("payment"))
					 System.out.println(" mobile number= "+t.get(i).getTyepe()+" "+t.get(i).getService().toString()+" "+t.get(i).getTypetransaction() +" amount of transaction is"+ t.get(i).getAmount());
			 }
		 }
		 return true;
	 }
	 public boolean checkcardnumber(String cardN)
	 {
		 int count = 0;
	      for(int i = 0; i < cardN.length(); i++) {
	          if(cardN.charAt(i) != ' ')
	              count++;
	      } 
	      if(count==16) {
	    	  System.out.println("successful payment");
	    	  return true;
	    	  
	    	  }
	      
	      else {
	    	  System.out.println("wrong cardnumber, please re-enter cardnumber");
	    	  return false;
	 }
	 }
	 public double totalmoney(payment overall,payment specific, service serviceName,boolean check)
	 {
		 double discountvalue;
		 if(check==false) {
		 double overalldis=overall.cost(serviceName);
		 double specificdis=specific.cost(serviceName);
		 return discountvalue=overalldis-(serviceName.getCost()-specificdis);}
		 else 
		 {
			 payment spec=new specificDiscount(new creditCard());
			 return discountvalue=spec.cost(serviceName);
		 }
		 
	 }
}
