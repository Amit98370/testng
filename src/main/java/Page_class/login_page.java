package Page_class;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baselibrary.Baselibrary;

public class login_page extends Baselibrary {
	public login_page()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@type='text']")
	private WebElement username;
	@FindBy(xpath = "//*[@type='password']")
	private WebElement passward;
	@FindBy(xpath = "//*[@value='1']")
	private WebElement loginbutton;	
	
	public void login()
	{
		try 
		{
		Thread.sleep(1000);
		username.sendKeys(getreaddataprop("username"));
		Thread.sleep(1000);
		passward.sendKeys(getreaddataprop("password"));
		Thread.sleep(1000);
		loginbutton.click();		
		} 
		catch (Exception e) 
		{
		System.out.println("Issue in "+e);
		}
	}

}
