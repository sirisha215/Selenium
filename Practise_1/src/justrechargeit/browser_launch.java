package justrechargeit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class browser_launch {
  @Test
  public void f() throws InterruptedException, Exception, IOException {
	  WebDriver driver;
	  String path = "C:/Users/a1103650/workspace/testdata.xls";
		FileInputStream R = new FileInputStream(path);
		Workbook w = Workbook.getWorkbook(R);
		Sheet S = w.getSheet("mobile no");
		// chrome browser open
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a1103650\\workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		// open facebook URL
		driver.get("https://www.justrechargeit.com/");
		// maximise browser
		driver.manage().window().maximize();
		
		
		// Sign in
		
		driver.findElement(By.id("jriTop_signin9")).click();
		driver.findElement(By.id("txtUserName")).sendKeys("birram.sirisha@gmail.com");
		driver.findElement(By.id("txtPasswd")).sendKeys("123456");
		driver.findElement(By.id("imgbtnSignin")).click();
		
		
		//Add mobile number should be clickable
		
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
		
		//Edit any field and save
		
		driver.findElement(By.xpath(".//*[@id='listingtable_btnGridEdit_0']")).click();
		driver.findElement(By.xpath(".//*[@id='listingtable_txtMobileDTHNickname_0']")).sendKeys("daddy");
		driver.findElement(By.xpath(".//*[@id='listingtable_btnGridSave_0']")).click();
		
		// Edit any field and click on cancel button
		driver.findElement(By.xpath(".//*[@id='listingtable_btnGridEdit_1']")).click();
		driver.findElement(By.xpath(".//*[@id='listingtable_txtMobileDTHNickname_0']")).sendKeys("hhhhh");
		driver.findElement(By.xpath(".//*[@id='listingtable_btnGridCancel_1']")).click(); 
		
		//Delete mobile number
		
      driver.findElement(By.xpath(".//*[@id='listingtable_btnGridDelete_2']")).click();
      Thread.sleep(3000);
       // to get alert text
      
      String str=driver.switchTo().alert().getText();
      System.out.println(str);
      // to move alert and click on ok button
      driver.switchTo().alert().accept();
      
      // click on delete button and cancel the confirmation alert
      
      driver.findElement(By.xpath(".//*[@id='listingtable_btnGridDelete_1']")).click();
      Thread.sleep(3000);
       // to get alert text
      
      String str1=driver.switchTo().alert().getText();
      System.out.println(str1);
      
      // to move alert and click on cancel button
       driver.switchTo().alert().dismiss();
       
       //view popular recharges
       driver.findElement(By.id("listingtable_ImgRecharge_0")).click();
       driver.findElement(By.id("lnkPopularRecharge")).click();
		
		
  }
}
