package sbeexam1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FlightSearch {
	public static  void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Selenium\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.navigate().to("http://newtours.demoaut.com/");
WebElement register= driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
register.click();
WebElement username= driver.findElement(By.name("email"));
username.sendKeys("aishwaryamk497@gmail.com");
WebElement password= driver.findElement(By.name("password"));
password.sendKeys("Aishwarya@1234");
WebElement confirmpassword= driver.findElement(By.name("confirmPassword"));
confirmpassword.sendKeys("Aishwarya@1234");
WebElement submit= driver.findElement(By.name("register"));
submit.click();
WebElement flights=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a"));
flights.click();
WebElement type=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]"));
type.click();
WebElement selpassengers=driver.findElement(By.name("passCount"));
Select select=new Select(selpassengers);
select.selectByValue("1");
WebElement departingfrom=driver.findElement(By.name("fromPort"));
Select select1=new Select(departingfrom);
select1.selectByVisibleText("London");
WebElement Month=driver.findElement(By.name("fromMonth"));
Select select2=new Select(Month);
select2.selectByVisibleText("June");
WebElement Day=driver.findElement(By.name("fromDay"));
Select select3=new Select(Day);
select3.selectByValue("1");
WebElement Arrival=driver.findElement(By.name("toPort"));
Select select4=new Select(Arrival);
select4.selectByVisibleText("Paris");
WebElement ToMonth=driver.findElement(By.name("toMonth"));
Select select5=new Select(ToMonth);
select5.selectByValue("7");
WebElement ToDate=driver.findElement(By.name("toDay"));
Select select6=new Select(ToDate);
select6.selectByValue("1");
WebElement SERclass=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]"));
SERclass.click();
WebElement airlines=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/select/option[2]"));
airlines.click();
WebElement continue1=driver.findElement(By.name("findFlights"));
continue1.click(); 
}

}
