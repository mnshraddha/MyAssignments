package week4.day2.Assingments;
/*
1. Launch https://www.snapdeal.com/
2. Go to Mens Fashion
3. Go to Sports Shoes
4. Get the count of the sports shoes
5. Click Training shoes
6. Sort by Low to High
7. Check if the items displayed are sorted correctly
8.Select the price range (900-1200)
9.Filter with color Navy 
10 verify the all applied filters 
11. Mouse Hover on first resulting Training shoes
12. click QuickView button
13. Print the cost and the discount percentage
14. Take the snapshot of the shoes.
15. Close the current window
16. Close the main window
*/


import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapdealAss {

	public static void main(String[] args) throws InterruptedException ,IOException{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Go to Mens Fashion
		WebElement mens = driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
		//Go to Sports Shoes
		WebElement shoes = driver.findElement(By.xpath("//span[text()='Sports Shoes']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(mens)
		.pause(Duration.ofSeconds(1))
		.click(shoes)
		.perform();
		//Click Training shoes
		driver.findElement(By.xpath("//ul[@id='js-46105686-nav']//div[@class='child-cat-name ']")).click();
		
		//Sort by Low to High
		WebElement selectSort = driver.findElement(By.xpath("//div[@class='sort-drop clearfix']"));
		selectSort.click();
		String searchText = "Price Low To High";
		List<WebElement> selectlist = selectSort.findElements(By.xpath("//li[@class='search-li']"));
		for (WebElement option : selectlist)
		{
			if (option.getText().equals(searchText))
		    {	
		    	
		        option.click(); // click the required option
		       
		    }
		}
		
		//Check if the items displayed are sorted correctly
		
		int lowPrice = Integer.parseInt(driver.findElement(By.xpath("//span[@class='from-price-text']")).getText().replaceAll("[^0-9]", ""));
		System.out.println(lowPrice);
		int highPrice = Integer.parseInt(driver.findElement(By.xpath("//span[@class='to-price-text']")).getText().replaceAll("[^0-9]", ""));
		System.out.println(highPrice);
	
		List<WebElement> itemEle = driver
				.findElements(By.xpath("//div[@id='products']//span[@class='lfloat product-price']"));
		List<Integer> priceAllProd = new ArrayList<Integer>();
		for (int i = 1; i <= itemEle.size(); i++) {
			WebElement priceEle = driver
					.findElement(By.xpath("(//div[@id='products']//span[@class='lfloat product-price'])[" + i + "]"));
			wait.until(ExpectedConditions.visibilityOf(priceEle));
			priceAllProd.add(Integer.parseInt(priceEle.getText().replaceAll("[^0-9]", "")));
			
		}
		System.out.println(priceAllProd);
		if(priceAllProd.get(0)==lowPrice && priceAllProd.get(priceAllProd.size()-1)==highPrice) {
			System.out.println("Displayed items are sorted correctly");
		}
		//Select the price range (900-1200)
		WebElement lSlider = 
				driver.findElement(By.xpath("//div[@class='filter-inner']//a[1]"));
		builder.clickAndHold(lSlider)
		.moveByOffset(64, 0)
		.release()
		.perform();
		WebElement rSlider = 
				driver.findElement(By.xpath("//div[@class='filter-inner']//a[2]"));
		/*Point lpixel = lSlider.getLocation();
		Point rpixel = rSlider.getLocation();
		System.out.println(lpixel);
		System.out.println(rpixel);*/
		
		Thread.sleep(3000);
		builder.clickAndHold(rSlider)
		.moveByOffset(-106, 0)
		.release()
		.perform();
		Thread.sleep(4000);
		//Filter with color Yellow
		driver.findElement(By.xpath("//label[@for='Color_s-Yellow']")).click();
		//verify the all applied filters
		//WebElement filterEle = driver.findElement(By.xpath("//div[@class='filter-section ']//span[@class='filter-dot']"));
		
		List<WebElement> lfilterEle = driver
				.findElements(By.xpath("//div[@class='filter-section ']//span[@class='filter-dot']"));
		List<WebElement> filterEle = driver
				.findElements(By.xpath("//div[@class='filters']"));
		
		
		System.out.println();
			if(lfilterEle.size()==filterEle.size())
			{
				
				System.out.println("All filters applied");
			}
			
			Thread.sleep(4000);
		//Mouse Hover on first resulting Training shoes
			WebElement imgEle = 
					driver.findElement(By.xpath("//picture[@class='picture-elem']"));
			builder.moveToElement(imgEle).perform();
		//click QuickView button
		driver.findElement(By.xpath("//div[@class='clearfix row-disc']//div[contains(text(),'Quick View')]")).click();
		//Print the cost and the discount percentage
		
		
		System.out.println("The Cost of Product:: " +
		driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText());
		System.out.println("The discount percentage of Product:: " +
				driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText());
		//Take the snapshot of the shoes
		Thread.sleep(4000);
		File sourcefile = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/prod.jpeg");
		FileUtils.copyFile(sourcefile, dest);
		driver.close();
	}
		
	
}
