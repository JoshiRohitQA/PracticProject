package RevisePro.RevisionProject;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryPro implements IRetryAnalyzer {

	int current_count=0;
	int retry_count=1;
	
	public boolean retry(ITestResult result) {
		if(current_count<retry_count) {
			current_count++;
			return true;
		}
		return false;
	}
	

}
