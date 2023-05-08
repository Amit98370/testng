package Test_page;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Baselibrary.Baselibrary;
import Page_class.Send_message_page;

public class Send_message_test extends Baselibrary {

	Send_message_page smp;
	
	@BeforeTest
	public void launch_facebook() throws Exception
	{
		Thread.sleep(1000);
		launchurl(getreaddataprop("url"));
		smp=new Send_message_page();
	}
	
	@Test(priority = 0)
	public void login()
	{
		smp.send_message();
	}
}
