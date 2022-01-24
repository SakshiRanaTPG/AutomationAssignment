package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Actions.actions;

public class homepage extends actions {
	
	 public homepage(WebDriver driver) {     //constructor for intialising the ContactUs class
			super(driver);
		}
	 
	 
	 @Test
	 public void Pageverification() {
        Assert.assertEquals(Titleofstore(), "My Store");            
    }

}
