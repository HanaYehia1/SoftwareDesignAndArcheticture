package trial;

import java.util.ArrayList;

public class etisalatMS extends mobileServiceProvider {

	public ArrayList<mobileServiceProvider> msp=new ArrayList<>();
	etisalatMS(){}
	@Override
	public String toString() {
		 String var="Etisalat Mobile Recharge Service";
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
		



