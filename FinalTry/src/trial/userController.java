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
	      int count = 0;
	      for(int i = 0; i < cardnumber.length(); i++) {
	          if(cardnumber.charAt(i) != ' ')
	              count++;
	      } 
	      if(accounts.size()==0)
	      {
	          System.out.println("user not found please sign up first");
	      }
	      for(int i=0;i<accounts.size();i++)
	      {
	          acc=accounts.get(i);
	          if(username.equalsIgnoreCase(acc.getuserName()))
	          { if(count==16)
	              {
	                 acc.setWallet(amount+acc.getWallet());
	                 System.out.println("successful transfer ,wallet balance= "+acc.getWallet());
	                 return true;
	                 
	              }
	          
	          else {
	              System.out.println("wrong card number");
	              return false;
	              
	          }
	          }
	         


	      }
	      return false;
}
	  
}
