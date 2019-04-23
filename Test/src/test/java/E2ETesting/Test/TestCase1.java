package E2ETesting.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestCase1
{
@Test
public void launchBrowser()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asma\\Desktop\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("abc");
	driver.findElement(By.id("pass")).sendKeys("pass");
	driver.quit();
	
}
}
