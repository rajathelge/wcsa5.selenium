package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingImplicitWait {	

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chorme.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();	

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();

		driver.findElement(By.xpath("//a[@class='_3SkBxJ']")).click();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _1sbqEe _3AWRsL']")).click();

	}

}
