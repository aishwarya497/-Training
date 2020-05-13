package sbeexam1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Flightsearchtestng {
	@Test
	public void main() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Selenium\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.navigate().to("http://newtours.demoaut.com/");
	//SignOn
    WebElement Signon=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a"));
    Signon.click();
     //Register
    driver.navigate().to("http://newtours.demoaut.com/");
    WebElement Register=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
    Register.click();
    //support
    driver.navigate().to("http://newtours.demoaut.com/");
    WebElement Support=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[3]/a"));
    Support.click();
    //Contact
    driver.navigate().to("http://newtours.demoaut.com/");
    WebElement Contact=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[4]/a"));
    Contact.click();

}

}


		
	