package launchSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GroTechMindsLogin {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		
		/*driver.findElement(By.partialLinkText("Automate")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Read")).click();*/
		
		driver.findElement(By.name("email")).sendKeys("jaya@gmail.com");
		driver.findElement(By.id("password")).sendKeys("jay123");
		
		driver.findElement(By.id("Female")).click();
		
		/*Thread.sleep(2000);
		WebElement skills=driver.findElement(By.xpath("(//select)[1]"));
		Select s1=new Select(skills);
		//s1.selectByValue("Technical Skills");
		s1.selectByIndex(1);*/
		
		WebElement country=driver.findElement(By.id("Country"));
		Select s2=new Select(country);
		s2.selectByValue("India");
		
		/*WebElement present=driver.findElement(By.id("Present-Address"));
		present.sendKeys("JP Nagar Bangalore");
		present.sendKeys(Keys.CONTROL+"a");
		present.sendKeys(Keys.CONTROL+"c");
		
		WebElement permanent=driver.findElement(By.name("Permanent-Address"));
		permanent.sendKeys(Keys.CONTROL+"v");
		
		driver.findElement(By.id("Pincode")).sendKeys("591102");
		
		WebElement rel=driver.findElement(By.name("Relegion"));
		Select s3=new Select(rel);
		s3.selectByIndex(2);
		
		WebElement upload=driver.findElement(By.id("file"));
		upload.sendKeys("C:\\Users\\DELL\\eclipse-workspace\\SeleniumProject\\src\\launchSelenium\\DropdownClass.java");
		
		driver.findElement(By.id("relocate")).click();
		
		driver.findElement(By.xpath("//button[@name='Submit']")).click();
		*/
	}

}
