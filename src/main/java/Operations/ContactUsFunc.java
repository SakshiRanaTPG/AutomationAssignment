package Operations;

import Pages.ContactUs;
import org.openqa.selenium.WebDriver;

public class ContactUsFunc extends Actions {
	
	public ContactUsFunc(WebDriver driver) {     
		super(driver);
	}
	

	    public void customerService() {
	        click(ContactUs.service);
	    }

	    public void EmailID(String email) {
	        Text(ContactUs.emailID, email);
	    }
	    
	    public void Message(String message) {
	        Text(ContactUs.Msg, message);
	    }

	    public void sendbtn(){
	        click(ContactUs.Sendbtn);
	    }

	    public boolean SuccessMsg() {
	       if(elementfind(ContactUs.Success)) {
	    	   return(true);
	       }
	       else {
	    	   return(false);
	       }

	    }

	    public boolean failureMsg() {
	        if(elementfind(ContactUs.Fail)) {
	        	return(true);
	        }
	        else {
	        	return(false);
	        }

	    }
	
	

}
