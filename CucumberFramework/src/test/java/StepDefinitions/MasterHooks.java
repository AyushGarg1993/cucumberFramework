package StepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import pageObjects.BasePage;
import utils.DriverFactory;

public class MasterHooks extends DriverFactory{
	
	public MasterHooks() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Before
	public void setup()
	{
		driver=getDriver();
		
//		WebDriver driver = getDriver();
		
		System.out.println("Launching browser just one time");
	}

	@After
	public void teardownAndTakeScreenShot(Scenario scenario)
	{
		try {
			if(driver!=null && scenario.isFailed())
			{
//				scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES),"image/png" );
				
//				File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
//				 FileUtils.copyFile(screenshotFile, new File("/Users/ayushmac/Desktop/Cucumber_Framework/CucumberFramework/src/test/java/ScreenShots"));
				
//				FileUtils.copyFile(screenshotFile, new File(System.getProperty("user.dir") + "\\ExtendReport\\imgs\\"));

				 BasePage.captureScreenshot();
			}
			
			if(driver != null)
			{
			
			driver.quit();
			
			}
		} catch (Exception e) {
			
			System.out.println("Exception in tead down method is " + e.getMessage());
		}
	}
	
}
