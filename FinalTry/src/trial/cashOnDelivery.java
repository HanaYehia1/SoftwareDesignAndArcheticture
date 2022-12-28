package trial;

public class cashOnDelivery extends payment{


	public double cost(service s) {
		
		if(s.supportsCashOnDelivery()) {
			return s.getCost();
		}
		else {
			System.out.println("This service doesn't support cash on delivery");
			return 0;
		}
	}

	
}
