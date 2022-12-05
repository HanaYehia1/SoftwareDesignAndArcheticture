package trial;

import java.util.ArrayList;

public class usercontroller {
	public ArrayList<account> accounts=new ArrayList<>();

	  account acc=new account();
	  public usercontroller() {}

	  public void signUp(String username,String email,String password)
	  {
	    if(accounts.size()==0)
	    {
	        accounts.add(new account(username,email,password, 0));
	        acc=accounts.get(0);
//	        for(account acc:accounts)
//	        {
//	        System.out.println(acc.getuserName()+" "+acc.getemail()+" "+acc.getpassword()+" ");
//	        }
	    }
	    else 
	    {
	        for(int i=0;i<accounts.size();i++)
	        {
	            acc=accounts.get(i);
	          if(username.equalsIgnoreCase(acc.getuserName())||email.equalsIgnoreCase(acc.getemail()))
	          {
	              System.out.println("The username or email you entered are registered before");
	              break;
	          }
	          else
	          {
	              accounts.add(new account(username,email,password, 0));
	              
	              System.out.println("registerd");
//	              for(account acc:accounts)
//	              {
//	              System.out.println(acc.getuserName()+" "+acc.getemail()+" "+acc.getpassword()+" "+ acc.getWallet());
//	              }
	              break;

	          }
	        }
	    }

	  }
	  
	  public void signIn(String email,String password)
	  {
		        for(int i=0;i<accounts.size();i++)
		        {
		            acc=accounts.get(i);
		          if(email.equalsIgnoreCase(acc.getemail()) && password.equalsIgnoreCase(acc.getpassword()))
		          {
		              System.out.println("You have successfully signed in ");
		              break;
		          }
		          else if(email.equalsIgnoreCase(acc.getemail()) || password.equalsIgnoreCase(acc.getpassword()))
		          {
		              System.out.println("The email or password you entered are incorrect");
		              break;
		          }
		          else
		          {
		        	  System.out.println("User not found ,please sign up");
		          }
		        }  
	  }
	  public void addtowallet (String username,double amount,String cardnumber)
	  {
	      int count = 0;
	      for(int i = 0; i < cardnumber.length(); i++) {
	          if(cardnumber.charAt(i) != ' ')
	              count++;
	      } 
	      if(accounts.size()==0)
	      {
	          System.out.println("user not found please sign in first");
	      }
	      for(int i=0;i<accounts.size();i++)
	      {
	          acc=accounts.get(i);
	          if(username.equalsIgnoreCase(acc.getuserName()))
	          { if(count==16)
	              {
	                 acc.setWallet(amount+acc.getWallet());
	                 System.out.println("successful transfer ,wallet balance= "+acc.getWallet());
	                 break;
	              }
	          else {
	              System.out.println("wrong card number");
	              break;
	          }
	          }
	          else 
	          {

	              System.out.println("user not found please sign in first");
	          }


	      }
	  }
}
