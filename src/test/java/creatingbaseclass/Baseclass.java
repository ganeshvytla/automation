package creatingbaseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Baseclass {
	WebDriver d;
	
	@BeforeTest(description="this is the script for opening browser")
	public void openingbrowser() {
		
		Reporter.log("inistiating browser driver",true);
		System.setProperty("webdriver.chrome.driver", "D:\\ganeshvytla\\SELENIUM JAR FILES\\chromedriver_win32 (1)\\chromedriver.exe");
		Reporter.log("inistiation browser done",true);
		
		Reporter.log("inistiating browser interface",true);
	 d = new ChromeDriver();
		Reporter.log("inistiating browser interface done",true);
		
		Reporter.log("maxmizing browser window",true);
		d.manage().window().maximize();
		Reporter.log("maxmizing browser window done",true);
		
	}
	
	@AfterTest(description="this is the script for closing browser")
	public void quitbrowser() {
		
		d.quit();
		Reporter.log("browser quit done",true);
	}
}
