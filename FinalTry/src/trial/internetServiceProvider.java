package trial;

public abstract class internetServiceProvider {
	public abstract String toString();
	public void display() {
		 System.out.println("Please Enter your Home Number for your internet");
		 System.out.println("Please Enter The amount to be recharged");   
	}
	public abstract void createForm(form f);

}
