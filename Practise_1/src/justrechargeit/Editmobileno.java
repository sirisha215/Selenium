package justrechargeit;

import java.io.IOException;

import jxl.JXLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Editmobileno extends Jri_login {
	WebDriver driver;
  @Test
  public void f() throws IOException, JXLException, Exception {
	  login();
	  Thread.sleep(6000);
	//Edit any field and save
		
			driver.findElement(By.xpath(".//*[@id='listingtable_btnGridEdit_0']")).click();
			driver.findElement(By.xpath(".//*[@id='listingtable_txtMobileDTHNickname_0']")).sendKeys("daddy");
			driver.findElement(By.xpath(".//*[@id='listingtable_btnGridSave_0']")).click();
			
			// Edit any field and click on cancel button
			driver.findElement(By.xpath(".//*[@id='listingtable_btnGridEdit_1']")).click();
			driver.findElement(By.xpath(".//*[@id='listingtable_txtMobileDTHNickname_0']")).sendKeys("hhhhh");
			driver.findElement(By.xpath(".//*[@id='listingtable_btnGridCancel_1']")).click(); 
			
  }
}
