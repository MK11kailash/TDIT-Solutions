package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import DataProvider.DataProviderclass;
import utils.Constants;
import utils.TestBase;

public class LoginPageTest extends TestBase {

	WebDriver driver;

	@Test
	public void VerifyLogin() {
		hp=lp.doLogin(prop.getProperty("userId"),prop.getProperty("pass"));
		String actual = lp.verifyLoginSuccsesfulHomePageText();
		Assert.assertEquals(actual, "TDIT Solutions");
	}
    @Test
	public void verifyAlertIsPresentAndAlertText() {
		try {
			hp=lp.doLogin(prop.getProperty("userId"),prop.getProperty("pass"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean actual=lp.isalertpresent();
		Assert.assertEquals(actual, true);
		String actualText=lp.getAlertText();
		Assert.assertEquals(actualText,Constants.Expected_LoginPage_AlertText );

	}
}
