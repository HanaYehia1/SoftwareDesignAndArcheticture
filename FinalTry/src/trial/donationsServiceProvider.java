package trial;

import java.util.ArrayList;

public abstract class donationsServiceProvider {
	public abstract String toString();
	public void display() {
		 System.out.println("Please Enter The Mobile Number for the charity");
		 System.out.println("Please Enter The amount to be tansfered");   
	}
	public abstract void createForm(form f,service serviceName,double number,double money);
    
}
