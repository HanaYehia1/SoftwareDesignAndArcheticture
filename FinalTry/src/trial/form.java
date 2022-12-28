package trial;

import java.util.ArrayList;

public class form extends field {


	public ArrayList<field> getFields() {
		return fields;
	}
	private double info;
	public void setFields(ArrayList<field> fields) {
		this.fields = fields;
	}
	form(form form) 
	{
		super(form);
	}
	public form() 
	{
		// TODO Auto-generated constructor stub
	}
	public ArrayList<field> fields=new ArrayList<>();

	protected void Addfields(field f) 
	{
		fields.add(f);
		
	}
	
	public void execute(double info) 
	{
		this.info=info;
		
	}
	@Override
	public double getInfo() {
		
		return info;
	}
	

}
