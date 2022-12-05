package trial;

public class transaction {
	public String type;
	public String amount;
	 service serviceName;
	 
	 public transaction(String type,String amount2)
	 {
		 this.type=type;
		 this.amount=amount2;
	 }
	 
	 public String getTyepe()
	 {
		 return type;
	 }
	 public String getAmount()
	 {
		 return amount;
	 }
	 public service getServiceName()
	 {
		 return serviceName;
	 }
}
