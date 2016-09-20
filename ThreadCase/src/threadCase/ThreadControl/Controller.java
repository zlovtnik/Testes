package threadCase.ThreadControl;

import org.apache.log4j.Logger;
import java.lang.Thread.*;

public class Controller implements Runnable {

	final static Logger logger = Logger.getLogger("***Thread Control*** -");
    public void run() {
    	logger.info("Hello from a Thread");
    }

    public void startThread() {
        Thread t1 = new Thread(new Controller());
        setName("Foi1");
        t1.start();
        logger.info("Iniciada Thread");
        logger.info(t1.currentThread());
        if (!t1.isAlive()) {
        	t1.interrupt();
        	logger.info("Thread Matada");
        }
    }
    
    public final void setName(String name){
    	
    }

}
