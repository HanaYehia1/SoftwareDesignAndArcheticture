package trial;

public abstract class mobileServiceProvider {

	mobileServiceProvider(){}
	public abstract String toString();
	public void display() {
		 System.out.println("Please Enter your Mobile Number");
		 System.out.println("Please Enter The amount to be recharged");   
	}
	public abstract void createForm(form  f,service serviceName,double number,double money);
}
