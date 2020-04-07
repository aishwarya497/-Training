package orangee;
import pageObjectModel.LoginpageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjectModel.AddEmployeePageObjectM;
public class AddEmployee {
@Test
public static void addUser() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Selenium\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	LoginpageObjects.userName(driver).sendKeys("Admin");
	LoginpageObjects.password(driver).sendKeys("admin123");
	LoginpageObjects.loginButton(driver).click();
	AddEmployeePageObjectM.adminButton(driver).click();
	AddEmployeePageObjectM.clickAdd(driver).click();
	Select getESS=new Select(AddEmployeePageObjectM.userRole(driver));
	getESS.selectByVisibleText("ESS");
	AddEmployeePageObjectM.empName(driver).sendKeys("aishwarya"+Keys.ENTER);
	AddEmployeePageObjectM.userNameofEmp(driver).sendKeys("aishmk4");
	Select userStat=new Select(AddEmployeePageObjectM.userStatus(driver));
	userStat.selectByVisibleText("Enabled");
	AddEmployeePageObjectM.userPassword(driver).sendKeys("Aish@4");
	AddEmployeePageObjectM.confirmPassword(driver).sendKeys("Aish@4");
	AddEmployeePageObjectM.saveButton(driver).click();
}
}
