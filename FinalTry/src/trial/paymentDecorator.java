package trial;


public class paymentDecorator extends payment
{		
	private payment wrappee;
	private double discount;
	paymentDecorator(payment dd)
	{
		this.wrappee = dd;
	}

	
	public double addDiscount(double discount) {
		return this.discount = discount;
	}


	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
