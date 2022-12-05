package trial;

public class serviceProducer {

	monthlyReceipt monthly=new monthlyReceipt();
	quarterReceipt quarter =new quarterReceipt();
    landlineService landline=new landlineService(monthly,quarter);
    etisalatMS e=new etisalatMS();
    vodafoneM v=new vodafoneM();
    orangeMS o=new orangeMS();
    weMS w=new weMS();
    schools school=new schools();
    ngo ngo=new ngo();
    cancerHospitals cancer=new cancerHospitals();
    etisalatIS e2=new etisalatIS();
    vodafoneIS v2=new vodafoneIS();
    orangeIS o2=new orangeIS();
    weIS w2=new weIS();
    mobileRechargeService mobileR=new mobileRechargeService(e,v,o,w);
    internetPaymentService internet=new internetPaymentService(e2,v2,o2,w2);
    donationService donations =new donationService(school,cancer,ngo);
	public void searchService(String s)
	{
		if(s.equalsIgnoreCase("landline"))
        {
            System.out.println(landline.printProviders());
        }
        if(s.equalsIgnoreCase("mobile"))
        {
            System.out.println(mobileR.printProviders());
        }
        if(s.equalsIgnoreCase("internet"))
        {
            System.out.println(internet.printProviders());
        }
        if(s.equalsIgnoreCase("donations"))
        {
            System.out.println(donations.printProviders());
        }
	}
}
