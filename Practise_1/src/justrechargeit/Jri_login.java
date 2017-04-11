package justrechargeit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jri_login {
	public void login() throws IOException, JXLException {
		 WebDriver driver;
		  
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
			
		
	}

}
