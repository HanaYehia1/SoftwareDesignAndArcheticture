package trial;

import java.util.ArrayList;

public class transaction {
	public String num;
	public double amount;
	public service serviceName;
	public String typetransaction;
	public String user;
	 
	 public transaction(String num,double amount, service serviceName,String typetransaction,String user)
	 {
		 this.num=num;
		 this.amount=amount;
		 this.serviceName = serviceName;
		 this.typetransaction = typetransaction;
		 this.user=user;
	 }
	 
	 public transaction() {
		// TODO Auto-generated constructor stub
	}
	 public String getTypetransaction()
	 {
		 return typetransaction;	 
     }

	public String getTyepe()
	 {
		 return num;
	 }
	 public double getAmount()
	 {
		 return amount;
	 }
	 public service getService() {
		 return serviceName;
	 }
	 public String getuser()
	 {
		 return user;
	 }
}
