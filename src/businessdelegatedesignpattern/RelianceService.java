package businessdelegatedesignpattern;

public class RelianceService implements BusinessService{

	@Override
	public void doProcessing() {
		System.out.println("Processing task by invoking Reliance Service");
		
	}

}
