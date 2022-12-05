package trial;

public class wallet implements payment{

	@Override
	public double cost(service s) {
		return s.getCost();
	}

}
