package RevisePro.RevisionProject;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends LaunchQuite{

	@Test(retryAnalyzer = RevisePro.RevisionProject.RetryPro.class)
	public void testLogin() throws EncryptedDocumentException, IOException {
		DDtPro dp = new DDtPro();
		dp.dataTest();
		Rev_HomePage hp = new Rev_HomePage(driver);
		hp.clickMakeAppoint();
		Rev_LoginPage lp = new Rev_LoginPage(driver);
		lp.inputUsername();
		lp.inputPassword();
		lp.clickLogin();
		
		
		Assert.assertEquals(driver.getTitle(), "CURA Healthcare Service");
		
	}

}
