package trial;

public class etisalatIS extends internetServiceProvider{

	@Override
	public String toString() {
		String var="Etisalat Internet Payment Service";
        return var;
	}

	@Override
	public void createForm(form f,service serviceName,double number,double money) {
		textField dp2 = new textField();
		dropDownField dp1= new dropDownField();
		f.Addfields(dp2);
		f.Addfields(dp1);
		f.getFields().get(0).execute(number);
		f.getFields().get(1).execute(money);
		serviceName.setCost(f.getFields().get(1).getInfo());
		
		
	}
	
}
