package xpathAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case4_usingContainsFunction {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://unglobalcompact.org/login");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@name,'contact[username]')]")).sendKeys("Rajat Helge");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@name, 'contact[password]')]")).sendKeys("123456789");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@type, 'checkbox')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@name, 'commit')]")).click();
		

	}

}
