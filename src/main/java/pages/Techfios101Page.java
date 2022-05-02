package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
public class Techfios101Page {

	
	WebDriver driver;

	public Techfios101Page(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//button[@onclick='myFunctionSky()\']")
	WebElement SKYBLUE_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@onclick=\'myFunctionWhite()\']")
	WebElement WHITE_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//body[@style=\"background-color: skyblue;\"]")
	WebElement SKYBLUE_BACKGROUND_ELEMENT;
	@FindBy(how = How.XPATH, using = "//body[@style=\"background-color: white;\"]")
	WebElement WHITE_BACKGROUND_ELEMENT;

	
	public void clickOnSkyBlueButton() {
		SKYBLUE_BUTTON_ELEMENT.click();
	}
	public void clickOnWhiteButton() {
		WHITE_BUTTON_ELEMENT.click();
	}
	public void validateSkyBlueBackground() {
		if(SKYBLUE_BACKGROUND_ELEMENT.isDisplayed()) {
			Assert.assertTrue(true, "The background color has been validated.");
		}
		else {
			Assert.assertTrue(false, "The background color could not be validated.");
		}
	}
	public void validateWhiteBackground() {
		if(WHITE_BACKGROUND_ELEMENT.isDisplayed()) {
			Assert.assertTrue(true, "The background color has been validated.");
		}
		else {
			Assert.assertTrue(false, "The background color could not be validated.");
		}
	}
	
}
