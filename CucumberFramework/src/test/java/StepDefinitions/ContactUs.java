package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class ContactUs extends DriverFactory {
	
	
	public ContactUs() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

//	WebDriver driver = getDriver();
	
	
	
	
	@Given("^I access webdriveruniversity contact us form$")
	public void i_access_webdriveruniversity_contact_us_form() throws IOException {
		contactpage.getContactUsPage();
	}

	@When("^I enter a valid firstname$")
	public void i_enter_a_valid_firstname() throws Exception {
		contactpage.enterFirstName("Tom");
	}

	@When("^I enter a valid last name$")
	public void i_enter_a_valid_last_name(DataTable dataTable) throws Exception{
		contactpage.enterLasttName(dataTable, 0, 1);
	}

	@And("^i enter a valid email address$")
	public void i_enter_a_valid_email_address() throws Exception  {
		contactpage.enterEmailAddress("webdriveruniversity@outlook.com");
	}

	@And("^i enter comments$")
	public void i_enter_comments(DataTable dataTable) throws Exception {
		contactpage.enterComments(dataTable, 0, 1);
	}

	@When("^i click on the submit button$")
	public void i_click_on_the_submit_button() throws Exception {
		contactpage.clickOnSubmiButton();
	}

	@Then("^the information should successfully be submitted via the contact us form$")
	public void the_information_should_successfully_be_submitted_via_the_contact_us_form() throws Exception  {
		contactpage.confirmContactUsFormSubmissionWasSuccessful();
	}

//@Given("^I navigate to webdriveruniversity website(\\d+)$")
//public void i_navigate_to_webdriveruniversity_website(int arg1) throws Throwable {
//	
//	driver.get("https://webdriveruniversity.com");
//	Thread.sleep(5000);
//
//	
//}
//
//@Given("^I click on contact button(\\d+)$")
//public void i_click_on_contact_button(int arg1) throws Throwable {
//  
//	driver.findElement(By.cssSelector("#login-portal > div > div.section-title > h1")).click();
//
//}
//
//@Given("^I enter \"([^\"]*)\" as username(\\d+)$")
//public void i_enter_as_username(String arg1, int arg2) throws Throwable {
//	
//	System.out.println("Step 11111111111");
//}
//    
//
//@Given("^I enter \"([^\"]*)\" as password(\\d+)$")
//public void i_enter_as_password(String arg1, int arg2) throws Throwable {
//   
//	System.out.println("Step 11111111111");
//
//}
//
//@Then("^I click on login button(\\d+)$")
//public void i_click_on_login_button(int arg1) throws Throwable {
//   
//	System.out.println("Step 11111111111");
//
//}
//
//@Then("^I verify thee \"([^\"]*)\"$")
//public void i_verify_thee(String arg1) throws Throwable {
//   
//	System.out.println("Step 11111111111");
//
//}


}
