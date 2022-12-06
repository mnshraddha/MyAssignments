package week4.day2.Assingments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HTML2 {

	public static void main(String[] args) throws InterruptedException {
		// setup browser driver
				WebDriverManager.chromedriver().setup();
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications");
				//Launch the browser
				ChromeDriver driver = new ChromeDriver(options);
				
				//load the url
				driver.get("https://html.com/tags/table/");
				//Maximize browser
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
				//List<WebElement> tableheader = driver.findElements(By.xpath("//div[@class='render']//thead/tr/th"));
				List<WebElement> tableRow = driver.findElements(By.xpath("//div[@class='render']//tbody//tr"));
				List<WebElement> tablecol = driver.findElements(By.xpath("//div[@class='render']//tbody//tr[1]//td"));

				System.out.println("JavaScript Libraries table rows::" + tableRow.size());
				System.out.println("JavaScript Libraries table columns::" + tablecol.size());
				System.out.println("\n");
				for(int j=1;j<= tablecol.size();j++)
				{
				System.out.print(driver.findElement(By.xpath("//div[@class='render']//thead/tr/th["+j+"]")).getText()+"  ");
				System.out.print("    ");
				}
				for(int i=1;i <= tableRow.size();i++)
				{
					
					System.out.print("\n");
					for(int j=1;j<= tablecol.size();j++)
					{
						System.out.print(driver.findElement(By.xpath("//div[@class='render']//tbody//tr["+ i +"]//td["+ j +"]")).getText()+"  ");
						System.out.print("   ");
					}
					
				}
				Thread.sleep(3000);
								
	}

}
