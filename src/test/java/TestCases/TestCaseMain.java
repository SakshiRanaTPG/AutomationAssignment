package TestCases;

import java.util.HashMap;

import org.testng.annotations.Test;
import Operations.ContactUsFunc;
import Operations.DressesFunc;
import Operations.HomePageFunc;
import Operations.OrderFunc;
import Operations.casualDressesFunc;
import Operations.printedDressFunc;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.model.Status;

public class TestCaseMain extends ParentTest{
	
	HomePageFunc HomePageFuncOBJ;
	
	
	@Test
    public void InitiateHomePage(){
        HomePageFuncOBJ = new HomePageFunc(driver);
    }
	

	@Test(dependsOnMethods = "InitiateHomePage")
    @Description("1.Open Application-"
    		+ "2.Verify correct site is opened-"
    		+ "3.Click “Contact Us”-"
    		+ "4.Select “Customer Service” from  Subject heading-"
    		+ "5.Enter valid email address and add some message and click send-"
    		+ "6.Verify Success Message")
     public void Test1() {
    	logStep("Verifying Correct site is opened");
    	HomePageFuncOBJ.Verify(); 
    	Allure.step("Site opened");
    	
    	logStep("Click 'ContactUs button'");
    	ContactUsFunc ContactUsFuncOBJ = HomePageFuncOBJ.ContactUsbtn();  
    	Allure.step("ContactUs button clicked");
    	
    	logStep("Select “Customer Service” from  Subject heading");
    	ContactUsFuncOBJ.customerService();  
    	Allure.step("Customer Service selected");
    	
    	logStep("Enter valid emailID");
    	ContactUsFuncOBJ.EmailID("ranasakshi473@gmail.com");
    	Allure.step("Valid EmailID entered");
    	
    	logStep("Enter Message");
    	ContactUsFuncOBJ.Message("Test Message");
    	Allure.step("Message Entered");
    	
    	logStep("Click send button");
    	ContactUsFuncOBJ.sendbtn();
    	Allure.step("Send Button clicked");
    	
    	logStep("Verify success message");
    	if(ContactUsFuncOBJ.SuccessMsg()) {
    		Allure.step("Success message verification Passed", Status.PASSED); 
    	}
    	else {
    	Allure.step("Success message verification Failed", Status.FAILED); 
    	}
    }
    
    @Test(dependsOnMethods = "InitiateHomePage")
    @Description("1.Open Application-"
    		+ "2.Verify correct site is opened-"
    		+ "3.Click “Contact Us”-"
    		+ "4.Select “Customer Service” from  Subject heading-"
    		+ "5.Enter Invalid email address and add some message and click send-"
    		+ "6.Verify error Message")
     public void Test2() {
   
    	logStep("Click 'ContactUs button'");
    	ContactUsFunc ContactUsFuncOBJ = HomePageFuncOBJ.ContactUsbtn();  
    	Allure.step("ContactUs button clicked");
    	
    	logStep("Select “Customer Service” from  Subject heading");
    	ContactUsFuncOBJ.customerService();  
    	Allure.step("Customer Service selected");
    	
    	logStep("Enter Invalid emailID");
    	ContactUsFuncOBJ.EmailID("@ranasakshi473@gmailom");
    	Allure.step("Invalid EmailID entered");
    	
    	logStep("Enter Message");
    	ContactUsFuncOBJ.Message("Test Message");
    	Allure.step("Message Entered");
    	
    	logStep("Click send button");
    	ContactUsFuncOBJ.sendbtn();
    	Allure.step("Send Button clicked");
    	
    	logStep("Verify Error message");
    	if(ContactUsFuncOBJ.failureMsg()) {
    		Allure.step("Error message verification Passed", Status.PASSED); 
    	}
    	else {
    	Allure.step("Error message verification Failed", Status.FAILED); 
    	}
    
    }
    
    @Test(dependsOnMethods = "InitiateHomePage")
    @Description("Open Applicaton-"
    		+ "2.Click on Dresses | Casual Dresses-"
    		+ "3.Select one Item from Result and add to cart-"
    		+ "4.Open the cart and verify the same item added in cart and price is correct")
     public void Test3() {
    	
    	logStep("Click on dresses");
    	DressesFunc DressesFuncOBJ = HomePageFuncOBJ.Dresses();  
    	Allure.step("Dresses Button clicked");
    	
    	logStep("Click on Casual Dresses");
    	casualDressesFunc casualDressesFuncOBJ = DressesFuncOBJ.CasualDresses();  
    	Allure.step("Casual Dresses Button clicked");
    	
    	logStep("Selecting one item");
    	printedDressFunc printedDressFuncOBJ = casualDressesFuncOBJ.Productselected();
    	Allure.step("One product selected");
    	
    	
    	logStep("Product is added to cart");
    	HashMap<String, String> selectedDetails = printedDressFuncOBJ.ProductaddedtoCart();
    	Allure.step("One product added to Cart");
    	
    	
    	logStep("Cart is opened");
    	OrderFunc OrderFuncOBJ = printedDressFuncOBJ.proceedToCart();
    	Allure.step("Cart opened");
    	
    	
    	logStep("Verify product name");
    	if(OrderFuncOBJ.ProductNameVerify(selectedDetails.get("Product_Name"))) {
    		Allure.step("Product Name verification Passed", Status.PASSED);
    	}
    	else {
    		Allure.step("Product Name verification Failed", Status.FAILED);
    		
    	}
    	
    	
    	
    	logStep("Verify product price");
    	if(OrderFuncOBJ.ProductPriceVerify(selectedDetails.get("Product_Price"))) {
    		Allure.step("Product Price verification Passed", Status.PASSED);
    	}
    	else {
    		Allure.step("Product Price verification Failed", Status.FAILED);
    	}
    	
    }
    
    
    
    
}
