package trial;

public class wallet extends payment{

	public double cost(service s) {
		
		if(s.supportsCashOnDelivery()) {
			return s.getCost();
		}
		else {
			System.out.println("This service doesn't support wallet");
			return 0;
		}
	}
	}


