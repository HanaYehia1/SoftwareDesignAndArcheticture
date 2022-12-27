package trial;

public class textField extends field {

	private double info;

	textField(form form) {
		super(form);
	}

	public textField(){}

	
	public void execute(double info) 
	{
		// TODO Auto-generated method stub
		this.info=info;
	}

	@Override
	public double getInfo() {
		// TODO Auto-generated method stub
		return info;
	}

}
