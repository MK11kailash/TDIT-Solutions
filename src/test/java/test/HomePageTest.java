package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import utils.Constants;
import utils.TestBase;

public class HomePageTest extends TestBase {

	WebDriver driver;

	@Test
	public void verifyHomePageHeaderTitle() {

		hp=lp.doLogin("sump1", "techfin@12");

		String actual = lp.verifyLoginSuccsesfulHomePageText();

		Assert.assertEquals(actual, Constants.HomePage_Header_Title);

	}

}
