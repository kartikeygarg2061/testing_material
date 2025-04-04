package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassert {
	
	SoftAssert sa;
	
	@Test
	public void test1() {
		sa = new SoftAssert();
		
		sa.assertEquals(false, true);
		System.out.println("in test1");
		sa.assertAll();
	}
	
	@Test
	public void test2() {
		
		sa.assertEquals(true, true);
		System.out.println("in test2");
		sa.assertAll();
	}
	
	@Test
	public void test3() {
		
		sa.assertEquals(true, true);
		System.out.println("in test3");
		sa.assertAll();
	}
}
