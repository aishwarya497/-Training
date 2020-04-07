package orangee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderr {
	String[][] data= {
			{"adminnn","admin123"},
			{"admin","admin1234"},
			{"adminnn","admin1234"},
			{"admin","admin123"}};
	 @DataProvider(name="loginData")
	public String[][] loginDataProvider(){
		return data;
	}
	@Test(dataProvider="loginData")
	public void main(String uName, String pWord) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		WebElement userName=driver.findElement(By.id("txtUsername"));
		userName.sendKeys("uName");
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys("pWord");
		WebElement loginbtn=driver.findElement(By.id("btnLogin"));
		loginbtn.click();
		driver.quit();
	}

	}

