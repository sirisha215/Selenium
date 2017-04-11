package facebooklogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Collegeweeklive {
	
		public static void main(String[] args) throws Exception {
			WebDriver driver;
			// chrome browser open
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\a1103650\\workspace\\chromedriver.exe");
			driver = new ChromeDriver();
			// open Kesinenitravel URL
			driver.get("http://www.collegeweeklive.com/");
			// maximise browser
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id='loginButton']/button")).click();
			driver.findElement(By.xpath(".//*[@id='profile']/li[1]/form/input[1]")).sendKeys("asdfg@gmail.com");
			driver.findElement(By.xpath(".//*[@id='profile']/li[1]/form/input[2]")).sendKeys("qwertyu");
			driver.findElement(By.xpath(".//*[@id='profile']/li[3]/a/strong")).click();
			Thread.sleep(3000);
			
			// validating if particular Text is available in dropbox. If present select the text from dropdown 
			String fromdropdown = driver.findElement(By.xpath(".//*[@id='register']/div[3]/div/select")).getText();
			if (fromdropdown.contains("High School Counselor/Student Advisor")) {
				System.out.println("Text is avavilble");
				new Select(driver.findElement(By.xpath(".//*[@id='register']/div[3]/div/select"))).selectByVisibleText("High School Counselor/Student Advisor");
				
				} else {
					
					System.out.println("Text is not avavilble");
					
			}
			//new Select(driver.findElement(By.xpath(".//*[@id='register']/div[3]/div/select"))).selectByVisibleText("High School Counselor/Student Advisor");
			driver.findElement(By.xpath(".//*[@id='firstName']")).sendKeys("Sirisha");
			driver.findElement(By.xpath(".//*[@id='lastName']")).sendKeys("Birram");
			driver.findElement(By.xpath(".//*[@id='phoneNumber']")).sendKeys("6132261987");
			new Select(driver.findElement(By.xpath(".//*[@id='country']"))).selectByVisibleText("UNITED STATES");
			driver.findElement(By.xpath(".//*[@id='emailAddress']")).sendKeys("asdfg@gmail.com");
			driver.findElement(By.xpath(".//*[@id='register']/div[14]/div/input")).sendKeys("qwertyu");
			driver.findElement(By.xpath(".//*[@id='register']/div[16]/div/button")).click();
			
			// Validate if  particular text is present in collegeweeklive.com page. 
			if (driver.getPageSource().contains("password")) {
				System.out.println("Password text is available in the page");
				
			} else {
				
				System.out.println("Password text is not available in the page");

			}
			
			
			
			
			
			
			
			
		
			
			
			
			
			
			
			

	}

}
