package AssignmentsWeek2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/. ");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Selenium Automation Tester");
		//select by value
		WebElement IndustryDD = driver.findElement(By.name("industryEnumId"));
		Select select = new Select(IndustryDD);
		select.selectByValue("IND_SOFTWARE");
		//select by visible text
		WebElement OwnershipDD = driver.findElement(By.name("ownershipEnumId"));
		Select select1 = new Select(OwnershipDD);
		select1.selectByVisibleText("S-Corporation");
		//select by value
		WebElement SourceDD = driver.findElement(By.name("dataSourceId"));
		Select select2 = new Select(SourceDD);
		select2.selectByValue("LEAD_EMPLOYEE");
		//select by index
		WebElement MarkcampDD = driver.findElement(By.name("marketingCampaignId"));
		Select select3 = new Select(MarkcampDD);
		select3.selectByIndex(6);
	    
		
		

	}

}
