package com.mystore.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.mystore.actiondriver.Action;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseClass {
	
	public static Properties prop;
	public static  WebDriver driver;
	
	@BeforeMethod
	
	public void loadConfig() 
	{
		
	
		
		try {
			prop = new Properties();
			//System.out.println("super constructor invoked");
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "\\Configuration\\Config.properties");
			prop.load(ip);
			//System.out.println("driver: " + driver);

		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	
	
	}
	
	 
	public static void launchApp() {
		
		//WebDriverManager.chromedriver().setup();
		
		String browserName = prop.getProperty("browser");
		 
		if (browserName.contains("Chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}
		else if (browserName.contains("Firefox")) 
		{
			//WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
			
		}
		else if (browserName.equalsIgnoreCase("IE"))
		{
			//WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		Action.implicitWait(driver, 100);
		Action.pageLoadTimeOut(driver, 300);
		driver.get(prop.getProperty("url"));	
		
}
	@AfterMethod
	//@AfterSuite
	public void teardown() 
	{
		
		driver.quit();
		
	}
	 public static String screenShot(WebDriver driver ,String filename) 
		{
			//String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
			File source=takesScreenshot.getScreenshotAs(OutputType.FILE);
			String destination = System.getProperty("user.dir")+"\\Screenshot\\"+filename+".png";
			File finalDestination = new File(destination);
			try {
				FileUtils.copyFile(source, finalDestination);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.getMessage();
			}
			return destination;
		}
	

}
