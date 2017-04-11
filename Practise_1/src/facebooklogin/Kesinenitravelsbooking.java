package facebooklogin;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Kesinenitravelsbooking {

	public static void main(String[] args) {
		WebDriver driver;
		// chrome browser open
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a1103650\\workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		// open Kesinenitravel URL
		driver.get("http://kesinenitravels.com/");
		// maximise browser
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_cpEndUserMain_ucSearchRoute_rbtnList_1")).click();
		new Select(driver.findElement(By.id("ctl00_cpEndUserMain_ucSearchRoute_ddlSource"))).selectByVisibleText("ANANTAPURAM");
		
		new Select(driver.findElement(By.id("ctl00_cpEndUserMain_ucSearchRoute_ddlDestination"))).selectByVisibleText("VIJAYAWADA");
		//driver.findElement(By.id("ctl00_cpEndUserMain_ucSearchRoute_txtDateofJourney")).click();
		//driver.findElement(By.id("ctl00_cpEndUserMain_ucSearchRoute_imgOnward")).click();
		// select month in the calender
		//driver.findElement(By.xpath("//*[@id=")).click();
		
		// select coach type
		new Select(driver.findElement(By.id("ctl00_cpEndUserMain_ucSearchRoute_ddlBusType"))).selectByVisibleText("Seat");
		// no of passengers
		new Select(driver.findElement(By.id("ctl00_cpEndUserMain_ucSearchRoute_ddlNoOfPassengers"))).selectByVisibleText("3");
		
	// ticket type
		new Select(driver.findElement(By.id("ctl00_cpEndUserMain_ucSearchRoute_ddlOnwardTicketype"))).selectByVisibleText("Only Ticket");
		driver.findElement(By.id("ctl00_cpEndUserMain_ucSearchRoute_ibtnSearch")).click();
		
		driver.findElement(By.id("rblService")).click();
		
		driver.findElement(By.id("ctl00_cpEndUserMain_btnContinue")).click();
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		

		
		
	}

}
