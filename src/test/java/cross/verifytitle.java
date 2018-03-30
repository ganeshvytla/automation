package cross;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class verifytitle {

	WebDriver d;
	@Test
	@Parameters("browser")
	public void verify(String browsername) {
		
		if(browsername.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chromecmd.driver","D:\\ganeshvytla\\SELENIUM JAR FILES\\chromedriver_win32 (1)\\chromedriver.exe");	
			d= new ChromeDriver();
		}/*else if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\ganeshvytla\\SELENIUM JAR FILES\\chromedriver_win32 (1)\\chromedriver.exe");			
			d= new ChromeDriver();
		}else if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.ie.driver","D:\\ganeshvytla\\SELENIUM JAR FILES\\chromedriver_win32 (1)\\chromedriver.exe");			
			d= new ChromeDriver();
		}*/
	
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		
		String actual = d.getTitle();
		String expected = "Facebook – log in or sign up";
		
		Assert.assertEquals(actual, expected);
		System.out.println("titled matched");		
	}

	@AfterMethod
 public void teardown() {
	 d.quit();
 }
}
