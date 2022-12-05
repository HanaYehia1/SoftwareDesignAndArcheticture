package trial;

import java.util.ArrayList;

public class form extends field {

	form(form form) {
		super(form);
	}
	public form() {
		// TODO Auto-generated constructor stub
	}
	public ArrayList<field> fields=new ArrayList<>();

	public void createForm() {
		textField t1 = new textField();
		textField t2 = new textField();
		fields.add(t1);
		fields.add(t2);
	}
	protected void Addfields(field f) {
		fields.add(f);
	}
	@Override
	public boolean execute() {
		return false;
		// TODO Auto-generated method stub
		
	}

}
