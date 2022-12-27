package trial;

public abstract class landlineServiceProvider {
	public abstract String toString();
	public abstract void createForm(form f);
	public void display() {
		 System.out.println("Please Enter your Home Number");
		 System.out.println("Please Enter The amount to be recharged");   
	}
}
