package week4.day1.Assingments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * //Pseudo Code
 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
 * 2. Enter UserName and Password Using Id Locator
 * 3. Click on Login Button using Class Locator
 * 4. Click on CRM/SFA Link
 * 5. Click on contacts Button
 * 6. Click on Merge Contacts using Xpath Locator
 * 7. Click on Widget of From Contact
 * 8. Click on First Resulting Contact
 * 9. Click on Widget of To Contact
 * 10. Click on Second Resulting Contact
 * 11. Click on Merge button using Xpath Locator
 * 12. Accept the Alert
 * 13. Verify the title of the page
 */
public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		// setup browser driver
		WebDriverManager.chromedriver().setup();
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximize browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//Enter Username and password
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		//Click on Login Button using Class Locator
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		//Click on CRM/SFA Link
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		//Click on contacts Button
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		//Click on Merge Contacts using Xpath Locator
		driver.findElement(By.xpath("//a[contains(text(),'Merge Contacts')]")).click();
		Thread.sleep(2000);
	
		//Click on Widget of From Contact
		driver.findElement(By.xpath("//table[@class='twoColumnForm']//tbody//tr//td/table[contains(@id,'partyIdFrom')]//following-sibling::a")).click();
		
		System.out.println(driver.getTitle());
		//Transfer control to popup window
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		List<String> windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		
		//Click on first resulting lead
		driver.findElement(By.xpath("//td[contains(@class,'x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first')]/div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]/a[@class='linktext']")).click();
		Thread.sleep(2000);
		//Transfer control back to main window
		driver.switchTo().window(windows.get(0));
		
		//Click on Widget of To Contact
		driver.findElement(By.xpath("//table[@class='twoColumnForm']//tbody//tr//td/table[contains(@id,'partyIdTo')]//following-sibling::a")).click();
		System.out.println(driver.getTitle());
		
		Set<String> windowHandles1 = driver.getWindowHandles();
		System.out.println(windowHandles);
		List<String> windows1 = new ArrayList<String>(windowHandles1);
		driver.switchTo().window(windows1.get(1));
		
		
		//Click on first resulting lead
		driver.findElement(By.xpath("//div[contains(@class,'x-grid3-row   ')][2]//td[contains(@class,'x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first')]/div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]/a[@class='linktext']")).click();
		Thread.sleep(2000);
		driver.switchTo().window(windows1.get(0));
		System.out.println(driver.getTitle());
		
		//Click on Merge button using Xpath Locator
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		//Accept the Alert
		Alert alertMsg = driver.switchTo().alert();
		Thread.sleep(4000);
		alertMsg.accept();
		
		//Verify the title of the page
		System.out.println(driver.getTitle());
	}

}
