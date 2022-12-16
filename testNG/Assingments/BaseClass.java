package testNG.Assingments;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	public ChromeDriver driver;
	public String fileName;
	public String sheetName;
	@Parameters({"url","username","password"})
	
	@BeforeMethod
	  public void preCondition(String url,String uName,String Pwd) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(Pwd);
	  }
	@AfterMethod
	public void postCondition() {
		driver.close();
	  }
	@DataProvider(name="fetchData")
	public String[][] getData() throws IOException {
		return Readdata.readExceldata(fileName,sheetName);
				
	}
}
