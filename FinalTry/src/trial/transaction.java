package trial;

import java.util.ArrayList;

public class transaction {
	public int num;
	public double amount;
	public service serviceName;
	public String typetransaction;
	public ArrayList<String> user;
	public String name;
	//public String status;
	 
	 public transaction(int num,double amount, service serviceName,String typetransaction,ArrayList<String> user)
	 {
		 this.num=num;
		 this.amount=amount;
		 this.serviceName = serviceName;
		 this.typetransaction = typetransaction;
		 this.user=user;
	 }
	 public transaction(double amount,service serviceName,String typetransaction,String name,int num)
	 {
		 this.name=name;
		this.amount=amount;
		this.serviceName=serviceName;
		this.typetransaction = typetransaction;
		this.num=num;
	 }
	 
	 public transaction() {
		// TODO Auto-generated constructor stub
	}
	 public void setTransactionStatus(String typetransaction )
	 {
		 this.typetransaction=typetransaction;
	 }
	 public String getTypetransaction()
	 {
		 return typetransaction;	 
     }

	public int getTyepe()
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
	public String getUsernamr()
	{
		return name;
	}
}
