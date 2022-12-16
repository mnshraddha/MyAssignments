package testNG.Assingments;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class CreateLead extends BaseClass{
	@BeforeClass
	public void setData()
	{
		fileName="DataExcel";
		sheetName="CreateLead";
	}	
@Test(dataProvider = "fetchData")
	public void runCreateLead(String cName,String fName, String LName) {
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(LName);
		driver.findElement(By.name("submitButton")).click();
		
	}

}
