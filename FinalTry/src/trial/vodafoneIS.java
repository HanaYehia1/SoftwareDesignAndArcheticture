package trial;

public class vodafoneIS extends internetServiceProvider{

	@Override
	public String toString() {
		 String var=" Vodafone Internet Payment Service ";
         return var;
	}
	@Override
	public void createForm(form f) {
		textField t1 = new textField();
		dropDownField dp2 = new dropDownField();
		f.Addfields(dp2);
		f.Addfields(t1);
		
	}
}
