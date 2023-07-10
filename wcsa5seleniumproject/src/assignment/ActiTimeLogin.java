package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do");// To launch the Browser

		driver.findElement(By.name("usern9ame")).sendKeys("admin"); // To enter Username.
		Thread.sleep(2000); // To add Delay
		driver.findElement(By.name("pwd")).sendKeys("manager"); // To enter Password
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click(); // To click on LOgn Button.
		Thread.sleep(4000);
		driver.findElement(By.linkText("Logout")).click(); // To click on Logout Link.

	}

}
