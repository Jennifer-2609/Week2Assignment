package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Limited Account");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("RAM");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("area");
		driver.findElement(By.xpath("//input[@name='annualRevenue']")).sendKeys("30000");
		WebElement findElement = driver.findElement(By.name("industryEnumId"));
		Select tool=new Select(findElement);
		tool.selectByIndex(3);
		WebElement findElement2 = driver.findElement(By.name("ownershipEnumId"));
		Select drop=new Select(findElement2);
		drop.selectByVisibleText("S-Corporation");
		WebElement findElement3 = driver.findElement(By.name("dataSourceId"));
		Select tool1=new Select(findElement3);
		tool1.selectByValue("LEAD_EMPLOYEE");
		WebElement findElement4 = driver.findElement(By.name("marketingCampaignId"));
		Select tool2=new Select(findElement4);
		tool2.selectByIndex(6);
		WebElement findElement5 = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select tool3=new Select(findElement5);
		tool3.selectByValue("TX");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
	}
}

