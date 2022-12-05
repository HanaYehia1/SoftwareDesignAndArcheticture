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

	public void createForm() {
		form f = new form();
		f.createForm();
	}

}