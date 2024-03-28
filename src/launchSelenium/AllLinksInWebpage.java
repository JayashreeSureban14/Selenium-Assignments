package launchSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksInWebpage {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int linkcount=links.size();
		System.out.println(linkcount);
		
		
	}
}
