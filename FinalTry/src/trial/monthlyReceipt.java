package trial;

public class monthlyReceipt extends landlineServiceProvider{

	@Override
	public String toString() {
		String var=" Monthly Receipt Landline ";
		 return var;
	}

	@Override
	public void createForm(form f,service serviceName,double number,double money) {
		textField t1 = new textField();
		dropDownField t2= new dropDownField();
		f.Addfields(t1);
		f.Addfields(t2);
		f.getFields().get(0).execute(number);
		f.getFields().get(1).execute(money);
		serviceName.setCost(f.getFields().get(1).getInfo());
		
	}
		
	}

	
	


