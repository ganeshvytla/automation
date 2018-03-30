package scrollintoview;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrollpage {

	@Test
	public void sada1() {
		

		System.setProperty("webdriver.chrome.driver","D:\\ganeshvytla\\SELENIUM JAR FILES\\chromedriver_win32 (1)\\chromedriver.exe");	

		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");

	JavascriptExecutor js =(JavascriptExecutor)	d;
	
	//js.executeScript("window.scrollBy(0,500)");
	
	js.executeScript("scroll(0,500)");
	
	}
}