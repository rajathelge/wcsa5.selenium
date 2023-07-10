package xpathAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case3_UsingMultipleAttributes {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdiriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.frontiersin.org/people/login");
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//input[@type='text' and (@class='custom-input' and (@id='login-email'))]")).sendKeys("rajathelge@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='password' and (@placeholder='Password *' and @id='login-password')]")).sendKeys("123456789");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@class='label'and (text()='Remember me')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@id='loginButton' and (text()='Login')]")).click();
	

		
		
		
	}

}
