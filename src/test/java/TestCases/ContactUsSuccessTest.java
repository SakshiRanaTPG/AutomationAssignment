package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.ContactUs;
import Pages.homepage;

public class ContactUsSuccessTest extends BaseClass{
	
	ContactUs contactPass;
	homepage homepageObj1;
	

	@BeforeMethod
	public void initiate(){
        contactPass = new ContactUs(driver);          //object created 
    }
	
	@BeforeMethod
	public void initiatehome() {
		homepageObj1 = new homepage(driver);
	}
	

	
	@Test
	public void test1(){
		//Verify correct page is opened 
        homepageObj1.Pageverification();

        //click contactus button
        contactPass.ContactUsbtn();
        
        contactPass.contactpageverification();

        //select customer service from dropdown
        contactPass.customerService();

        //entering Email Id in textfield
        contactPass.EmailID("Ranasakshi@gmail.com");                           //could have been improved if configs file is used
        contactPass.Message("Test Message Sending...");
        contactPass.sendbtn();
        contactPass.SuccessMsg();
    }


	

}
