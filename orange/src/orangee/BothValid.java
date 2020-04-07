package orangee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BothValid {
	@Test
	public void case4() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Selenium\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
WebElement userName=driver.findElement(By.id("txtUsername"));
userName.sendKeys("admin");
WebElement password=driver.findElement(By.id("txtPassword"));
password.sendKeys("admin123");
WebElement loginbtn=driver.findElement(By.id("btnLogin"));
loginbtn.click();
driver.quit();
}
}


