package selenium;
import java.util.*;
public class swaglabsassignment extends swaglabfunction{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the user id : ");
		String userid = sc.next();
		System.out.print("enter the password : ");
		String password = sc.next();
		System.out.print("enter the check data : ");
		String checkdata = sc.next();
		String msg = "Epic sadface: Username and password do not match any user in this service";
		
		
		validlogin(userid, password, checkdata);
//		invalidlogin(userid, password, msg);
		
	
		
	}
}
