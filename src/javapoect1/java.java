package javapoect1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class java 
{
@Test
public void logn(){

WebDriver driver=new ChromeDriver();
driver.get("https://facebookstar.com");
driver.close();
driver.quit();


}
		
}


