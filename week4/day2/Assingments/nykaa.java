package week4.day2.Assingments;
/*
1) Go to https://www.nykaa.com/
2) Mouseover on Brands and Search L'Oreal Paris
3) Click L'Oreal Paris
4) Check the title contains L'Oreal Paris(Hint-GetTitle)
5) Click sort By and select customer top rated
6) Click Category and click Hair->Click haircare->Shampoo
7) Click->Concern->Color Protection
8)check whether the Filter is applied with Shampoo
9) Click on L'Oreal Paris Colour Protect Shampoo
10) GO to the new window and select size as 175ml
11) Print the MRP of the product
12) Click on ADD to BAG
13) Go to Shopping Bag 
14) Print the Grand Total amount
15) Click Proceed
16) Click on Continue as Guest
17) Check if this grand total is the same in step 14
18) Close all windows
*/
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class nykaa {

	public static void main(String[] args) throws InterruptedException {
		// setup browser driver
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		//Launch the browser
		ChromeDriver driver = new ChromeDriver(options);
		
		//load the url
		driver.get("https://www.nykaa.com/");
		//Maximize browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	
        WebElement eleBrand = driver.findElement(By.xpath("//div[@id='headerMenu']//a[contains(text(),'brands')]"));
        WebElement eleBrandsearch = driver.findElement(By.xpath("//input[@id='brandSearchBox']"));
        
		Actions builder = new Actions(driver);
		builder.moveToElement(eleBrand)
		.sendKeys(eleBrandsearch, "L'Oreal Paris")
		.click(driver.findElement(By.xpath("//div[@class='css-ov2o3v']/a[contains(text(),\"L'Oreal Paris\")]")))
		.perform();
		System.out.println(driver.getTitle());
		//Click sort By and select customer top rated
		driver.findElement(By.xpath("//button[@class=' css-n0ptfk']//span")).click();
		driver.findElement(By.xpath("//div[@class='control-box css-1ap0cm9'][4]//label[@class='control control-radio']")).click();
		Thread.sleep(3000);
		
		//Click Category and click Hair->Click haircare->Shampoo
		driver.findElement(By.xpath("//span[contains(text(),'Category')]")).click();
		driver.findElement(By.xpath("//div[@class=' css-b5p5ep']//span[contains(text(),'Hair')]/following-sibling::span")).click();
		driver.findElement(By.xpath("//div[@class=' css-b5p5ep']//span[contains(text(),'Hair Care')]/following-sibling::span")).click();
		driver.findElement(By.xpath("//label[@class='control control-checkbox']//span[contains(text(),'Shampoo')]")).click();
		Thread.sleep(3000);
		
		//Click->Concern->Color Protection
		driver.findElement(By.xpath("//div[@class='css-w2222k'][6]")).click();
		driver.findElement(By.xpath("//div[@class='control-box css-1ap0cm9'][6]")).click();
		
		//check whether the Filter is applied with Shampoo
		String filterStr = driver.findElement(By.xpath("//div[@class='css-1emjbq5'][1]")).getText();
		
		if(filterStr.equalsIgnoreCase("Shampoo"))
		{
			System.out.println("Filter is applied with Shampoo");
		}
		else
		{
			System.out.println("Filter is not applied with Shampoo");
		}
		
		//Click on L'Oreal Paris Colour Protect Shampoo
		driver.findElement(By.xpath("//div[@class='css-43m2vm'][1]")).click();	
		Set<String> windowHandler = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowHandler);
		driver.switchTo().window(windows.get(1));
		// GO to the new window and select size as 175ml
		WebElement selectSize = driver.findElement(By.xpath("//div[@class='css-11wjdq4']//select[@class='css-2t5nwu']"));
		Select selectsource = new Select(selectSize);
		selectsource.selectByValue("0");
		//	Print the MRP of the product
		System.out.println("The product MRP:: "+driver.findElement(By.xpath("//div[@class='css-1d0jf8e']//span[2]")).getText());
		// Click on ADD to BAG
		driver.findElement(By.xpath("//button[@class=' css-12z4fj0']")).click();
		//Go to Shopping Bag 
		driver.findElement(By.xpath("//button[@class='css-g4vs13']")).click();
		
		//switch frame
		driver.switchTo().frame(0);
		//Print the Grand Total amount
		String strGTotal = driver.findElement(By.xpath("//span[@class='css-n8gwxi e171rb9k3']")).getText();
		System.out.println("The Grand Total:: "+strGTotal);
		Thread.sleep(4000);
		//Click Proceed
		//driver.findElement(By.xpath("//div[@class='css-ltzjhp e25lf6d7']//button")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Proceed')]")).click();
		//Click on Continue as Guest
		//driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		Thread.sleep(3000);
		
		//Close all windows
		driver.close();
	}

}
