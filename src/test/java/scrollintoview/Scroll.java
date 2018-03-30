package scrollintoview;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scroll {
@Test
public void sada() {
	

	System.setProperty("webdriver.chrome.driver","D:\\ganeshvytla\\SELENIUM JAR FILES\\chromedriver_win32 (1)\\chromedriver.exe");	

	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	
	d.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");

JavascriptExecutor js = (JavascriptExecutor)d;

WebElement ele = d.findElement(By.xpath(".//*[@id='mCSB_3_container']/p[8]"));

js.executeScript("arguments[0].scrollIntoView(true);",ele);

System.out.println(ele.getText());




}
}