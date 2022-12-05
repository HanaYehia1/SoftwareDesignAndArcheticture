package trial;

public class discountDecorator implements payment{
	private payment wrappee;
	private double discount;
	discountDecorator(payment dd){
		this.wrappee = dd;
	}

	@Override
	public double cost(service s) {
		return s.getCost();	
	}
	public double addDiscount(double discount) {
		return this.discount = discount;
	}
}
