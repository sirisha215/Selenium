package facebooklogin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_retesting {

	public static void main(String[] args) throws IOException, JXLException, Exception {
		WebDriver driver;
		String path = "C:/Users/a1103650/workspace/testdata.xls";
		FileInputStream R = new FileInputStream(path);
		Workbook w = Workbook.getWorkbook(R);
		Sheet S = w.getSheet("Sheet2");
		// chrome browser open
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a1103650\\workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		// open facebook URL
		driver.get("https://facebook.com");
		// maximise browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		for (int i = 1; i < S.getRows(); i++) {

			// provide username
			driver.findElement(By.id("email")).sendKeys(S.getCell(0, i).getContents());
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			// provide password
			driver.findElement(By.id("pass")).sendKeys(S.getCell(1, i).getContents());
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			// click on login
			driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[3]/label/input")).click();
			Thread.sleep(5000);
			if (driver.findElements(By.id("loginbutton")).size()>0) {
				System.out.println("invalid credentials");
				driver.get("https://facebook.com");
			} else {
				System.out.println("valid Credentials");

			}

		}

	}
}

