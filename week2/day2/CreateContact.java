package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
				// setup browser driver
				WebDriverManager.chromedriver().setup();
				
				//Launch the browser
				ChromeDriver driver = new ChromeDriver();
				
				//load the url	
				//driver.get("http://leaftaps.com/opentaps/control/login");
				driver.get("http://leaftaps.com/opentaps/control/main");
				//Maximize browser
				driver.manage().window().maximize();
				
				//Add implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
				//Enter the username
				
				WebElement eleUserName = driver.findElement(By.id("username"));
				eleUserName.sendKeys("Demosalesmanager");
				
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				driver.findElement(By.className("decorativeSubmit")).click();
				
				//driver.findElement(By.xpath("//a[text()='CRM/SFA']")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				// Click on contacts Button
				driver.findElement(By.xpath("//a[text()='Contacts']")).click();
				//Click on Create Contact
				driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
				//Enter FirstName Field Using id Locator
				driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("SeleniumTester");
				//Enter LastName Field Using id Locator
				driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("SeleniumLastname");
				//Enter FirstName(Local) Field Using id Locator
				driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("SeleniumTester");
				//Enter LastName(Local) Field Using id Locator
				driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("SeleniumLastname");
				//Enter Department Field Using any Locator of Your Choice
				driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("SeleniumDepartment");
				 //Enter Description Field Using any Locator of your choice 
				driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("Selenium Testing now");

				 //Enter your email in the E-mail address Field using the locator of your choice
				driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("Selenium@testing.com");
				//Select State/Province as NewYork Using Visible Text
				Select selectStatProv = new Select(driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']")));
				selectStatProv.selectByValue ("NY");
				//Click on Create Contact
				driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
				Thread.sleep(4000);
				//Click on edit button 
				driver.findElement(By.xpath("//a[text()='Edit']")).click();
				//Clear the Description Field using .clear
				driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).clear();
				//Fill ImportantNote Field with Any text
				driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).sendKeys("Updating Data");
				//Click on update button using Xpath locator
				driver.findElement(By.xpath("//input[@value='Update']")).click();
				//Get the Title of Resulting Page.
				System.out.println(driver.getTitle());
	}

}
