package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hardassert {
	
	
	@Test
	public void test1() {
		Assert.assertEquals(true, true);
		System.out.println("in test1");
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(true, false);
		System.out.println("in test2");
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(false, false);
		System.out.println("in test3");
	}
}
