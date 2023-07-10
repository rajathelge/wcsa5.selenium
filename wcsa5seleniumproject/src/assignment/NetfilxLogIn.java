package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetfilxLogIn {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/login");
		
		driver.findElement(By.id("id_userLoginId")).sendKeys("username");
		Thread.sleep(2000);
		driver.findElement(By.id("id_password")).sendKeys("password");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='btn login-button btn-submit btn-small']")).click();

		
		

		
	}

}
