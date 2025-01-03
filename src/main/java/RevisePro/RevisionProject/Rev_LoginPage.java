package RevisePro.RevisionProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Rev_LoginPage extends DDtPro{
	WebDriver driver;
	
	@FindBy(xpath="//input[@name='username']")
	WebElement userName;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passWord;
	
	@FindBy(xpath="//button[@id='btn-login']")
	WebElement logBtn;
	
	
	public void inputUsername() {
		userName.sendKeys(username);
	} 
	
	public void inputPassword() {
		passWord.sendKeys(password);
	}
	
	public void clickLogin() {
		logBtn.click();
	}
	
	
	public Rev_LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
