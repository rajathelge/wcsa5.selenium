package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwiterLogIn {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://twitter.com/i/flow/login");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@name='text']")).sendKeys("rajathelge@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		
		
	}

}
