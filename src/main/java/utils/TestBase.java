package utils;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import driverFactory.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.AddAccountPage;
import pages.DeleteAccountPage;
import pages.HomePage;
import pages.LoginPage;
import pages.UpdateAccountPage;

public class TestBase {
	WebDriver driver;
	protected LoginPage lp;
	protected HomePage hp;
	protected AddAccountPage ac;
	protected DriverFactory df;
	protected Properties prop;
	protected PropConfig propConfig;
	protected UpdateAccountPage ua;
    protected DeleteAccountPage da;

	@BeforeMethod
	public void beforeMethod() throws IOException {
		// WebDriverManager.chromedriver().setup();
		// driver = new ChromeDriver();
		df = new DriverFactory();
		propConfig = new PropConfig();
		prop = propConfig.getPropValues();

		String browser = prop.get("browser").toString();

		String url = prop.get("getUrl").toString();

		driver = df.initBrowser(browser);
		driver.get(url);
		lp = new LoginPage(driver);
		
//		hp = new HomePage(driver);
//		ac = new AddAccountPage(driver);
//		ua = new UpdateAccountPage(driver);
//		da = new DeleteAccountPage(driver);

	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
