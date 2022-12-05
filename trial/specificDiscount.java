package trial;

public class specificDiscount extends discountDecorator{

	private service s;

	specificDiscount(discountDecorator dd) {
		super(dd);
	}

	public double addDiscount(double discount) {
		double value = s.getCost();
		return value + discount;
	}
}
