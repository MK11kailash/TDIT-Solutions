package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {
	WebDriver driver;
	
	public Page (WebDriver driver) {
		this.driver=driver;
	}
	public String getAlertText() {
		Alert alert = driver.switchTo().alert();
		String actual = driver.switchTo().alert().getText();
		return actual;
	}
	public boolean alertPresent() {

		WebDriverWait wait = new WebDriverWait(driver, 5);
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
