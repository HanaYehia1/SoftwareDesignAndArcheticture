package trial;

public abstract class mobileServiceProvider {

	mobileServiceProvider(){}
	public abstract void createForm();
	public abstract String toString();
	public void display() {
		 System.out.println("Please Enter your Mobile Number");
		 System.out.println("Please Enter The amount to be recharged");   
	}
}