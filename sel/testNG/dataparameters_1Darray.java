package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataparameters_1Darray {
	
	@DataProvider(name = "testdata")
	public Object[] getdata() {
		Object[] testdata = new Object[] {
				"user1",
				"user2",
				"user3"
		};
		return testdata;
	}
	
	@Test(dataProvider = "testdata")
	public void testlogin(String uid) {
		System.out.println("user id : " + uid);
	}
}
