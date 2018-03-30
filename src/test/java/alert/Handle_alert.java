package alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Handle_alert {

	@Test
	public void accet() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\ganeshvytla\\SELENIUM JAR FILES\\chromedriver_win32 (1)\\chromedriver.exe");	

		WebDriver d = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)d;
	
		js.executeScript("alert('selenium')" ,"cancel");
		
		WebDriverWait wt = new WebDriverWait(d,120);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		
		d.switchTo().alert().accept();
	}
}
