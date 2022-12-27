package trial;

public class weIS extends internetServiceProvider{

	@Override
	public String toString() {
		 String var="We Internet Service Provider";
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
