package Operations;

import org.openqa.selenium.WebDriver;
import Pages.Dresses;

public class DressesFunc extends Actions {

	public DressesFunc(WebDriver driver) {
    	super(driver);
    }
	
	public casualDressesFunc CasualDresses(){
        click(Dresses.Casualbtn); 
        return new casualDressesFunc(driver);
    }
	
	
}
