package trial;

public class creditCard extends payment{

	@Override
	public double cost(service s) {
		return s.getCost();
	}
}
