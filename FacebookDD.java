package AssignmentsWeek2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Sabthar");
		driver.findElement(By.name("lastname")).sendKeys("Hasmi");
		driver.findElement(By.name("reg_email__")).sendKeys("123456789");
		driver.findElement(By.id("password_step_input")).sendKeys("ABCDEFGH@12345");
		driver.findElement(By.xpath("//input[@value='2']")).click();
		WebElement DayDD=driver.findElement(By.id("day"));
		Select select = new Select(DayDD);
		select.selectByValue("18");
		WebElement MonthDD=driver.findElement(By.id("month"));
		Select select1 = new Select(MonthDD);
		select1.selectByValue("8");;
		//select by Index
		WebElement YearDD=driver.findElement(By.id("year"));
		Select select2 = new Select(YearDD);
		select2.selectByValue("2021");
	
		
		
		
		
	}

}
