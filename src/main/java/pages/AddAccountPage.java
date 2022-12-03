package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.ElementUtils;

public class AddAccountPage extends Page{

	WebDriver driver;
	ElementUtils elementutils;
	 Page page;
	// page elements

	By enterAccountName = By.name("aname");
	By enterAccountNumber = By.name("anumber");
	By enterAccountFund = By.name("afund");
	By clickSubmitButton = By.name("register");

//	Constructor
	public AddAccountPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		elementutils=new ElementUtils(driver);
		page = new Page(driver);
	}

//	Page Actions
	public void addingAccount(String name, String AcNum, String AcFund) {
		
		elementutils.enterText(enterAccountName, name);
		elementutils.enterText(enterAccountNumber, AcNum);
		elementutils.enterText(enterAccountFund, AcFund);
		elementutils.clickOnButton(clickSubmitButton);

		//driver.findElement(enterAccountName).sendKeys(name);
		//driver.findElement(enterAccountNumber).sendKeys(AcNum);
		//driver.findElement(enterAccountFund).sendKeys(AcFund);
		//driver.findElement(clickSubmitButton).click();

	}

	public String getAddAccountAlertText() {
		
		return page.getAlertText();
		
//      You can write this way also
//		String alertText =elementutils.getAlertText();
//		return alertText;
//		Alert alert = driver.switchTo().alert();
//		String actual = driver.switchTo().alert().getText();
//		return actual;
	}

}
