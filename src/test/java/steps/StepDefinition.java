package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Techfios101Page;
import pages.TestBase;

public class StepDefinition extends TestBase{
	static Techfios101Page techfiosPage;
	
	@Before
	public void beforeRun() {
		init();
		techfiosPage = PageFactory.initElements(driver, Techfios101Page.class);
	}
	
	@Given("User is on Techfios101 page")
	public void user_is_on_techfios101_page() {
	    driver.get("https://techfios.com/test/101/");
	}
	
	@When("User clicks on {string} button")
	public void user_clicks_on_button(String buttonName) {
		switch (buttonName) {
		case "Set SkyBlue Background" : techfiosPage.clickOnSkyBlueButton();
		System.out.println("SkyBlue button was clicked on.");
		break;
		case "Set White Background" : techfiosPage.clickOnWhiteButton();
		System.out.println("White button was clicked on.");
		break;
		default : System.out.println("Unable to get buttonName");
		} 
	}
	
	@Then("The background should be set to Skyblue")
	public void the_background_should_be_set_to_skyblue() {
	    techfiosPage.validateSkyBlueBackground();
	}
	
	@Then("The background should be set to White")
	public void the_background_should_be_set_to_white() {
	 techfiosPage.validateWhiteBackground();
	}
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
