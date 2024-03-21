package launchSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownClass {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement dropdown=driver.findElement(By.xpath("(//select)[1]"));
		
		Select s1=new Select(dropdown); //dropdown is passing here to access select class methods
		//s1.selectByIndex(10); //indexing in integer type
		
		s1.selectByVisibleText("Books"); //string parameter
		
		//s1.selectByValue("search-alias=digital-music"); //string parameter
		
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("world");
		search.sendKeys(Keys.ENTER);
		
		WebElement first=driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[1]"));
		first.click();
		
	}

}
