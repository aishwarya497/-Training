package orangee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BothInvalid {
	@Test
	public void case3() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Selenium\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
WebElement userName=driver.findElement(By.id("txtUsername"));
userName.sendKeys("adminnnn");
WebElement password=driver.findElement(By.id("txtPassword"));
password.sendKeys("admin1234");
WebElement loginbtn=driver.findElement(By.id("btnLogin"));
loginbtn.click();
driver.quit();
}
}


