package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitDriver {
	
	 private final WebDriver driver;
	    public InitDriver() {
	    	System.setProperty("webdriver.chrome.driver","C://Users//sakshi.rana//eclipse-workspace//AutoAssign//resources//chromedriver.exe");
	        this.driver = new ChromeDriver();
	    }
	    public WebDriver getDriver(){
	        return driver;
	    }

}
