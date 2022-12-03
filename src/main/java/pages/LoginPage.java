package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ElementUtils;

public class LoginPage extends Page{

	WebDriver driver;
	ElementUtils elementUtils;
	Page page;

//    	Page elements
	By username = By.name("username");

	By password = By.name("password");

	By clickLoginButton = By.name("login");

	By HomePaheHeader = By.xpath("//h2[text()='TDIT Solutions ']");

//    	constructor
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		elementUtils=new ElementUtils(driver);
		page=new Page(driver);
	}

	public HomePage doLogin(String Ussername, String Password) {
	
		elementUtils.enterText(username, Ussername);
		elementUtils.enterText(password, Password);
		elementUtils.clickOnButton(clickLoginButton);
		return new HomePage(driver);
		
//		driver.findElement(username).sendKeys(Ussername);
//		driver.findElement(password).sendKeys(Password);
//		driver.findElement(clickLoginButton).click();
	} 

	public String verifyLoginSuccsesfulHomePageText() {
		
		return elementUtils.getHeaderText(HomePaheHeader);
		
		//return driver.findElement(HomePaheHeader).getText();
	}

	public boolean isalertpresent() {
		return page.alertPresent();
	}
//
//		WebDriverWait wait = new WebDriverWait(driver, 5);
//		try {
//			wait.until(ExpectedConditions.alertIsPresent());
//			return true;
//		} catch (Exception e) {
//			e.printStackTrace();
//			return false;
//		}

	public String getAlertText() {
		return page.getAlertText();
		
//		Alert alert=driver.switchTo().alert();
//		String actual=alert.getText();
//	    alert.accept();
//		return actual;
		
	}

}