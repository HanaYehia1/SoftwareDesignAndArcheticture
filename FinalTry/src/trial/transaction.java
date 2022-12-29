package trial;



public class transaction {
	public int num;
	public double amount;
	public service serviceName;
	public String typetransaction;
	public String name;

	 
	 public transaction(int num,double amount, service serviceName,String typetransaction,String name)
	 {
		 this.num=num;
		 this.amount=amount;
		 this.serviceName = serviceName;
		 this.typetransaction = typetransaction;
		 this.name=name;
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
	
	public String getUsernamr()
	{
		return name;
	}
}
