package highlight_elements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Coloringtoele {


	public static void wer(WebElement ele,WebDriver d) throws InterruptedException {
		
	JavascriptExecutor js = (JavascriptExecutor)d;
	
	js.executeScript("arguments[0].setAttribute('style','background:yellow; border:2px solid red;');",ele);
	try {
		Thread.sleep(3000);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	js.executeScript("arguments[0].setAttribute('style','background:yellow; border:2px solid white;');",ele);
	
	}
}
