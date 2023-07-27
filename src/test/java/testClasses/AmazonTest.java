package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AmazonTest {
	@Test
	public void amazonTest1()
	{

		System.setProperty("webdriver.chrome.driver", "E:\\Ankita Setup\\OldChromeDriver\\chromedriver96.exe");
		WebDriver d=new ChromeDriver();
        System.out.println("Amazon opening");
		d.manage().window().maximize();
		d.get("https://www.amazon.com");
		Reporter.log("Amazon opened");
		
		d.close();
	}
}
