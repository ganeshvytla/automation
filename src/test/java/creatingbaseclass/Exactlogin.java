package creatingbaseclass;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Exactlogin extends  Baseclass {

	@Test
	public void validcredtofb() {
		d.get("https://www.facebook.com/");
		d.findElement(By.id("usr")).sendKeys("");
		d.findElement(By.id("psd")).sendKeys("");
		d.findElement(By.id("btnlgn")).click();
	}

	@Test
	public void invalidcredtofb() {
		d.get("https://www.facebook.com/");
		d.findElement(By.id("usr1")).sendKeys("");
		d.findElement(By.id("psd1")).sendKeys("");
		d.findElement(By.id("btnlgn1")).click();
	}
}

