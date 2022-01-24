package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.ContactUs;
import Pages.homepage;

public class ContactUsFailTest extends BaseClass {
	
	ContactUs contactFail;
	homepage homepageObj;

	@BeforeMethod
	public void initiate(){
        contactFail = new ContactUs(driver);          //object created 
    }
	
	@BeforeMethod
	public void initiatehome() {
		homepageObj = new homepage(driver);
	}
	
	
	@Test
	public void test2(){
		//Verify correct page is opened 
        homepageObj.Pageverification();

        //click contactus button
        contactFail.ContactUsbtn();
        
        contactFail.contactpageverification();

        //select customer service from dropdown
        contactFail.customerService();

        //entering invalid Email Id in textfield
        contactFail.EmailID("Rana@sakshi@gmail.@com");                           //could have been improved if configs file is used
        contactFail.Message("Test Message Sending...");
        contactFail.sendbtn();
        contactFail.failureMsg();
    }
	
}
