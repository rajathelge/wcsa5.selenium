package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginPage {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chorme.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rajathelge");
				
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456789");
		
		driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();



	}

}
