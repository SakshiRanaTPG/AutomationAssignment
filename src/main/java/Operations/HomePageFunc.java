package Operations;


import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class HomePageFunc extends Actions{
	
	public HomePageFunc(WebDriver driver) {     //constructor for intialising the ContactUs class
		super(driver);
	}
	
	public void Verify() {
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(elementfind(HomePage.frontsection));
	}

	public ContactUsFunc ContactUsbtn() {
        click(HomePage.Contactbtn);
        return new ContactUsFunc(driver);
    }
	
	public DressesFunc Dresses(){
        click(HomePage.Dressesbtn); 
        return new DressesFunc(driver);
    }
	
	
	
	

}
