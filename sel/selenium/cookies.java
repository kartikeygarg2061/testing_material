package selenium;

import org.openqa.selenium.Cookie;

public class cookies extends common_methods {
		
		public static void addcookie(String cname, String cvalue) {
			Cookie c = new Cookie(cname, cvalue);
			dr.manage().addCookie(c);
		}
		public static void display_cookie() {
			for(Cookie c : dr.manage().getCookies()) {
				System.out.println("name : " + c.getName() + "    value : " + c.getValue());
			}
		}
		
		public static void delete_cookie(String cname) {
			dr.manage().deleteCookieNamed(cname);
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch_chrome("https://flipkart.com");
		addcookie("usersession", "12345");
		addcookie("place", "bangalore");
		addcookie("page", "products page");
		
		display_cookie();
		
		delete_cookie("place");
		
		if(dr.manage().getCookieNamed("place") == null) {
			System.out.println("cookie deleted succesfully");
		}
		else {
			System.out.println("cookie not deleted");
		}
		
	}

}
