package frontcontollerpattren;

public class FrontControllerPatternDemo {

	public static void main(String[] args) {

		FrontController frontController = new FrontController();
		frontController.dispatchRequest("HOME");
		frontController.dispatchRequest("STUDENT");
		
		// we have to make changes in dispatch and create the school view if we r doing this..
		frontController.dispatchRequest("School");
	}

}
