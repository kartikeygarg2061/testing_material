package Tests;

import java.io.IOException;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.selenium.maven_prj1.App;

import POM.login_page;
import POM.product_page;
import utilities.common_methods;

public class newtest1 extends common_methods{
	login_page lp;
    product_page pp;
    String[][] credentials;
 
    @BeforeClass
    public void setup() throws IOException {
        credentials = read_data();
    }
 
    @BeforeMethod
    public void bm() {
        launch_chrome("https://www.saucedemo.com");
        lp = new login_page(dr);
        pp = new product_page(dr);
    }
 
    @Test
    public void test1() {
        lp.enter_uname(credentials[0][0]);
        lp.enter_password(credentials[0][1]);
        lp.click_login();
        String atitle = pp.get_title();
        Assert.assertEquals("Products", atitle);
    }
 
    @Test
    public void test2() {
        lp.enter_uname(credentials[1][0]);
        lp.enter_password(credentials[1][1]);
        lp.click_login();
        String atitle = pp.get_title();
        Assert.assertEquals("Products", atitle);
    }
    
    @AfterMethod
    public void am() {
        dr.close();
    }
	
}





