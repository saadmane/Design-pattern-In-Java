package businessdelegatedesignpattern;

public class JioService implements BusinessService {

	@Override
	public void doProcessing() {
		
		System.out.println("Processing task by invoking Jio Service");
		
	}

}
