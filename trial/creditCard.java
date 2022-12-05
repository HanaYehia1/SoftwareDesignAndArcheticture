package trial;

public class creditCard implements payment{

	@Override
	public double cost(service s) {
		return s.getCost();
	}
}
