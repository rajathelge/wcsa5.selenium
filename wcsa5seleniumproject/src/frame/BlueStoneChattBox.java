package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlueStoneChattBox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		Thread.sleep(4000);
		
		//handle the frame by switching control to frame
		
		driver.switchTo().frame(9);
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
		
		driver.switchTo().frame(frameElement);
		

	}

}
