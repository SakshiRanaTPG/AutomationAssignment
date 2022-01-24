package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Actions.actions;


public class ContactUs extends actions {

    public ContactUs(WebDriver driver) {     //constructor for intialising the ContactUs class
		super(driver);
	}
    
    
   //All elements are found here , all by their xpaths :  
	public static final By Contactbtn = By.xpath("//div[@id='contact-link']//a");
    public static final By service = By.xpath("//select[@id='id_contact']/option[@value='2']");
    public static final By emailID = By.xpath("//input[@id='email']");
    public static final By Msg = By.xpath("//textarea[@id='message']");
    public static final By Sendbtn = By.xpath("//button[@id='submitMessage']");
    public static final By Success = By.xpath("//p[contains(text(),'Your message has been successfully sent to our team.')]");
    public static final By Fail = By.xpath("//li[contains(text(),'Invalid email address.')]");
    
  
    public void contactpageverification()
	{
    	Assert.assertEquals(Titleofstore(), "Contact us - My Store");  
	}

    public void ContactUsbtn() {
        click(Contactbtn);
    }

    public void customerService() {
        click(service);
    }

    public void EmailID(String email) {
        Text(emailID, email);
    }
    
    public void Message(String message) {
        Text(Msg, message);
    }

    public void sendbtn(){
        click(Sendbtn);
    }

    public void SuccessMsg() {
        Assert.assertTrue(elementfind(Success));

    }

    public void failureMsg() {
        Assert.assertTrue(elementfind(ContactUs.Fail));

    }
    
    

}
