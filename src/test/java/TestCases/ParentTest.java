package TestCases;

import TestDataReader.TestDataReader;
import Operations.HomePageFunc;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import Utils.Web_driver;


public class ParentTest {

	protected WebDriver driver;
	TestDataReader TestDataReaderOBJ = new TestDataReader();
	HomePageFunc HomePageFuncOBJ;
	
	 @BeforeClass
	    public void startBrowser(){
	        driver = Web_driver.getDriver();
	        driver.get(TestDataReaderOBJ.configFileReader());
	    }
	 
	 protected static void logStep(String step){
	        Log.step(step);;
	    }


	    @AfterClass
	    public void closeBrowser(){
	        driver.quit();
	    }
}
