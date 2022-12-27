package trial;

public class dropDownField extends field{

	double info;
	dropDownField(form form) 
	{
		super(form);
	}
	public dropDownField()
	{
		
	}

	@Override
	public void execute(double info) {
		// TODO Auto-generated method stub
		this.info=info;
	}
	@Override
	public double getInfo() {
		// TODO Auto-generated method stub
		return info;
	}

}
