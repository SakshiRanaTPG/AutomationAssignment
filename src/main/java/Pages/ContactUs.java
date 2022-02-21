package Pages;

import org.openqa.selenium.By;

public class ContactUs {
	//All elements are found here , all by their xpaths :  
	    public static final By service = By.xpath("//select[@id='id_contact']/option[@value='2']");
	    public static final By emailID = By.xpath("//input[@id='email']");
	    public static final By Msg = By.xpath("//textarea[@id='message']");
	    public static final By Sendbtn = By.xpath("//button[@id='submitMessage']");
	    public static final By Success = By.xpath("//p[contains(text(),'Your message has been successfully sent to our team.')]");
	    public static final By Fail = By.xpath("//li[contains(text(),'Invalid email address.')]");
	    

}
