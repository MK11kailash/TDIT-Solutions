package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import DataProvider.DataProviderclass;
import utils.Constants;
import utils.TestBase;

public class UpdateAccountPageTest extends TestBase {

	@Test(dataProvider = "updateAccount",dataProviderClass = DataProviderclass.class)
	public void verifyUpdateAcBalanceAlertMsg(String accNum,String fund) {
		hp=lp.doLogin(prop.getProperty("userId"),prop.getProperty("pass"));
		//hp=lp.doLogin("sump1", "techfin@12");
		ua=hp.updateAccountClick();
		ua.updatetingBalance(accNum, fund);
		String acutal = ua.getUpdateAccountBalAlertText();
		Assert.assertEquals(acutal, Constants.Update_Account_Expected_Msg);
	
	}

	@Test
	public void verifyUpdateAcHeaderText() {
		hp=lp.doLogin(prop.getProperty("userId"),prop.getProperty("pass"));
		ua=hp.updateAccountClick();
		String actual = ua.getHeaderTextUpdateAcScreen();
		Assert.assertEquals(actual, Constants.Update_Account_Header_Title);
	}

}

