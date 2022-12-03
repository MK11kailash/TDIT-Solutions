package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import utils.Constants;
import utils.TestBase;

public class DeleteAccountTest extends TestBase {

	@Test
	public void verifyDeleteAccountMsg() {
		hp=lp.doLogin("sump1", "techfin@12");
		da=hp.deleteAccountClick();
		da.deletingAccount("270921");
		String acutal = da.getDeleteAccountAlertText();
		Assert.assertEquals(acutal, Constants.Delete_Account_Expected_Msg);
	}

}
