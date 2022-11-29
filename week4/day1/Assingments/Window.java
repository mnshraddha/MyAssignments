package week4.day1.Assingments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window {

	public static void main(String[] args) {
				
				// setup browser driver
				WebDriverManager.chromedriver().setup();
				
				//Launch the browser
				ChromeDriver driver = new ChromeDriver();
				
				//load the url	
				
				driver.get("https://www.leafground.com/window.xhtml");
				//Maximize browser
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
				
				//Click and Confirm new Window Opens
				driver.findElement(By.xpath("//span[text()='Open']")).click();
				List<String> windows = new ArrayList<String>(driver.getWindowHandles());
				System.out.println(windows.size());
				String parentWin = driver.getTitle();
				driver.switchTo().window(windows.get(1));
				//check for new window opened
				if(parentWin!=driver.getTitle())
				{
					System.out.println("New window opened");
				}
				else
					System.out.println("New window not opened");
				driver.switchTo().window(windows.get(1)).close();
				driver.switchTo().window(windows.get(0));
				
				//Find the number of opened tabs
				driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
				List<String> windowList = new ArrayList<String>(driver.getWindowHandles());
				System.out.println("Number of open windows:: "+windowList.size());
				
				for(int i=1;i<windowList.size();i++)
				{
					driver.switchTo().window(windowList.get(i)).close();
				}
				driver.switchTo().window(windowList.get(0));
				
				//Close all windows except Primary
				driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
				List<String> closeWindowList = new ArrayList<String>(driver.getWindowHandles());
				System.out.println("Number of open after click on close windows button:: "+closeWindowList.size());
				for(int i=1;i<closeWindowList.size();i++)
				{
					driver.switchTo().window(closeWindowList.get(i)).close();
				}
				driver.switchTo().window(closeWindowList.get(0));
				
				//Wait for 2 new tabs to open
				driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
				List<String> delayList = new ArrayList<String>(driver.getWindowHandles());
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				wait.until(ExpectedConditions.numberOfWindowsToBe(3));
				for(int i=1;i<delayList.size();i++)
				{
					driver.switchTo().window(delayList.get(i)).close();
				}
	}

}
