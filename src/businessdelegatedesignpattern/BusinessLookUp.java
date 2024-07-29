package businessdelegatedesignpattern;

public class BusinessLookUp {

	public BusinessService getBusinessService(String serviceType){
		 
		 if(serviceType.equalsIgnoreCase("Jio")){
		 return new JioService();
		 }
		 else {
		 return new RelianceService();
		 }
	
}
}
