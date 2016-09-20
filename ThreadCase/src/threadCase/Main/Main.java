package threadCase.Main;

import threadCase.ThreadControl.Controller;
import org.apache.log4j.Logger;

public class Main {
	
	final static Logger logger = Logger.getLogger("***Main Class*** -");
	public static void main(String[] args) {
		
		logger.info("Test");
		
		Controller tc = new Controller();
		int count = 1;
        while (count < 11) {
        	
        	tc.startThread();
        	
        	count++;
        }
		


	}

}
