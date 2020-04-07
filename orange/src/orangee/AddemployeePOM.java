package orangee;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjectModel.LoginpageObjects;
public class AddemployeePOM {
 @Test
public  void addingEmployee() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Selenium\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	LoginpageObjects.userName(driver).sendKeys("Admin");
	LoginpageObjects.password(driver).sendKeys("admin123");
	LoginpageObjects.loginButton(driver).click();
	driver.findElement(By.xpath("//*[@id=\'menu_admin_viewAdminModule\']/b")).click();
	

}
}

