package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametrizationexample {
	
	public void test() {
		
	}
	
	@Test
	@Parameters({"OS"})
	
	public void testwithparameters(String OS) {
		System.out.println("running test on OS : " + OS);
	}

}
