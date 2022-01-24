package Base;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {

	protected WebDriver driver;
	protected static final String URL = "http://automationpractice.com/";
	
	@BeforeClass
	public void setupApplication()
	{
		
		Reporter.log("=====Browser Session Started=====", true);
		driver = new InitDriver().getDriver();
        driver.get(URL);
		
		Reporter.log("=====Application Started=====", true);
	}
	
	protected static void stepLog(String step) {
		 System.out.println("Step logged -> " + step);
    }
	
	
	@AfterClass
	public void closeApplication()
	{
		driver.quit();
		Reporter.log("=====Browser Session End=====", true);
		
	}
	
}
