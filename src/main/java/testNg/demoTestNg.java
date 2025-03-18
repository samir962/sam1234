package testNg;

import org.testng.annotations.Test;

public class demoTestNg {
	
	@Test(priority=1)
	void loginapp() {
		
		System.out.println("login the application");
		
	}
	
	@Test(priority=1)
	void VerifyHomepage() {
		
		System.out.println("abcds");
		
	}
	
	
	
	@Test
	void logotApp() {

		System.out.println("logout the application");

	}


}
