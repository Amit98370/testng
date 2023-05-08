package Page_class;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baselibrary.Baselibrary;

public class Send_message_page extends Baselibrary {

	public Send_message_page()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@type='text']")
	private WebElement username;
	@FindBy(xpath = "//*[@type='password']")
	private WebElement passward;
	@FindBy(xpath = "//*[@value='1']")
	private WebElement loginbutton;
	@FindBy(xpath = "//*[@aria-label=\"Messenger\"][@tabindex=\"0\"]")
	private WebElement messengerbutton;
	@FindBy(xpath = "//*[@aria-label=\"Search Messenger\"]")
	private WebElement searchmessenger;
	@FindBy(xpath = "//*[@class=\"x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft\"][text()='Somesh Kandwal']")
	private WebElement someshkandwal;
	@FindBy(xpath = "//*[@class=\"xat24cr xdj266r\"]")
	private WebElement messagebox;
	@FindBy(xpath = "//*[@class=\"xsrhx6k\"][@viewBox=\"0 0 24 24\"]")
	private WebElement messagebutton;
	
	
	public void send_message()
	{
		try 
		{
		Thread.sleep(1000);
		username.sendKeys(getreaddataprop("username"));
		Thread.sleep(1000);
		passward.sendKeys(getreaddataprop("password"));
		Thread.sleep(1000);
		loginbutton.click();
		Thread.sleep(3000);
		//driver.switchTo().alert().dismiss();
		messengerbutton.click();
		Thread.sleep(2000);
		searchmessenger.sendKeys(getreaddataprop("search_user"));
		Thread.sleep(3000);
		someshkandwal.click();
		Thread.sleep(2000);
		messagebox.sendKeys("hy");
		Thread.sleep(1000);
		messagebutton.click();
		} 
		catch (Exception e)
		{
		System.out.println("Issue in "+e);
		}
	}	
}
