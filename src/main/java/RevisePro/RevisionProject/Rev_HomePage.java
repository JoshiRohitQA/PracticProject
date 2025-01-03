package RevisePro.RevisionProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Rev_HomePage {
	WebDriver driver;
	
	@FindBy(xpath="//a[@id='btn-make-appointment']")
	WebElement makeAppoint;
	
	public void clickMakeAppoint() {
		makeAppoint.click();
	}
	
	
	public Rev_HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
