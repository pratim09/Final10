package com.ctli.it.testcases;

import org.testng.annotations.Test;

import com.ctli.it.lib.TestNgInitialization;
import com.ctli.it.webpage.Ghost_Loginpage;
import com.ctli.it.webpage.Ghost_Homepage;


public class Ghost_WebScenario1 extends TestNgInitialization{
	
	@Test
	public void WebPage_Scenario() {
		Ghost_Loginpage login= new Ghost_Loginpage(driver, testReport);
		Ghost_Homepage webpage=new Ghost_Homepage(driver, testReport);
		
		login.Login_page1();
		webpage.completescenario1();
		
	}

}
