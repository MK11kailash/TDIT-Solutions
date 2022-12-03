package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.bytebuddy.implementation.bind.annotation.Super;

public class DeleteAccountPage extends Page {

	// Instance Variable
	WebDriver driver;
	Page page;

	// Page Elements
	// By enterAcNumberSearchBox = By.name("accnumber");

	// By clickOnSearchbutton = By.name("search");

	By enterAccountNumber = By.xpath("//input[@id=\"myInput\"]");
	// By clickOnDeleteButton = By.xpath("//button[@class='delete_btn']");
	By clickOnDeleteButton = By.xpath("//button[@name='delete']");

	// Constructor
	public DeleteAccountPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		page = new Page(driver);
	}

	public void deletingAccount(String AcNum) {
		driver.findElement(enterAccountNumber).sendKeys(AcNum);
		driver.findElement(clickOnDeleteButton).click();
	}

	public String getDeleteAccountAlertText() {
//		Alert alert = driver.switchTo().alert();
//		String actual = driver.switchTo().alert().getText();
//		return actual;
		return page.getAlertText();
	}

}
