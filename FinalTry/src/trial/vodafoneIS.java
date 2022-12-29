package trial;

public class vodafoneIS extends internetServiceProvider{

	@Override
	public String toString() {
		 String var=" Vodafone Internet Payment Service ";
         return var;
	}
	@Override
	public void createForm(form f,service serviceName,double number,double money) {
		textField t1 = new textField();
		dropDownField dp2 = new dropDownField();
		f.Addfields(dp2);
		f.Addfields(t1);
		f.getFields().get(0).execute(number);
		f.getFields().get(1).execute(money);
		serviceName.setCost(f.getFields().get(1).getInfo());
		
	}
}
