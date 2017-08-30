package com.ctli.it.mobiletestcase;

import org.testng.annotations.Test;

import com.ctli.it.lib.TestNgInitialization;
import com.ctli.it.mobilepage.Ghost_MobLoginpage;
import com.ctli.it.mobilepage.Ghost_MobHomepage;


public class Ghost_MobileScenario extends TestNgInitialization{
	
	@Test
	public void Mobile_Scenario() {
		Ghost_MobLoginpage loginpage= new Ghost_MobLoginpage(mobiledriver, testReport);
		Ghost_MobHomepage mobilepage=new Ghost_MobHomepage(mobiledriver, testReport);
		
		loginpage.Login_page();
		mobilepage.completescenario();
		
	}

}
