package businessdelegatedesignpattern;

public class BusinessDelegatePatternDemo {

	public static void main(String[] args) {

		BusineesDelegate businessDelegate = new BusineesDelegate();
		businessDelegate.setServiceType("Jio");
		Client client = new Client(businessDelegate);
		client.doTask();
		businessDelegate.setServiceType("Reliance");
		client.doTask();

	}

}
