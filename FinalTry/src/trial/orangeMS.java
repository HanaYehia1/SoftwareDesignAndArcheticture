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
	public void createForm(form f) {
		textField t2 = new textField();
		textField t1= new textField();
		f.Addfields(t2);
		f.Addfields(t1);
		
	
	}

	

}
