package Page_class;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Baselibrary.Baselibrary;

public class Createpost_page extends Baselibrary {
	
	public Createpost_page()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@type='text']")
	private WebElement username;
	@FindBy(xpath = "//*[@type='password']")
	private WebElement passward;
	@FindBy(xpath = "//*[@value='1']")
	private WebElement loginbutton;	
	
	@FindBy(xpath = "//*[@class='x1lkfr7t xkjl1po x1mzt3pk xh8yej3 x13faqbe xi81zsa']")
	private WebElement postbutton;
	@FindBy(xpath = "//*[@class=\"xw3qccf xeaf4i8\"]")
	private WebElement changepoststatus;
	@FindBy(xpath = "//*[@data-visualcompletion='css-img'][@class='x1b0d499 xi3auck']")
	private WebElement onlyme;
	@FindBy(xpath = "//*[@class=\"xdj266r x11i5rnm xat24cr x1mh8g0r x16tdsg8\"][@xpath=\"1\"]")
	private WebElement status;
	@FindBy(xpath = "//*[@class=\"x6s0dn4 x78zum5 xl56j7k x1608yet xljgi0e x1e0frkt\"][@xpath=\"1\"]")
	private WebElement postdonebutton;
	
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
	public void createpost()
	{
		try
		{
			Thread.sleep(5000);
			postbutton.click();
			Thread.sleep(5000);
			changepoststatus.click();
			Thread.sleep(5000);
			onlyme.click();
			Thread.sleep(5000);	
			status.sendKeys(getreaddataprop("postcontent"));
			Thread.sleep(5000);
			postdonebutton.click();
		}
		catch (Exception e) 
		{
			System.out.println("Issue in "+e);
		}	
	}
}
