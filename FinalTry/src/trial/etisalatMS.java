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
	public void createForm(form f) {
		textField t2 = new textField();
		dropDownField t1= new dropDownField();
		f.Addfields(t2);
		f.Addfields(t1);
		
	}
		
	}
		



