package trial;



public class account {

	   String userName;
	   String password;
	   String email;
	   double wallet ;

	  
	   public account(String userName,String email,String password, double wallet)
	   {
		   this.userName=userName;
		   this.email=email;
		   this.password=password;
		   this.wallet = wallet;
		   
	   }
	   public account() {}
	   public account(String email,String password)
	   {
		   this.email=email;
		   this.password=password;
	   }
	public void setuserName(String userName)
	   {
		   this.userName=userName;
	   }
	   public void setpassword(String password)
	   {
		   this.password=password;
	   }
	   public void setemail(String email)
	   {
		   this.email=email;
	   }
	   public String getuserName()
	   {
		   return userName;
	   }
	   public String getpassword()
	   {
		   return password;
	   }
	   public String getemail()
	   {
		   return email;
	   }
	   
	   public void setWallet(double wallet) {
	   this.wallet = wallet;
	   }
	   public double getWallet() {
		   return wallet;
	   }

}
