package Test_page;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Baselibrary.Baselibrary;
import Page_class.login_page;

public class Login_test extends Baselibrary {
	login_page lp;
	
	@BeforeTest
	public void launch_facebook() throws Exception
	{
		Thread.sleep(1000);
		launchurl(getreaddataprop("url"));
		lp=new login_page();
	}
	
	@Test(priority = 0)
	public void login()
	{
		lp.login();
	}

}
