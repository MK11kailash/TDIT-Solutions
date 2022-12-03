   package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import DataProvider.DataProviderclass;
import utils.Constants;
import utils.TestBase;

public class AddAccountPageTest extends TestBase{
	

	@Test(dataProvider = "createAccount",dataProviderClass = DataProviderclass.class)
	public void verifyAddAccountSuccsesfulMsg(String name, String AcNum, String AcFund) throws InterruptedException {

		hp=lp.doLogin("sump1", "techfin@12");
		ac=hp.addAccountClick();
		ac.addingAccount(name, AcNum, AcFund);

		String acutal = ac.getAddAccountAlertText();

		Assert.assertEquals(acutal, Constants.Adding_Account_expected_Msg);
	}

}
