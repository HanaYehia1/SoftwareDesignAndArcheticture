package trial;

public class quarterReceipt extends landlineServiceProvider{

	@Override
	public String toString() {
		 String var="Quarter Receipt Landline";
         return var;
	}
	@Override
	public void createForm(form f) {
		dropDownField dp2 = new dropDownField();
		dropDownField dp1 = new dropDownField();
		f.Addfields(dp2);
		f.Addfields(dp1);
		System.out.println("2 drop down");


}
	
}
