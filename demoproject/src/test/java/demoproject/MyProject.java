package demoproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class MyProject {
	public WebDriver driver;
@BeforeMethod
public void openApp() {
	System.setProperty("webdriver.gecko.driver", "E:\\webdriver\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("https://www.yatra.com");
}
@Test
public void tesScript() {
	System.out.println(driver.getTitle());
	driver.findElement(By.xpath("//span[.='Holidays']")).click();
	System.out.println(driver.getTitle());
	System.out.println("Done");
}
@AfterTest
public void closeApp() {
	driver.quit();
}
}
