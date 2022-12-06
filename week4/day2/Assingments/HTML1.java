package week4.day2.Assingments;
//1. Launch the URL https://html.com/tags/table/
//2. Get the count of number of rows
//3. Get the count of number of columns

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HTML1 {

	public static void main(String[] args) {
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
		
		List<WebElement> tableRow = driver.findElements(By.xpath("//div[@class='render']//tbody//tr"));
		List<WebElement> tablecol = driver.findElements(By.xpath("//div[@class='render']//tbody//tr[1]//td"));
		
		List<WebElement> arow = driver.findElements(By.xpath("//table[@class='attributes-list']//tbody//tr"));
		List<WebElement> acol = driver.findElements(By.xpath("//table[@class='attributes-list']//tbody//tr[2]//td"));
		
		
		System.out.println("JavaScript Libraries table rows::" + tableRow.size());
		System.out.println("JavaScript Libraries table columns::" + tablecol.size());
		System.out.println("Attributes table rows::" + arow.size());
		System.out.println("Attributes table columns::" + acol.size());
		
	

	}

}
