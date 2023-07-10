package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsingExplicitWait {

	public static void main(String[] args) {


		System.setProperty("webdriver.chorme.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();	

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://www.shoppersstack.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a [@id='men']")).click();
		driver.findElement(By.xpath("//img [@alt='Men kurta']")).click();
		driver.findElement(By.xpath("//button[@id='Check']")).click();

		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='Check']")));

		
	}

}
