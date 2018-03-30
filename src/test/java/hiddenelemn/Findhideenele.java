package hiddenelemn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Findhideenele {

	@Test
	public void cvbf() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\ganeshvytla\\SELENIUM JAR FILES\\chromedriver_win32 (1)\\chromedriver.exe");	

		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://www.bing.com/#");
		
		JavascriptExecutor js = (JavascriptExecutor)d;
		WebElement src=d.findElement(By.xpath("officemenu_word_img"));

        // WebElement src1=d.findElement(By.xpath("//div[@id='officemenu_word_img']"));
		
		
		js.executeScript("arguments[0].click()", src);
		//Thread.sleep(2000);
		//js.executeScript("argument[0].click()", src1);
	}
}




