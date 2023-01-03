package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CreateLead {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jennifer");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajasekar");
		WebElement findElement = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drop = new Select(findElement);
		drop.selectByVisibleText("Employee");
		WebElement findElement2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select tool=new Select(findElement2);
		tool.selectByValue("9001");
		WebElement findElement3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select drop1=new Select(findElement3);
		drop1.selectByIndex(4);
		WebElement findElement4 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select drop2 = new Select(findElement4);
		drop2.selectByVisibleText("India");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
	}
}
