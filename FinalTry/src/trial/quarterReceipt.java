package trial;

public class quarterReceipt extends landlineServiceProvider{

	@Override
	public String toString() {
		 String var="Quarter Receipt Landline";
         return var;
	}
	@Override
	public void createForm(form f,service serviceName,double number,double money) {
		dropDownField dp2 = new dropDownField();
		dropDownField dp1 = new dropDownField();
		f.Addfields(dp2);
		f.Addfields(dp1);
		f.getFields().get(0).execute(number);
		f.getFields().get(1).execute(money);
		serviceName.setCost(f.getFields().get(1).getInfo());
		


}
	
}
