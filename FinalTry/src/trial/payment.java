package trial;

public abstract class payment {
    String discservice;//service name 
	abstract public double cost();
	public void setdiscservice(String discservice)
	{
		this.discservice=discservice;
	}
	public String getdisservice()
	{
		return discservice;
	}
	
}
