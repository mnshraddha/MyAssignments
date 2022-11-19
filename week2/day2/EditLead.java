package week2.day2;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		
		// setup browser driver
		WebDriverManager.chromedriver().setup();
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//load the url	
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximize browser
		driver.manage().window().maximize();
		
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//Enter the username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		//Enter the password		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		//Click Login
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		//Click crm/sfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click Leads link
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		//Click Find leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//Enter first name
		
		driver.findElement(By.xpath("(//form[@class=' x-form']//input[@name='firstName'])[3]")).sendKeys("Test");
		//Click Find leads button
		
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(2000);
		//Click on first resulting lead
		driver.findElement(By.xpath("//td[contains(@class,'x-grid3-td-partyId')]/div[contains(@class,'x-grid3-col-partyId')]/a[@class='linktext']")).click();

		//Verify title of the page
		System.out.println(driver.getTitle());
		//Click Edit
		driver.findElement(By.xpath("//a[ text()='Edit']")).click();
		//Change the company name
		WebElement updateValue = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
		updateValue.clear();
		updateValue.sendKeys("TestToday18");
		String companyNameUpdate = driver.findElement(By.id("updateLeadForm_companyName")).getAttribute("value");
		//Click Update
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		//Confirm the changed name appears
		String changeCompaneyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		
		if(changeCompaneyName.contains(companyNameUpdate))
		{
			System.out.println("The companey name is matching so updated");
		}else
		{
			System.out.println("The companey name is not matching not updated");
		}
		
		//Close the browser 
		//driver.close();
	}

}
