package justrechargeit;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Addmobileno extends Jri_login {
	 WebDriver driver;
  @Test
  public void f1() throws IOException, JXLException, Exception {
	  login();
	  String path = "C:/Users/a1103650/workspace/testdata.xls";
		FileInputStream R = new FileInputStream(path);
		Workbook w = Workbook.getWorkbook(R);
		Sheet S = w.getSheet("mobile no");
		//driver.findElement(By.id("txtMobileNickName")).sendKeys("Dad");
		if (driver.findElement(By.id("btnAddServices")).isEnabled()) {
			
			System.out.println("Add button is clickable");
			
			
		} else {
			System.out.println("Add button is not clickable");

		} 
		
		
		 //Entered mobile number details should add in the table
		
		for (int i = 1; i < S.getRows(); i++){
			
			driver.findElement(By.xpath(".//*[@id='divLnkAddMobile']/a")).click();
			Thread.sleep(2000);
		
		driver.findElement(By.id("txtpopMobileNo")).sendKeys(S.getCell(1, i).getContents());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// provide password
		driver.findElement(By.id("txtpopMobileNickname")).sendKeys(S.getCell(0, i).getContents());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// click on login
		driver.findElement(By.id("btnPopupAddMobile")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='btnPopupAddMobile']")).click();
		Thread.sleep(3000);
		}
	  
	  
	  
  }
}
