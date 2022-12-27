package trial;

public class monthlyReceipt extends landlineServiceProvider{

	@Override
	public String toString() {
		String var=" Monthly Receipt Landline ";
		 return var;
	}

	@Override
	public void createForm(form f) {
		textField t1 = new textField();
		dropDownField t2= new dropDownField();
		f.Addfields(t1);
		f.Addfields(t2);
		
	}
		
	}

	
	


