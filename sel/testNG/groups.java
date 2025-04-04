package testNG;

import org.testng.annotations.Test;

public class groups {
	@Test(groups = {"F1", "F2"})
	public void sanitytest1() {
		System.out.println("execution F1 and F2 testcases");
	}
	
	@Test(groups = {"F1"})
	public void regressiontest1() {
		System.out.println("execution F1 testcases");
	}
	
	@Test(groups = {"F2"})
	public void sanitytest2() {
		System.out.println("execution F2 testcases");
	}
	
	@Test(groups = {"F1"})
	public void regressiontest2() {
		System.out.println("execution F1 testcases");
	}
}
