package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginpageObjects {
	//userName, password, loginButton
	
public static WebElement userName(WebDriver driver) {
	return driver.findElement(By.id("txtUsername"));
}
public static WebElement password(WebDriver driver) {
	return driver.findElement(By.id("txtPassword"));
}
public static WebElement loginButton(WebDriver driver) {
	return driver.findElement(By.id("btnLogin"));
}
}
	