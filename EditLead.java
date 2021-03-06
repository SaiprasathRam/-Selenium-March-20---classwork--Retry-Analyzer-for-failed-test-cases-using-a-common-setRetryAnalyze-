package IRetryAnalyzerCode;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class EditLead extends BaseClass
{
	@BeforeClass
	public void setFileName()
	{ 
		excelFileName ="EditLead";
	}
	@Test (dataProvider = "Dataprovider01")
	public void EdiLead(String company, String phonenumb) throws InterruptedException {
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(phonenumb);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateLeadForm_companyName").sendKeys(company);
		driver.findElementByName("submitButton").click();
}
}

