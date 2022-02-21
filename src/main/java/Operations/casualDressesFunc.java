package Operations;

import org.openqa.selenium.WebDriver;

import Pages.CasualDresses;

public class casualDressesFunc extends Actions{
	
	public casualDressesFunc(WebDriver driver) {
    	super(driver);
    }
	
	
	 public printedDressFunc Productselected(){
	        click(CasualDresses.Product);
	        return new printedDressFunc(driver);
	    }


}
