package trial;

import java.util.ArrayList;

public class cancerHospitals extends donationsServiceProvider{

	@Override
	public String toString() {
		 String var="Cancer Hospitals";
         return var;
	}
	@Override
	public void createForm(form f) 
	{
		textField t1 = new textField();
		textField t2 = new textField();
        f.Addfields(t1);
        f.Addfields(t2);
	}
}
