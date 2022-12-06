package week4.day2.Assingments;
//1. Launch the URL https://www.chittorgarh.com/
//2. Click on stock market
//3. Click on NSE bulk Deals
//4. Get all the Security names
//5. Ensure whether there are duplicate Security names

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittorgarh {

	public static void main(String[] args) throws InterruptedException {
				// setup browser driver
				WebDriverManager.chromedriver().setup();
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications");
				//Launch the browser
				ChromeDriver driver = new ChromeDriver(options);
				
				//load the url
				driver.get("https://www.chittorgarh.com/");
				//Maximize browser
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
				//2. Click on stock market
				driver.findElement(By.id("navbtn_stockmarket")).click();
				//3. Click on NSE bulk Deals
				WebElement NSEele = driver.findElement(By.xpath("//a[contains(text(),'NSE Bulk Deals')]"));
				
				Actions builder = new Actions(driver);
				builder.moveToElement(NSEele)
				.click()
				.perform();
				
				//4. Get all the Security names
				List<WebElement> tableList = driver.findElements(By.xpath("//div[@class='table-responsive']//tbody//tr//td[3]"));
				List<String> securityList = new ArrayList<String>();
				Thread.sleep(4000);
				for(WebElement name:tableList)
				{
					securityList.add(name.getText());
					
				}
				
				Thread.sleep(4000);
				
				//5. Ensure whether there are duplicate Security names
				Set<String> securitySet = new HashSet<String>(securityList);
				
				if(securityList.size()==securitySet.size()) {
					System.out.println("No Duplicates security names in table::");
					System.out.println("Total Security name ::\t"+securityList.size());
					System.out.println("Security name\n"+securityList.toString().replace("[", "").replace(",", "\n").replace("]", ""));
					System.out.println("Set Count is::\t"+securitySet.size());
					
				}else {
					System.out.println("Table contains Duplicates security name::");
					System.out.println("Total Security name ::\t"+securityList.size());
					System.out.println("Security name in table::\n"+securityList.toString().replace("[", "").replace(",", "\n").replace("]", ""));
					System.out.println("Duplicate Count is::\t"+securitySet.size());
					System.out.println("Duplicates::\n"+securitySet.toString().replace("[", "").replace(",", "\n").replace("]", ""));
				}
				
	driver.close();			
	}
	

}


