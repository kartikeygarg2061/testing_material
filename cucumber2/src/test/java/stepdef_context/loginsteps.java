package stepdef_context;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities2.scenario_context;
import utilities2.testcontext;

public class loginsteps{
	
	testcontext tcontext;
	
	@When("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_valid_username_and_password(String uid, String pwd) {
		tcontext = new testcontext();
		System.out.println("user enters valid username namd and password");
		tcontext.set(scenario_context.USERNAME.toString(), uid);
		
		tcontext.set(scenario_context.SESSION_TOKEN.toString(), "asd789");
	}
	@Then("user session should be available")
	public void verify_user_session() {
		String storeduid = (String) tcontext.get(scenario_context.USERNAME.toString());
		String sessiontoken = (String) tcontext.get(scenario_context.SESSION_TOKEN.toString());
		
		System.out.println("storedid : " + storeduid + "session_token : " + sessiontoken);
	}
}
