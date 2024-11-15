package training;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static WebDriver driver;
	static Robot ro;
	
	public static void openBrowser() {
		driver = new ChromeDriver();
	}
	
	public static void fireboxBrowser() {
		driver = new FirefoxDriver();
	}
	
	public static void launchUrl(String url) {
		driver.get(url);
	}
	
	public static void fillTextBox(WebElement ele, String st) {
		ele.sendKeys(st);
	}
	public static void click(WebElement ele) {
		ele.click();
	}
	public static void toclose() {
		driver.close();
	}
	public static void implicityWait(long time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	static public void enterKey() throws AWTException {
		ro = new Robot();
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
	}
	
}
