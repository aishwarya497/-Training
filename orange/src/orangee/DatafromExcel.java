package orangee;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DatafromExcel {
	String[][] data= null;
	 @DataProvider(name="loginData")
	public String[][] loginDataProvider() throws BiffException, IOException{
	data=getExcelData();
		return data;
	}
	 public String[][] getExcelData()throws BiffException, IOException{
	 FileInputStream excel=new FileInputStream("C:\\Users\\USER\\Documents\\LoginExcel.xls");
	 Workbook workbook=Workbook.getWorkbook(excel);
	 Sheet sheet=workbook.getSheet(0);
	 int rowCounts=sheet.getRows();
	 int columnCounts=sheet.getColumns();
	 String testData[][]=new String[rowCounts-1][columnCounts];
	 for(int i=1;i<rowCounts;i++)
	 {
		 for(int j=0;j<columnCounts;j++)
		 {
		 testData[i-1][j]=sheet.getCell(j,i).getContents(); 
	 }
}
return testData;
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

