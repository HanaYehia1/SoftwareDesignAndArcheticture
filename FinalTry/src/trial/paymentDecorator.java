package trial;


public class paymentDecorator extends payment
{		
	private payment wrappee;
	paymentDecorator(payment wrappee)
	{
		this.wrappee = wrappee;
	}



	@Override
	public double cost(service s) {
		return wrappee.cost(s);
	}
	
}
