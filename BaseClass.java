package IRetryAnalyzerCode;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass
{
  public ChromeDriver driver;
  
  public String excelFileName;
  
  @Parameters({"username", "password", "url"})
  @BeforeMethod
  public void preCondition(String username, String pwd, String url)
  {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys(username);
		driver.findElementById("password").sendKeys(pwd);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
	  
  }
  
  @AfterMethod
  public void postCondition()
  {
	  driver.close();
  }
  @DataProvider (name = "Dataprovider01")
  public String[][] getvalues() throws IOException
  {
 	 ExcelSheet re = new ExcelSheet();
 	 String[][] data = re.excelRead(excelFileName); 
 	 return data;
 }
  
	
}
