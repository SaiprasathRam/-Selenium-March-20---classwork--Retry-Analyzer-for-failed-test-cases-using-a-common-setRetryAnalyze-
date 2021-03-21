package IRetryAnalyzerCode;
import java.util.NoSuchElementException;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class CreateLead extends BaseClass
{
	@BeforeClass
	public void setFileName()
	{
		excelFileName = "CreateLead";
	}
    @Test (dataProvider = "Dataprovider01")
	public void CreateLead01(String company, String firstName, String LastName) {

		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(company);
		driver.findElementById("createLeadForm_firstName").sendKeys(firstName);
		driver.findElementById("createLeadForm_lastName").sendKeys(LastName);
		System.out.print(company);
		System.out.print(" ");
		System.out.print(firstName);
		System.out.print(" ");
		System.out.print(LastName);
		System.out.println();
		driver.findElementByName("submitButton").click();
		throw new NoSuchElementException();
	
}
}
