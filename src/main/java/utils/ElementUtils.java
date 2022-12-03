package utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtils  {
	
	WebDriver driver;
	ElementUtils elementUtils;
	
	public ElementUtils(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterText(By locator, String text) {
		driver.findElement(locator).sendKeys(text);
	}
//	public void enterText(String xpath, String text) {
//		  driver.findElement(By.xpath(xpath)).sendKeys(text);
//	}
	public void clickOnButton(By locator) {
		driver.findElement(locator).click();
	}
	
	public String getHeaderText(By locator) {
		System.out.println("--Inside getHeaderText--");
		System.out.println("Locator : "+locator);
		String actual = driver.findElement(locator).getText();
		return actual;
	}
	
}
