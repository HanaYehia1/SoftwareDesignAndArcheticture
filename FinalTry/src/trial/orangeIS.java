package trial;

public class orangeIS extends internetServiceProvider{

	@Override
	public String toString() {
		String var="Orange Internet Payment Service";
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
