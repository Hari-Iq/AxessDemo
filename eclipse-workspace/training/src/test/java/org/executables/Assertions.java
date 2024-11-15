package org.executables;
import org.elements.PojoClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import training.BaseClass;

public class Assertions extends BaseClass{
	

	@BeforeClass
	public void launch() {
		openBrowser();
	}
	@BeforeMethod
	public void launchurls() {
		launchUrl("https://www.facebook.com/login.php/");
	}
	
	@Test
	private void tc1() {
		PojoClass fb = new PojoClass();
		WebElement txtemail = fb.getTxtemail();
		fillTextBox(txtemail, "hari");
		String s1 = txtemail.getAttribute("value");
		Assert.assertEquals(s1, "hari", "username");
		
		
	}
	

}
