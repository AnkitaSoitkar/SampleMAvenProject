package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Myntra {
  @Test
  public void myntraTest() 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\Ankita Setup\\OldChromeDriver\\chromedriver96.exe");
		WebDriver d=new ChromeDriver();
      System.out.println("Myntra opening");
		d.manage().window().maximize();
		d.get("https://www.myntra.com");
		Reporter.log("Amazon opened");
		
		d.close();
  }
}
