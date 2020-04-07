package orangee;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatadrivenApachepoi {
static List<String> userNamelist=new ArrayList<String>();
static List<String> passwordlist=new ArrayList<String>();
public void readExcel() throws IOException
{
	FileInputStream excel=new FileInputStream("C:\\Users\\USER\\Documents\\Book1.xlsx");
	Workbook workbook=new XSSFWorkbook(excel);
	Sheet sheet=workbook.getSheetAt(0);
	Iterator<Row> rowIterator=sheet.iterator();
	while(rowIterator.hasNext()) {
		Row rowValue=rowIterator.next();
		Iterator<Cell> columnIterator=rowValue.iterator();
		int i=2;
		while(columnIterator.hasNext()) {
			if(i%2==0) {
				userNamelist.add(columnIterator.next().getStringCellValue());
			}
			else {
				passwordlist.add(columnIterator.next().getStringCellValue());
			}
			i++;
		}
	}
}
public void login(String uName, String pWord) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Selenium\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	WebElement userName=driver.findElement(By.id("txtUsername"));
	userName.sendKeys("uName");
	WebElement password=driver.findElement(By.id("txtPassword"));
	password.sendKeys("pWord");
	WebElement login=driver.findElement(By.id("btnLogin"));
	login.click();
	driver.quit();
}
public void executeTest() {
	for(int i=0; i<userNamelist.size();i++) {
		login(userNamelist.get(i),passwordlist.get(i));
	}
	
}
	
public static void main(String[] args) throws IOException {
	DatadrivenApachepoi usingPOI=new DatadrivenApachepoi ();
		usingPOI.readExcel();
		System.out.println("Usernamelistt"+ userNamelist);
		System.out.println("passwordlistt" + passwordlist);
		usingPOI.executeTest();
		
		
		// TODO Auto-generated method stub

	}

}
