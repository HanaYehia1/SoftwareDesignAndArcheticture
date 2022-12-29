package trial;

import java.util.ArrayList;

public class transaction {
	public double num;
	public double amount;
	public service serviceName;
	public String typetransaction;
	public ArrayList<String> user;
	 
	 public transaction(double num,double amount, service serviceName,String typetransaction,ArrayList<String> names)
	 {
		 this.num=num;
		 this.amount=amount;
		 this.serviceName = serviceName;
		 this.typetransaction = typetransaction;
		 this.user=names;
	 }
	 public transaction(double amount,service serviceName)
	 {
		this.amount=amount;
		this.serviceName=serviceName;
	 }
	 
	 public transaction() {
		// TODO Auto-generated constructor stub
	}
	 public String getTypetransaction()
	 {
		 return typetransaction;	 
     }

	public double getTyepe()
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
	 public ArrayList<String> getuser()
	 {
		 return user;
	 }
	
}
