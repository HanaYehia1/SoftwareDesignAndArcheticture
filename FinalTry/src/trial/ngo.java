package trial;

public class ngo extends donationsServiceProvider{

	@Override
	public String toString() {
		 String var="NGO'S (Non Profitable Organizations)";
         return var;
	}

	@Override
	public void createForm(form f) 
	{
		textField t1 = new textField();
		dropDownField dp1= new dropDownField();
		f.Addfields(t1);
		f.Addfields(dp1);
	}
	
}
