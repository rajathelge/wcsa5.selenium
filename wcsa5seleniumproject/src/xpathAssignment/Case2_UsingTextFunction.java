package xpathAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case2_UsingTextFunction {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.udemy.com/join/login-popup/?locale=en_US&response_type=html&next=https%3A%2F%2Fwww.udemy.com%2Fjoin%2Flogin-popup%2F");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[text()='Email']")).sendKeys("rajathelge@rmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Password']")).sendKeys("rajat123456");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='submit' and @class='ud-btn ud-btn-large ud-btn-brand ud-heading-md helpers--auth-submit-button--2K2dh']")).click();
		
		
		
		
	}

}
