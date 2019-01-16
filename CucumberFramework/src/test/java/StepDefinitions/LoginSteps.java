package StepDefinitions;


import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import utils.DriverFactory;

public class LoginSteps extends DriverFactory{
	
	
	public LoginSteps() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

//	WebDriver driver=getDriver();
	
//	@Before
//	public void setup() throws Exception {
//		
//		System.setProperty("webdriver.chrome.driver", "/Users/ayushmac/Downloads/chromedriver");
//		
////		System.setProperty("webdriver.gecko.driver","/Users/ayushmac/Downloads/geckodriver");
//		this.driver = new ChromeDriver();
//		
//		this.driver.manage().window().maximize();
//		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
//	}
//	
//	
//	@After
//	public void teardown()
//	{
//	 driver.quit();
//	}
////	

	@Given("^User navigates to stack over flow website$")
	public void user_navigates_to_stack_over_flow_website() throws Throwable {
		
//		driver.get("https://stackoverflow.com/");
		
		
		driver.get("https://webdriveruniversity.com");

		
		System.out.print("something");
	}

	@Given("^User enters clicks on the login button$")
	public void user_enters_clicks_on_the_login_button() throws Throwable {

		driver.findElement(By.cssSelector("#login-portal > div > div.section-title > h1")).click();;
		
	}

	@Given("^user enters a valid username$")
	public void user_enters_a_valid_username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.print("something");
		
	driver.findElement(By.cssSelector("#email")).sendKeys("msritayush@gmail.com");
	

	}
////
	@Given("^user enters a valid password$")
	public void user_enters_a_valid_password() throws Throwable {
		driver.findElement(By.cssSelector("#password")).sendKeys("ayush12345");


	}
////
	@When("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
	    
		driver.findElement(By.cssSelector("#submit-button")).click();
		
		Thread.sleep(5000);
////
	}
////
	@Then("^user should be taken to successfully login page$")
	public void user_should_be_taken_to_successfully_login_page() throws Throwable {
		Thread.sleep(5000);

		
	boolean askQuestion = 	driver.findElement(By.cssSelector("html.html__responsive body.home-page.unified-theme div.container div#content.snippet-hidden div#mainbar div.grid div.pl8.aside-cta.grid--cell a.d-inline-flex.ai-center.ws-nowrap.s-btn.s-btn__primary")).isDisplayed();
		
	Assert.assertEquals(askQuestion, true);
	
	}
////	
////	

@Given("^User navigates to stack over flow website(\\d+)$")
public void user_navigates_to_stack_over_flow_website(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.print("something");
}

@Given("^User enters clicks on the login button(\\d+)$")
public void user_enters_clicks_on_the_login_button(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.print("something");
}

@Given("^user enters a valid username(\\d+)$")
public void user_enters_a_valid_username(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.print("something");
}

@Given("^user enters a valid password(\\d+)$")
public void user_enters_a_valid_password(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.print("something");
}

@When("^user clicks on login button(\\d+)$")
public void user_clicks_on_login_button(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.print("something");
}
////
@Then("^user should be taken to successfully login page(\\d+)$")
public void user_should_be_taken_to_successfully_login_page(int arg1) throws Throwable {
//     Write code here that turns the phrase above into concrete actions
	System.out.print("something");
}	
////	
	
	
	@Given("^I navigate to webdriveruniversity website$")
	public void i_navigate_to_webdriveruniversity_website() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.get("https://webdriveruniversity.com");
		Thread.sleep(5000);
	}

	@Given("^I click on contact button$")
	public void i_click_on_contact_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement webElement = driver.findElement(By.cssSelector("#login-portal > div > div.section-title > h1"));
		webElement.click();
		
		// Below code will take screenshot of particular elements which we want
		
//		WebElement webElement = driver.findElement(By.xpath("//img[@id='hplogo']"));
		Screenshot screenshot = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver, webElement);
		ImageIO.write(screenshot.getImage(),"PNG",new File(System.getProperty("user.dir") +"//ExtendReport//contactLogo.png"));
		
		
		
		
		
		
	}

	@Given("^I enter \"([^\"]*)\" as username$")
	public void i_enter_as_username(String username) throws Throwable {
		
//		String parentwindow = driver.getWindowHandle();
		
		for (String window :driver.getWindowHandles())
		{
			driver.switchTo().window(window);
		}
		
		driver.findElement(By.cssSelector("#text")).sendKeys(username);
		
		

	    // Write code here that turns the phrase above into concrete actions
	}

	@Given("^I enter \"([^\"]*)\" as password$")
	public void i_enter_as_password(String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.cssSelector("#password")).sendKeys(password);

	}

	@Then("^I click on login button$")
	public void i_click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.cssSelector("#login-button")).click();

	}

	@Then("^I verify the \"([^\"]*)\"$")
	public void i_verify_the(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Alert alert = driver.switchTo().alert();
		String message = alert.getText();
		
		if(message.equals("validation succeeded"))
		{
			Assert.assertEquals("validation succeeded", message);

		}
		else {
			Assert.assertEquals("validation failed", message);

		}
		
		Thread.sleep(5000);
	
		
	}	
}
