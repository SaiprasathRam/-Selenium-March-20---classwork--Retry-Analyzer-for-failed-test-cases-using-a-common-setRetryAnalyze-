package IRetryAnalyzerCode;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTCs implements IRetryAnalyzer {
	
	int maxretry = 3;
	int retry =0;

	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(!result.isSuccess() && retry < maxretry)
		{
			retry++;
			return true;
		}
		
		return false;
	}

}
