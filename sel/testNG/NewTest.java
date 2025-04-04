package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	
	@BeforeClass
	public void bfc() {
		System.out.println("in before class");
	}
	
	@AfterClass
	public void afc() {
		System.out.println("in after class");
	}
	
	@BeforeMethod
	public void bfm() {
		System.out.println("in before method");
	}
	
	@AfterMethod
	public void afm() {
		System.out.println("in after method");
	}
	
  @Test
  public void test1() {
	  System.out.println("in test 1");
  }
  
  @Test
  public void test2() {
	  System.out.println("in test 2");
  }
  
  @Test
  public void test3() {
	  System.out.println("in test 3");
  }
}
