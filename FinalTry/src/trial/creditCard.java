package trial;

public class creditCard extends payment{

	public double cost(service s) {
		
		if(s.supportsCashOnDelivery()) {
			return s.getCost();
		}
		else {
			System.out.println("This service doesn't support credit card");
			return 0;
		}
	}
}
