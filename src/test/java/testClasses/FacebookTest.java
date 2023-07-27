package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FacebookTest {
  @Test
  public void facebookTest() 
  {

		System.setProperty("webdriver.chrome.driver", "E:\\Ankita Setup\\OldChromeDriver\\chromedriver96.exe");
		WebDriver d=new ChromeDriver();
      System.out.println("Facebook opening");
		d.manage().window().maximize();
		d.get("https://www.facebook.com/signup");
		Reporter.log("Facebook opened");
		d.close();
  }
}
