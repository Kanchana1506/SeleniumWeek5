package week5.day1.assigment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public ChromeDriver driver;
		
		@BeforeMethod
		public void login()
		{
			  System.setProperty("webdriver.chrome.driver","./drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				
				//1. Launch URL "http://leaftaps.com/opentaps/control/login"
				driver.get("http://leaftaps.com/opentaps/control/login");
				driver.manage().window().maximize();
				
				
				//2. Enter UserName and Password Using Id Locator
				WebElement usrname = driver.findElementById("username");
				usrname.sendKeys("demosalesmanager");

				WebElement pwd = driver.findElementById("password");
				pwd.sendKeys("crmsfa");
				
				//3. Click on Login Button using Class Locator
				WebElement submit = driver.findElementByClassName("decorativeSubmit");
				submit.click();
				
				// 4. Click on CRM/SFA Link1
				WebElement crmlink = driver.findElementByLinkText("CRM/SFA");
				crmlink.click();
				
				//5. Click on Leads Button
				WebElement leads = driver.findElementByLinkText("Leads");
				leads.click();
	
		}

		@AfterMethod
		public void close()
		{
			driver.close();
			
		}
	}

