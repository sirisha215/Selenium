package facebooklogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validate_error_msg_displayed {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		// chrome browser open
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a1103650\\workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		// open Kesinenitravel URL
		driver.get("http://www.collegeweeklive.com/");
		// maximise browser
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='loginButton']/button")).click();
		driver.findElement(By.xpath(".//*[@id='profile']/li[1]/form/input[1]")).sendKeys("asdfg@gmail.com");
		driver.findElement(By.xpath(".//*[@id='profile']/li[1]/form/input[2]")).sendKeys("qwertyu");
		driver.findElement(By.xpath(".//*[@id='profile']/li[3]/a/strong")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='register']/div[16]/div/button")).click();
		
		//to validate First name error msg is dispalyed
		String Firstnameerrormsg = driver.findElement(By.xpath(".//*[@id='firstNameError']/span")).getText();
		System.out.println("Firstnameerrormsg");
		if (Firstnameerrormsg.equals("Please enter your first name.")) {
			System.out.println("First name error msg is dispalyed");
			
		} else {
			System.out.println("First name error msg is not dispalyed");

		}
		
		// to validate last name error msg is dispalyed
		String Lastnameerrormsg = driver.findElement(By.xpath(".//*[@id='lastNameError']/span")).getText();
		System.out.println("Lastnameerrormsg");
		if (Firstnameerrormsg.equals("Please enter your last name.")) {
			System.out.println("last name error msg is dispalyed");
			
		} else {
			System.out.println("Last name error msg is not dispalyed");

		}
		
		// to validate phone number error msg is dispalyed
				String phonenoerrormsg = driver.findElement(By.xpath(".//*[@id='phoneNumberError']/h4")).getText();
			 	System.out.println("Phonenoerrormsg");
				if (phonenoerrormsg.equals("Please enter your mobile phone number.")) {
					System.out.println("Phone number error msg is dispalyed");
					
				} else {
					System.out.println("Phone number error msg is not dispalyed");

				}
				
				// to validate Nationality error msg is dispalyed
				String Nationalityerrormsg = driver.findElement(By.xpath(".//*[@id='nationalityError']/h4")).getText();
				System.out.println("Nationalityerrormsg");
				if (Nationalityerrormsg.equals("Please select your country of origin.")) {
					System.out.println("Nationality error msg is dispalyed");
					
				} else {
					System.out.println("Nationality error msg is not dispalyed");

				}
		
	}

}
