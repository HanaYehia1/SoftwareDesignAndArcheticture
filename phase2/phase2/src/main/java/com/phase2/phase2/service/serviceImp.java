package com.phase2.phase2.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.phase2.phase2.model.account;

@Service
public class serviceImp{

	public ArrayList<account> accounts=new ArrayList<>();

	  account acc=new account();
	  public Boolean signUp(String username,String email,String password) {

		  boolean check=false;
		  //if its the first user to sign up to the system
	    if(accounts.size()==0)
	    {
	        accounts.add(new account(username,email,password, 0));
	        acc=accounts.get(0);
	        return true;
	    }
	    else 
	    {
	    	//if user already exist in the system
	        for(int i=0;i<accounts.size();i++)
	        {
	        	
	            acc=accounts.get(i);
	          if(username.equalsIgnoreCase(acc.getuserName())||email.equalsIgnoreCase(acc.getemail()))
	          {
	        	  System.out.println(acc.getuserName()+" "+ acc.getemail()+" "+ acc.getWallet());
	              check=true;
	        	  break;
	          }
	          
	        }
	    }
	    //if its the first time the user will sign up
	    if(check==false)
	    {  	      
	        accounts.add(new account(username,email,password, 0));
	        System.out.println("registerd");
	        return true;
	    }
		return false;
	}

	  public boolean signIn(String email,String password)
	  {
		  if(accounts.size()==0)
	      {
	          System.out.println("user not found please sign up first");
        	  return false;  
	      }
		        for(int i=0;i<accounts.size();i++)
		        {
		            acc=accounts.get(i);
		          if(email.equalsIgnoreCase(acc.getemail()) && password.equalsIgnoreCase(acc.getpassword()))
		          {
		              System.out.println("You have successfully signed in ");
		        	  return true;  
		          }
		          else if(email.equalsIgnoreCase(acc.getemail()) || password.equalsIgnoreCase(acc.getpassword()))
		          {
		              System.out.println("The email or password you entered are incorrect");
		        	  return false;
		          }
		          
		        }
				return false;
	  }
}
