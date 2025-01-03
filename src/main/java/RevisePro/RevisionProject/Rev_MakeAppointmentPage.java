package RevisePro.RevisionProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Rev_MakeAppointmentPage {
	WebDriver driver;
	
	@FindBy(xpath="//select[@id='combo_facility']")
	WebElement facility;
	
	
	@FindBy(xpath="//input[@id='chk_hospotal_readmission']")
	WebElement applyBtn;
	
	@FindBy(xpath="//input[@name='visit_date']")
	WebElement inputDate;
	
	
	@FindBy(xpath="//thead/tr/th")
	List<WebElement> liMonthNext;
	
	@FindBy(xpath="//tbody/tr/td")
	List<WebElement>liDate;
	
	@FindBy(xpath="//textarea[@id='txt_comment']")
	WebElement comments;
	
	@FindBy(xpath="//button[@id='btn-book-appointment']")
	WebElement book;
	
	@FindBy(xpath="//a[@class='btn btn-default']")
	WebElement verify;
	
	
	public void selectFacility() {
		Select s1 = new Select(facility);
		s1.selectByValue("Hongkong CURA Healthcare Center");
	}
	
	public void clickApply() {
		applyBtn.click();
	}
	
	public void clickDateField() {
		inputDate.click();
	}
	
	public void clickNextMonth() {
		liMonthNext.get(3).click();
	}
	
	public void clickDate() {
		liDate.get(24).click();
	}
	
	public void inputCommnets(String commentss) {
		comments.sendKeys(commentss);
	}
	
	public void clickBook() {
		book.click();
	}
	
	
	
	 public Rev_MakeAppointmentPage (WebDriver driver) {
	
		PageFactory.initElements(driver, this);
	}	
}
