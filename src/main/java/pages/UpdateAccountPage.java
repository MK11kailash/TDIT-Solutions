package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.ElementUtils;

public class UpdateAccountPage extends Page{

	WebDriver driver;
	ElementUtils elementUtils;
	Page page;

	// page Elements

	By enterAcNumber = By.cssSelector("#myInput");
	By enterAcFund = By.name("afund");
	By clickUpdateBal = By.name("register");
	By UpdateAcHeader = By.xpath("//h2[text()='Update Balance']");

	// Constructor

	public UpdateAccountPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		elementUtils=new ElementUtils(driver);
		page=new Page(driver);
	}

	// PageActions

	public void updatetingBalance(String ACNum, String AcFund) {
		driver.findElement(enterAcNumber).sendKeys(ACNum);
		driver.findElement(enterAcFund).sendKeys(AcFund);
		driver.findElement(clickUpdateBal).click();
	}

	public String getUpdateAccountBalAlertText() {
		return page.getAlertText();
	}

	public String getHeaderTextUpdateAcScreen() {

//		WebElement element = driver.findElement(UpdateAcHeader);
//		String actual = element.getText();
//		return actual;
		return elementUtils.getHeaderText(UpdateAcHeader);
	}
}
