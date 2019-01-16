package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pageObjects.Contact_Us_Page;
import pageObjects.Products_Page;


public class DriverFactory {
	public static WebDriver driver;
	public static Properties prop;
	public static Contact_Us_Page contactpage;
	public static Products_Page productpage;

	
	public DriverFactory() throws IOException {
		
		prop = new Properties();
		
		FileInputStream file = new FileInputStream("/Users/ayushmac/Desktop/Cucumber_Framework/CucumberFramework/src/test/java/properties/config.properties");
		
		prop.load(file);
		
		System.out.println("My browser name is " + prop.getProperty("browser"));
	}

	public WebDriver getDriver() {
		
		try {
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
		System.out.println("Launching browser the 2nd time ");
					System.setProperty("webdriver.chrome.driver", "/Users/ayushmac/Downloads/chromedriver");
					// CHROME OPTIONS
					driver = new ChromeDriver();
					driver.manage().window().maximize();
		
	}
		else {
			System.out.println("*******No browser Founf ********* ");
		}
		
	}
	catch(Exception e)
	{
		System.out.println("ewdeedewdew");
	} finally {
		contactpage = PageFactory.initElements(driver,Contact_Us_Page.class);
		productpage = PageFactory.initElements(driver,Products_Page.class);

	}
	return driver;
}
}