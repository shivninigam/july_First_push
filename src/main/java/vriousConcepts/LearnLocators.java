package vriousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {
	WebDriver driver;
@Before
public void launchBrowser() {
	
	System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://objectspy.space/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
}
@Test
public void testLocators() throws InterruptedException {
	/*
	 * driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
	 * driver.navigate().back();
	 * driver.findElement(By.partialLinkText("TF-API ")).click();
	 */

driver.findElement(By.cssSelector("input#sex-1")).click();
driver.findElement(By.cssSelector("input[value='3']")).click();
Thread.sleep(3000);
driver.findElement(By.cssSelector("input[type='radio'][id='exp-3']")).click();

//Relative Xpath
driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("avcfgyh");
//using two attributes
driver.findElement(By.xpath("//input[@type='text'and @name='firstname']")).sendKeys("fghjy");

//Xpath to deal with Links
driver.findElement(By.xpath("//strong[text()='Link Test : New Page']")).click();
driver.findElement(By.xpath("//strong[contains(text(),'Link Test : Page Change')]")).click();

driver.findElement(By.xpath("//input[@id='tool-1']")).click();
driver.findElement(By.xpath("//input[@id=\"tool-1\"]")).click();//\ is used to identify as a character , do not use " as chrome doesnt know




}
}