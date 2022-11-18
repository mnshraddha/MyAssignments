package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateFacebookAcc {

	public static void main(String[] args) throws InterruptedException {
		// setup browser driver
		WebDriverManager.chromedriver().setup();
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//load the url	
		driver.get("https://en-gb.facebook.com/");
		
		//Maximize browser
		driver.manage().window().maximize();
		
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		//Enter Information
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Testname");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("TestLastname");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("45454");

		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Password123");
		
		//Entering value in dropdown
		WebElement daywebElem = driver.findElement(By.name("birthday_day"));
		Select day = new Select(daywebElem);
		day.selectByVisibleText("22");
		
		WebElement monthwebElem = driver.findElement(By.name("birthday_month"));
		Select mnth = new Select(monthwebElem);
		mnth.selectByVisibleText("Feb");
		
		WebElement yearwebElem = driver.findElement(By.name("birthday_year"));
		Select year = new Select(yearwebElem);
		year.selectByVisibleText("2014");
		
		//selecting radio button
		driver.findElement(By.xpath("//label[@class='_58mt']")).click();
		
		Thread.sleep(2000);
		//closing browser
		driver.close();
		
	}

}
