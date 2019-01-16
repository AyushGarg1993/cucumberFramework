package RunnerClass;

import java.io.File;
import java.io.IOException;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import pageObjects.BasePage;


@RunWith(Cucumber.class)

@CucumberOptions(
		features= {"src/test/java/Featurefiles"},
		glue = {"StepDefinitions"},
		tags= {"@ankan,@important"},
		monochrome= true,
		plugin = {  "pretty", "html:target/cucumber-reports","com.cucumber.listener.ExtentCucumberFormatter:ExtendReport/report.html","rerun:rerun.txt"}
		)




public class MainRunner extends AbstractTestNGCucumberTests {
	
	@AfterClass
	public static void writeExtentReport() throws IOException {
		Reporter.loadXMLConfig(new File(System.getProperty("user.dir") + "\\src\\test\\java\\utils\\ReportsConfig.xml"));
//		BasePage.copyLatestExtentReport();
	}

}
