package RevisePro.RevisionProject;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

@Listeners(ListenersPro.class)
public class LaunchQuite extends ListenersPro{
	
	@Parameters("browser")
	@BeforeMethod
	public void setUp(String reqBrowser) {
		
		if(reqBrowser.equals("Edge")) {
			driver=new EdgeDriver();
		}
		
		if(reqBrowser.equals("chrome")) {
			driver=new ChromeDriver();
			}
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
