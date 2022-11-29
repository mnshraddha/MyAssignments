package week4.day1.Assingments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		// setup browser driver
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		 
		//Launch the browser
		ChromeDriver driver = new ChromeDriver(options);
		
		//load the Url	
		driver.get("https://www.amazon.in/");
		//Maximize browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro",Keys.ENTER);
		
		//Get the price of the first product
		//String firstPrice = driver.findElement(By.xpath("(//div[@class='s-result-item s-asin sg-col-0-of-12 sg-col-16-of-20 sg-col s-widget-spacing-small sg-col-12-of-16'])[3]//div//span[@class='a-price-whole']")).getText();
		System.out.println("The price of first product:: "+driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText());
		Thread.sleep(2000);
		
		//Print the number of customer ratings for the first displayed product
		//String firstRating = driver.findElement(By.xpath("//span[@class ='a-size-base puis-light-weight-text s-link-centralized-style']")).getText();
		WebElement firstRatingEle = driver.findElement(By.xpath("//span[@class = 'a-size-base puis-light-weight-text s-link-centralized-style']"));
		String firstRating = firstRatingEle.getText();
		
		System.out.println("The customer ratings for first product:: "+firstRating);
		Thread.sleep(2000);
		
		//Click the first text link of the first image
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		Set<String> windowHandler = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowHandler);
		
		driver.switchTo().window(windows.get(1));
		
		//Click 'Add to Cart' button'
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		driver.findElement(By.xpath("//span[@id='attach-sidesheet-view-cart-button']")).click();
		
		//Get the cart subtotal and verify if it is correct.
		String prodPrice = driver
				.findElement(By.xpath(
						"//p[@class='a-spacing-mini']//span")).getText();
		System.out.println(prodPrice);
		String Subtotal = driver.findElement(By.xpath(
				"//div[contains(@class,'sc-buy-box-group')]//span[contains(@class,'sc-white-space-nowrap')]"))
				.getText();
		System.out.println(Subtotal);
		if (prodPrice.equalsIgnoreCase(Subtotal)) {
			System.out.println("Prices Matched\t Product price:: " + prodPrice + "Subtotal:: \t" + Subtotal);
		} else {
			System.out.println("Prices Not Matched\t Product price:: " + prodPrice + "Subtotal:: \t" + Subtotal);
		}
		driver.close();
		driver.switchTo().window(windows.get(0));
		System.out.println(driver.getTitle());
		
		//Take a screen shot of the product displayed
		driver.findElement(By.xpath("//div[@class='s-result-item s-asin sg-col-0-of-12 sg-col-16-of-20 sg-col s-widget-spacing-small sg-col-12-of-16'][1]//img[@class='s-image']")).click();
		File sourcefile = driver.getScreenshotAs(OutputType.FILE);
		File destfile = new File("./snaps/productimage.jpeg");
		FileUtils.copyFile(sourcefile, destfile);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.switchTo().window(windows.get(0));
		System.out.println(driver.getTitle());
		
		//close the browser
		driver.quit();
		
	}

}
