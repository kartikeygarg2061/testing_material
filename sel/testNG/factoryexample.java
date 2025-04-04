package testNG;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class factoryexample {
	
	private String browser;
	
	public factoryexample(String browser) {
		this.browser = browser;
	}
	
	@Test
	public void testmethod() {
		System.out.println("test browser is : " + browser);
	}
	
	@Factory
	public static Object[] factorymethod() {
		Object [] brw = {
				new factoryexample("chrome"),
				new factoryexample("edge"),
				new factoryexample("firefox")
		};
		
		return brw;
	}
}
