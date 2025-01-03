package RevisePro.RevisionProject;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;


@Listeners(ListenersPro.class)
public class LaunchQuite extends ListenersPro{
	
	@BeforeMethod
	public void setUp() {
			driver=new ChromeDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
