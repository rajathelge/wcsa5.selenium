package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageAssignment {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/login");
		
		//to identify webElement we use locator.
		
		driver.findElement(By.id("id_userLoginId")).sendKeys("rajathelge111@gmail.com");  //username Textbox
		driver.findElement(By.id("id_password")).sendKeys("123456789");  //password Textbox
	}

}
