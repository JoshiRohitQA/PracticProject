package RevisePro.RevisionProject;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeAppointment extends LaunchQuite {
	@Test(retryAnalyzer = RevisePro.RevisionProject.RetryPro.class,dataProvider = "input")
	public void testAppoint(String comments) {
		
		Rev_HomePage hp = new Rev_HomePage(driver);
		hp.clickMakeAppoint();
		
		Rev_LoginPage lp = new Rev_LoginPage(driver);
		lp.inputUsername();
		lp.inputPassword();
		lp.clickLogin();
		
		Rev_MakeAppointmentPage mp = new Rev_MakeAppointmentPage(driver);
		
		mp.selectFacility();
		mp.clickApply();
		mp.clickDateField();
		mp.clickNextMonth();
		mp.clickDate();
		mp.inputCommnets(comments);
		mp.clickBook();
		
		Assert.assertTrue(mp.verify.isDisplayed());
	}
	
	@DataProvider(name="input")
	public Object[][] dataTest(){
		return new Object[][]{{"testing data"}};
		
	}

}
