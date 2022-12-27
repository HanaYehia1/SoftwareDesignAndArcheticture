package trial;

public class vodafoneM extends mobileServiceProvider{


	public vodafoneM() {
	}

	@Override
	public String toString() {
		 String var="Vodafone Mobile Recharge Service";
         return var;
	}

	@Override
		public void createForm(form f) 
	{
			textField t1 = new textField();
			dropDownField dp2 = new dropDownField();
			f.Addfields(dp2);
			f.Addfields(t1);
				
	}

}
