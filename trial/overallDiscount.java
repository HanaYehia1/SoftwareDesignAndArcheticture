package trial;

public class overallDiscount extends discountDecorator{

	private service s;
	overallDiscount(payment dd) {
		super(dd);
	}
	
	public double addDiscount(double discount) {
		double value = s.getCost();
		return value + discount;
	}
}
