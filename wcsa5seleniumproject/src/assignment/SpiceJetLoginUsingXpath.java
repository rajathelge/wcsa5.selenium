package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJetLoginUsingXpath {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver,chrome,driver", "./drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Login']")).click();//login button

		
		driver.findElement(By.xpath("//input[@data-testid='user-mobileno-input-box']")).sendKeys("9890868872");//mobile number
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//input[@data-testid='password-input-box-cta']")).sendKeys("Rajat");  //password
		
		driver.findElement(By.xpath("//div[@data-testid='login-cta']")).click();//login button
		
	}
}