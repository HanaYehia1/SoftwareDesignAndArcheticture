package trial;

public abstract class field {

	public form form;
	
	field(form form)
	{
		this.form = form;
	}
	field(){}
	public abstract void execute(double cost);
	public abstract double getInfo();
}
