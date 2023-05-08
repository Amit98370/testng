package Test_page;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Baselibrary.Baselibrary;
import Page_class.Createpost_page;

public class Createpost_test extends Baselibrary {
	
	Createpost_page cp;
	
	@BeforeTest
	public void launchurl()
	{
		launchurl(getreaddataprop("url"));
		cp=new Createpost_page();
	}
	@Test(priority = 0)
	public void login()
	{
		cp.login();	
		logger.info("login");
		
	}
	@Test(priority = 1)
	public void createpost()
	{
		cp.createpost();
		logger.info("Create post");
	}

}
