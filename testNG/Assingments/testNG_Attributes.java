package testNG.Assingments;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testNG_Attributes extends BaseClass {
	@BeforeClass
	public void setData()
	{
		fileName="DataExcel";
		sheetName="CreateLead";
	}	
	@Test(dataProvider = "fetchData",invocationCount = 2)
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
@Test(priority = 2)
public void msgCreateLead()
{
	System.out.println("Running CreateLead 1");
}
@Test(priority = 1)
public void msgCreateLead2()
{
	System.out.println("Running CreateLead 2");
}
@Test(enabled = false)
public void msgCreateLead3()
{
	System.out.println("Running CreateLead 3");
}
@Test(enabled = true,priority = 3,description = "This is msgCreateLead4")
public void msgCreateLead4()
{
	System.out.println("Running CreateLead 4");
}
@Test(dependsOnMethods = "msgCreateLead2")
public void dependCreateLead()
{
	System.out.println("Running depending method ");
}
@DataProvider(name="fetchData")
public String[][] getData() throws IOException {
	return Readdata.readExceldata(fileName,sheetName);
}
/*public String[][] setData() throws IOException {
	String[][] data=new String [2][3];
	data[0][0]="TestLeaf";
	data[0][1]="Haja";
	data[0][2]="j";
	data[1][0]="QEagle";
	data[1][1]="Hari";
	data[1][2]="R";
	return data;
}*/
@Test(groups = "GroupA")
public void firstMethod()
{
	System.out.println("firstMethod-GroupA");
}
@Test(groups = "GroupA")
public void secondMethod()
{
	Assert.fail();
	System.out.println("secondMethod-GroupA");
}
@Test(groups = "GroupB")
public void ThirdMethod()
{
	System.out.println("ThirdMethod-GroupB");
}
@Test(dependsOnGroups = {"GroupA","GroupB"})
public void forthMethod()
{
	System.out.println("forthMethod deopends on GroupA and GroupB");
}
}
