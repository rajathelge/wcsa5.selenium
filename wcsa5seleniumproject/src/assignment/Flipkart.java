package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("HP Laptops");


		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[text()='Core i7']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[text()='HP']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Windows 11']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='HP Pavilion Plus Creator OLED Eyesafe (2023) Intel H-Series Core i7 12th Gen - (16 GB/1 TB SSD/Windows...']/../..//div[text()='₹93,990']")).click();




		
		
	}

}
