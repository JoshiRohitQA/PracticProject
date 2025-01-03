package RevisePro.RevisionProject;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenersPro implements ITestListener{

	static WebDriver driver;
	
	
	public void onTestSuccess(ITestResult result) {
		
		ITestListener.super.onTestSuccess(result);
		
		Date d1 = new Date();
		Date d2 = new Date(d1.getTime());
		String time=d2.toString();
	
		
		String month=time.substring(4,7);
	
		String date=time.substring(8,10);
	
		
		String acTime=time.substring(11,19);
		String actualTime=acTime.replace(":", "_");
		
		
		String timeFormat=month.concat(date).concat(actualTime);
		
		Reporter.log("TestCase is passed");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\Users\\ASUS\\eclipse-workspace\\RevisionProject\\ScreenShots\\Passed\\TCPassed"+timeFormat+".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
	public void onTestFailure(ITestResult result) {
		ITestListener.super.onTestFailure(result);
		
		
		Date d1 = new Date();
		Date d2 = new Date(d1.getTime());
		String time=d2.toString();
	
		
		String month=time.substring(4,7);
	
		String date=time.substring(8,10);
	
		
		String acTime=time.substring(11,19);
		String actualTime=acTime.replace(":", "_");
		
		
		String timeFormat=month.concat(date).concat(actualTime);
		
		Reporter.log("TestCase is failed");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\Users\\ASUS\\eclipse-workspace\\RevisionProject\\ScreenShots\\Failed\\TCFailed"+timeFormat+".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
