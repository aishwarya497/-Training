package orangee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjectModel.LoginnpageObjects;

public class Loginpagee {
	@Test
	public void login() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Selenium\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
PageFactory.initElements(driver, LoginnpageObjects.class);
LoginnpageObjects.userName.sendKeys("Admin");
LoginnpageObjects.password.sendKeys("admin123");
LoginnpageObjects.LoginButn.click();
}
}