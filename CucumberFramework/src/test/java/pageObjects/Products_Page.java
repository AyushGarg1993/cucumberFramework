package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Products_Page extends BasePage {

	public Products_Page() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}


		public @FindBy(css = "#container-special-offers") WebElement button_SpecialOffers;
		public @FindBy(xpath = ".//*[@id='container-product2']") WebElement button_NewLaptops;
		public @FindBy(xpath = ".//*[@id='myModal']//b[contains(text(),'NEWCUSTOMER')]") WebElement voucherCode;
		public @FindBy(xpath = "//button[text()='Proceed']") WebElement button_Proceed_Popup;
	
}
