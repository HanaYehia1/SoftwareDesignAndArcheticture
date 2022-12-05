package trial;

public class transaction {
	public String num;
	public String amount;
	public service serviceName;
	 
	 public transaction(String num,String amount2, service serviceName)
	 {
		 this.num=num;
		 this.amount=amount2;
		 this.serviceName = serviceName;
	 }
	 
	 public transaction() {
		// TODO Auto-generated constructor stub
	}

	public String getTyepe()
	 {
		 return num;
	 }
	 public String getAmount()
	 {
		 return amount;
	 }
	 public service getService() {
		 return serviceName;
	 }//DANA KATBA 150 SATR MAIN W GAYEENN F DEEHHH
}
