package week4.day2.Assingments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundDragDrop {

	public static void main(String[] args) throws InterruptedException {
		// setup browser driver
				WebDriverManager.chromedriver().setup();
				//Launch the browser
				ChromeDriver driver = new ChromeDriver();
				//load the url
				driver.get("https://leafground.com/drag.xhtml");
				//Maximize browser
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
				
				Actions builder = new Actions(driver);
				//Move target
				WebElement eleMoveTarget = driver.findElement(By.xpath("//div[@id='form:conpnl_content']"));
				builder.dragAndDropBy(eleMoveTarget, 300,100).perform();
				
				//drop target
				WebElement eleDrag = driver.findElement(By.xpath("//div[@id='form:drag']"));
				WebElement eleDrop =driver.findElement(By.xpath("//div[@id='form:drop_header']"));
				builder.dragAndDrop(eleDrag, eleDrop).perform();
				
				//Draggable Rows
				WebElement row1 = driver.findElement(By.xpath("//tbody[@class='ui-datatable-data ui-widget-content ui-sortable']//tr[1]"));
				WebElement row3 = driver.findElement(By.xpath("//tbody[@class='ui-datatable-data ui-widget-content ui-sortable']//tr[3]"));
				Thread.sleep(3000);
				builder.clickAndHold(row1)
				.moveToElement(row3)
				.release()
				.perform();
				Thread.sleep(3000);
				System.out.println("Row moved");
				
				//Draggable Columns
				WebElement col1 = driver.findElement(By.xpath("//th[@class='ui-state-default ui-draggable-column ui-draggable ui-draggable-handle ui-droppable'][1]"));
				WebElement col2 = driver.findElement(By.xpath("//th[@class='ui-state-default ui-draggable-column ui-draggable ui-draggable-handle ui-droppable'][3]"));
				Thread.sleep(10000);
				builder.clickAndHold(col1)
				.moveToElement(col2)
				.release()
				.perform();
				Thread.sleep(10000);
				System.out.println("Column moved");
				
	}

}
