package trial;

public class vodafoneM extends mobileServiceProvider{


	public vodafoneM() {
	}

	@Override
	public String toString() {
		 String var="Vodafone Mobile Recharge Service";
         return var;
	}

	@Override
	public void createForm(form f,service serviceName,double number,double money) {
		textField t2 = new textField();
		dropDownField t1= new dropDownField();
		f.Addfields(t2);
		f.Addfields(t1);
		f.getFields().get(0).execute(number);
		f.getFields().get(1).execute(money);
		serviceName.setCost(f.getFields().get(1).getInfo());
		
	}

}
