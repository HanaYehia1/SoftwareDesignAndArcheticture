package trial;

public abstract class field {

	public form form;
	private String backup;
	
	field(form form){
		this.form = form;
	}
	field(){}
	public abstract boolean execute();
}
