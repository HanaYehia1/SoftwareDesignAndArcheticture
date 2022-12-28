package trial;

public abstract class payment {
   service s;
	abstract public double cost(service s);
	public void setdiscservice(service s)
	{
		this.s=s;
	}
	public service getdisservice()
	{
		return s;
	}
	
}
