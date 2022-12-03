package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.ElementUtils;

public class HomePage extends Page{

	WebDriver driver;
	ElementUtils elementUtils;
    Page page;
	By homePaheWelcomeText = By.xpath("//h3[text()='Welcome sump1']");
	By clickOnAddAccount = By.xpath("//a[text()='Add Account']");
	By clickUpdateAccount = By.xpath("//a[text()='Update Account']");
	By clickDeleteAccount = By.xpath("//a[text()='Delete Account']");

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		elementUtils=new ElementUtils(driver);
		page=new Page(driver);
	}

	public String getHeader_HomePage_Text() {
		return elementUtils.getHeaderText(homePaheWelcomeText);
		
//		WebElement element = driver.findElement(homePaheWelcomeText);
//		String actual = element.getText();
//		return actual;
	}

	public AddAccountPage addAccountClick() {
		elementUtils.clickOnButton(clickOnAddAccount);
		//driver.findElement(clickOnAddAccount).click();
		return new AddAccountPage(driver);
	}

	public UpdateAccountPage updateAccountClick() {
		elementUtils.clickOnButton(clickUpdateAccount);
		//driver.findElement(clickUpdateAccount).click();
		return new UpdateAccountPage(driver);
	}

	public DeleteAccountPage deleteAccountClick() {
		elementUtils.clickOnButton(clickDeleteAccount);
		//driver.findElement(clickDeleteAccount).click();
		return new DeleteAccountPage(driver);
	}
}
