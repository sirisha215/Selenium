package facebooklogin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import org.openqa.grid.web.servlet.handler.SeleniumBasedRequest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forloopandif {

	public static void main(String[] args) throws JXLException, IOException, Exception {
		WebDriver driver;
		String path = "C:/Users/a1103650/workspace/testdata.xls";
		FileInputStream R = new FileInputStream(path);
		Workbook w = Workbook.getWorkbook(R);
		Sheet S = w.getSheet("Sheet3");
		// chrome browser open
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a1103650\\workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		// open shoestore URL
		driver.get("http://shoestore-manheim.rhcloud.com");
		// maximise browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		int i;
		for(i=1;i<S.getRows();i++)
		{
		
		String str;
		
		str= driver.findElement(By.linkText(S.getCell(0, i).getContents())).getText();
		System.out.println("the month of" + str);
		driver.findElement(By.linkText(S.getCell(0, i).getContents())).click();
		Thread.sleep(5000);
		//verifying January month a small Blurb of Jimmy choo shoe 
		 if (driver.findElements(By.xpath("html/body/ul/l")).size()>0){
			 System.out.println("Blurb is present");
			
		} else {
			System.out.println("Blurb is not present");

		}
		 //verifying price of shoe is present
		 if (driver.findElements(By.xpath("html/body/ul/li[1]/div/table/tbody/tr[3]/td[2]")).size()>0) {
			 System.out.println("price is present");
			String str1;
			str1= driver.findElement(By.xpath("html/body/ul/li[1]/div/table/tbody/tr[3]/td[2]")).getText();
			System.out.println("price text"+str1);
		} else {
			System.out.println("price is not present");

		}
		
		//verifying image is present 
		if (driver.findElements(By.xpath("html/body/ul/li[1]/div/table/tbody/tr[6]/td/img")).size()>0) {
			System.out.println("Image is present");
			
		} else {
          System.out.println("image is not present");
		}
		Thread.sleep(3000);
		//verifying if email id is displaying or not
		
		driver.findElement(By.xpath("html/body/header/form[1]/div/input[1]")).sendKeys(S.getCell(1,i).getContents());
		driver.findElement(By.xpath("html/body/header/form[1]/div/input[2]")).click();
		if (driver.findElements(By.xpath("html/body/div[4]/div")).size()>0) {
			System.out.println("Notification message is available");
			
		} else {
			System.out.println("Notification message is not available");

		}
			
	}
	}

}
