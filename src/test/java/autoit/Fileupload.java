package autoit;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Fileupload {

	@Test
	public void swe() throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","D:\\ganeshvytla\\SELENIUM JAR FILES\\chromedriver_win32 (1)\\chromedriver.exe");	
		WebDriver d = new ChromeDriver();
d.get("file:///C:/Users/Ganesh/Desktop/fileupload.html");

d.manage().window().maximize();

d.findElement(By.xpath(".//*[@id='load']")).click();

Thread.sleep(2000);
Runtime.getRuntime().exec("C:\\Users\\Ganesh\\Desktop\\venu's tusion file\\fileupload2.exe"+" "+"C:\\Users\\Ganesh\\Downloads\\29082013161402-automatic-street-light-powered-through-speed-break.ppt");

Thread.sleep(2000);
d.findElement(By.xpath(".//*[@id='load']")).click();


Thread.sleep(2000);
Runtime.getRuntime().exec("C:\\Users\\Ganesh\\Desktop\\venu's tusion file\\fileupload2.exe"+" "+"C:\\Users\\Ganesh\\Desktop\\file.txt");

	}
}
