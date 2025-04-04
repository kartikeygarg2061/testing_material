package testNG;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class listener1 implements ITestListener{
	@Override
	public void onTestFailure(ITestResult Result) {
		Reporter.log("Test failed : " + Result.getName());
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("test pass : " + result.getName());
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("test started : " + result.getName());
	}
}