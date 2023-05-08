package Baselibrary;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Application_utility.apllicationutility;
import Wait_utility.waitutility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baselibrary implements waitutility, apllicationutility {
	public static WebDriver driver;
	public static Logger logger;
	public static JavascriptExecutor js;
	String path="C:\\Users\\lenovo\\eclipse-workspace\\Facebook_Demo\\Test_Data\\config.properties";
	
	public void launchurl(String url) {
	//String value="C:\\Users\\lenovo\\eclipse-workspace\\Facebook_Demo\\Drivers\\chromedriver.exe";
	//System.setProperty("webdriver.chrome.driver", value);
	
	WebDriverManager.chromedriver().setup();
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--incognito");
	driver= new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get(url);
	logger=Logger.getLogger("FaceBook_Demo");
	PropertyConfigurator.configure("log4j.properties");
	}
	
	public String getreaddataprop(String key)
	{
		String value="";
		try 
		{
		FileInputStream fis=new FileInputStream(path);
		Properties prop=new Properties();
		prop.load(fis);
		value=prop.getProperty(key);
		}
	    
		catch (Exception e) 
		{
			System.out.println("Issue in property file "+e);
		}
		return value;
		
	}

	public void alert(int time) {
		// TODO Auto-generated method stub
		
	}
	
	public void scrolldown_up(WebElement element, WebDriver driver)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollInfoView(true)", element);	
	}
}
