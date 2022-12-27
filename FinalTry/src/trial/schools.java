package trial;

public class schools extends donationsServiceProvider{
	

	@Override
	public String toString() {
		String var="Schools";
		 return var;
	}

	@Override
	public void createForm(form f) 
	{
		textField t1 = new textField();
		textField t2 = new textField();
		f.Addfields(t1);
		f.Addfields(t2);
		
	}
	
}
