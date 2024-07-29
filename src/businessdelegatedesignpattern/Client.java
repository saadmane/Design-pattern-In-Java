package businessdelegatedesignpattern;

public class Client {

	BusineesDelegate businessService;

	public Client(BusineesDelegate businessService) {
		this.businessService = businessService;
	}

	public void doTask() {
		businessService.doTask();
	}

}
