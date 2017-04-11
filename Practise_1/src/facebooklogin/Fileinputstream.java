
package facebooklogin;


import java.io.FileInputStream;
import java.io.IOException;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Fileinputstream {


	public static void main(String[] args) throws IOException, JXLException, Exception {

	WebDriver driver;

	// Chrome browser

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\a1103650\\workspace\\chromedriver.exe");

	driver = new ChromeDriver();


	// open url

	driver.get("https://www.justrechargeit.com/");

	driver.manage().window().maximize();





	String path = "C:/Users/a1103650/workspace/testdata.xls";



	FileInputStream R = new FileInputStream(path);
	Workbook w= Workbook.getWorkbook(R);
	Sheet S = w.getSheet("Sheet1");
	
	driver.findElement(By.id(S.getCell(3,1).getContents())).sendKeys(S.getCell(4,1).getContents());

	new Select(driver.findElement(By.id(S.getCell(3,2).getContents()))).selectByVisibleText(S.getCell(4,2).getContents());

	driver.findElement(By.id(S.getCell(3,3).getContents())).sendKeys(S.getCell(4,3).getContents());
	Thread.sleep(1000);
	

	driver.findElement(By.id(S.getCell(3,4).getContents())).click();
	






}

}
