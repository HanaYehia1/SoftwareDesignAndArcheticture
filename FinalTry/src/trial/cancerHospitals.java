package trial;

import java.util.ArrayList;

public class cancerHospitals extends donationsServiceProvider{

	@Override
	public String toString() {
		 String var="Cancer Hospitals";
         return var;
	}
	@Override
	public void createForm(form f,service serviceName,double number,double money) 
	{
		textField t1 = new textField();
		textField t2 = new textField();
        f.Addfields(t1);
        f.Addfields(t2);
        f.getFields().get(0).execute(number);
		f.getFields().get(1).execute(money);
		serviceName.setCost(f.getFields().get(1).getInfo());
	}
}
