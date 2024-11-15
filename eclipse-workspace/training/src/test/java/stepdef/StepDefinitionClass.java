package stepdef;

import org.elements.PojoClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import training.BaseClass;

public class StepDefinitionClass extends BaseClass {
	
	/*Feature: To validate Login functionality of facebook application

	  Scenario: To vaildate login using Valid credentials # /C:/Users/Hari/eclipse-workspace/training/src/test/resources/features/Facebook.feature:2
	    Given To launch the browser and valid url         # null
	    When To launch the vaild username                 # null
	    And To launch the Valid Password                  # null
	    Then To close the Browser                         # null*/

	//public static void main(String[] args) {
		PojoClass pr = new PojoClass();
	
	@Given("To launch the browser and valid url")
	public void to_launch_the_browser_and_valid_url() {
		driver = new ChromeDriver();
		launchUrl("https://www.facebook.com/");
	}

	@When("To launch the vaild username")
	public void to_launch_the_vaild_username() {
		WebElement txtemail = pr.getTxtemail();
		fillTextBox(txtemail, "8098816047");
	}

	@When("To launch the Valid Password")
	public void to_launch_the_Valid_Password() {
		WebElement pass = pr.getTxtpasword();
		fillTextBox(pass, "Hari8098816047");
	}

	@Then("To close the Browser")
	public void to_close_the_Browser() {
		driver.close();
	}
	
	@When("To launch invalid password")
	public void to_launch_invalid_password() {
		WebElement txtpasword = pr.getTxtpasword();
		fillTextBox(txtpasword, "12345678");
	}




}
