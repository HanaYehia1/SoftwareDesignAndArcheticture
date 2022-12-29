package trial;

public class orangeMS extends mobileServiceProvider{

	public orangeMS() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		 String var=" Orange Mobile Recharge Service";
         return var;
	}

	@Override
	public void createForm(form f,service serviceName,int number,double money) {
		textField t2 = new textField();
		dropDownField t1= new dropDownField();
		f.Addfields(t2);
		f.Addfields(t1);
		f.getFields().get(0).execute(number);
		f.getFields().get(1).execute(money);
		serviceName.setCost(f.getFields().get(1).getInfo());
		
	}

	

}
