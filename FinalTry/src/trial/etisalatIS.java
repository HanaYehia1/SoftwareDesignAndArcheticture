package trial;

public class etisalatIS extends internetServiceProvider{

	@Override
	public String toString() {
		String var="Etisalat Internet Payment Service";
        return var;
	}

	@Override
	public void createForm(form f) {
		textField dp2 = new textField();
		dropDownField dp1= new dropDownField();
		f.Addfields(dp2);
		f.Addfields(dp1);
		
	}
	
}
