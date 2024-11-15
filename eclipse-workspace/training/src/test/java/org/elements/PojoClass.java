package org.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;



import training.BaseClass;

public class PojoClass extends BaseClass {
	
		public  PojoClass() {
			PageFactory.initElements(driver, this);
		}
		@FindBy (id = "email")
		private WebElement txtemail;
		
		
		public WebElement getTxtemail() {
			return txtemail;
		}


		public WebElement getTxtpasword() {
			return txtpasword;
		}
		@FindBys ({
			@FindBy(id="pass"),
			@FindBy(xpath="//input[@type='password']")
		})
		private WebElement txtpasword;
		
		

} 