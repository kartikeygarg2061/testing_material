package assignlistener;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import utilities.common_methods;

public class listener implements ITestListener {
	
	common_methods cm;
	
	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("test started : " + result.getName());
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		cm = new common_methods();
		Reporter.log("test failed : " + result.getName());
		try {
			cm.screenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
