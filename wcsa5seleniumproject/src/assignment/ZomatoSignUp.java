package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoSignUp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/india");
		
		//To click on signup link
		driver.findElement(By.linkText("Sign up")).click();
		Thread.sleep(4000);
		
		driver.switchTo().activeElement();

	
		driver.findElement(By.xpath("//input[@class='sc-1yzxt5f-9 dFkpnp']")).sendKeys("rajat");  //FullName Textbox
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@class='sc-1yzxt5f-9 bbrwhB']")).sendKeys("rajathelge111@gmail.com");  //Email Textbox
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//button[@class='sc-1kx5g6g-1 elxuhW']")).click();
		
	
	}

}

