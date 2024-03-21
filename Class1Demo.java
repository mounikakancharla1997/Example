package log4jDemo;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class1Demo {
    private Logger logger;
    public WebDriver driver;
	
    
    @Test
	public void setUp() {
    	logger=Logger.getLogger("Class1Demo.java");
    	PropertyConfigurator.configure("log4j.properties");
    	logger.info("Browser executable file running");
           driver =new ChromeDriver();
           logger.info("Browser launched");
           driver.get("https://opensource-demo.orangehrmlive.com/");
           logger.info("Application opened");
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
