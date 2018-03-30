package creatingbaseclass;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Loginapp1 extends Baseclass {

	@Test(dataProvider="getdata")
	public void validcred(String un,String pss) {
		
		d.get("https://www.facebook.com");
		
		d.findElement(By.xpath("//*[@id='email']")).sendKeys("un");
		d.findElement(By.xpath("//*[@id='pass']")).sendKeys("pss");
		d.findElement(By.xpath("//*[@type='submit']")).click();

	}


@DataProvider(name="getdata")
public Object[][] passdata(){
	
	Object[][] data = new Object[3][2];
	
	data[0][0] = "ganesh.vytla@gmail.com";
	data[0][1] = "ganesh9010556155@";
	
	data[1][0] = "ganesh";
	data[1][1] = "ganesh";
	
	data[2][0] = "ganesh";
	data[2][1] = "ganesh";
	return data;
	
	
}
}