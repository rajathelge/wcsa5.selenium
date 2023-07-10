package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdirver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id^='e']")).sendKeys("Username");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("input[class$='_9npi']")).sendKeys("password");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[name='login']")).click();


		
		
	}

}
