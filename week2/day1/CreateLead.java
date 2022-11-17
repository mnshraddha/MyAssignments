package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
				// setup browser driver
				WebDriverManager.chromedriver().setup();
				
				//Launch the browser
				ChromeDriver driver = new ChromeDriver();
				
				//load the url
				driver.get("http://leaftaps.com/opentaps/control/main");
				
				//Maximize browser
				driver.manage().window().maximize();
				//Enter the username
				
				WebElement eleUserName = driver.findElement(By.id("username"));
				eleUserName.sendKeys("Demosalesmanager");
				
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				driver.findElement(By.className("decorativeSubmit")).click();
				
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Create Lead")).click();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("SeleniumTest");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shraddha");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Test");
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Selenium1");
				driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing Selenium");
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("shr@testing.com");
				WebElement selectState = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				
				Select selectsource = new Select(selectState);
				selectsource.selectByValue("NY");
				driver.findElement(By.className("smallSubmit")).click();
				Thread.sleep(3000);
				
				 System.out.println("Page title for this page is: " + driver.getTitle());
				 
				 Thread.sleep(3000);
				
								
				driver.close();
				


	}

}
