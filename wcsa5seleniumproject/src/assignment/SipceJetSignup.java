package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SipceJetSignup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver,chrome,driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Signup']")).click();
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Rajat");  //First Name
		
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Helge");  //Last Name

		driver.findElement(By.xpath("//input[@placeholder='+91 01234 56789']")).sendKeys("9890868872");  //Phone number
		
		driver.findElement(By.xpath("//input[@id='email_id']")).sendKeys("rajathelge111@gmail.com");  //Email
		
		driver.findElement(By.xpath("//input[@id='new-password']")).sendKeys("rajathelge");  //Password
		
		driver.findElement(By.xpath("//input[@id='c-password']")).sendKeys("rajathelge");  //Confirm Password

		driver.findElement(By.xpath("//input[@id='defaultCheck1']")).click();  //checkbox

	}

}
