package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlipkartTest {
  @Test
  public void f() 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\Ankita Setup\\OldChromeDriver\\chromedriver96.exe");
		WebDriver d=new ChromeDriver();
      System.out.println("Flipkart opening");
		d.manage().window().maximize();
		d.get("https://www.flipkart.com");
		Reporter.log("Flipkart opened");
		d.close();
  }
}
