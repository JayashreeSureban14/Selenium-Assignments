package launchSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBI_Login {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.onlinesbi.sbi/");
		
		driver.findElement(By.xpath("//span[.='LOGIN']")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("CONTINUE")).click();
		
		WebElement uname=driver.findElement(By.id("username"));
		uname.sendKeys("jaya@gmail.com");
		
		WebElement pwd=driver.findElement(By.name("password"));
		pwd.sendKeys("J14@#sbi");
		
		WebElement captcha=driver.findElement(By.id("loginCaptchaValue"));
		captcha.sendKeys("47c5d");
		
		Thread.sleep(2000);
		driver.findElement(By.id("Button2")).click();
		
		String title=driver.getTitle();
		System.out.println(title);
	}

}
