package trial;

public class weMS extends mobileServiceProvider{



	public weMS() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		 String var="We Mobile Recharge Service";
         return var;
	}

	@Override
	public void createForm(form f) {
		textField t1 = new textField();
		textField t2 = new textField();
		f.Addfields(t2);
		f.Addfields(t1);
		
	}

	

}
