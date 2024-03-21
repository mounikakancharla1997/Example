package log4jDemo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

public class Class2 {
	
	private Logger logger;
	
	@Test
	public void userLogin() {
		logger=Logger.getLogger("Class2.java");
		PropertyConfigurator.configure("log4j.properties");
		System.out.println("\n Printing Logger messages\n");
		logger.trace("to trace the execution");
		logger.info("Browser launched");
		logger.error("it is not printed");
		logger.warn("printing warning messages");
		logger.fatal("it is a fatal defect");
		System.out.println("\n Printing Logger messages are completed\n");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
