package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		Thread.sleep(2000);


		WebElement scr1 = driver.findElement(By.xpath(" SALES "));
		WebElement target1 = driver.findElement(By.xpath("//ol[@id='loan']/descendant::li"));

		WebElement scr2 = driver.findElement(By.xpath(" 5000"));
		WebElement target2 = driver.findElement(By.xpath("//ol[@id='amt8']/descendant::li"));
		
		WebElement scr3 = driver.findElement(By.xpath(" BANK "));
		WebElement target3 = driver.findElement(By.xpath("//ol[@id='bank']/descendant::li"));
		
		WebElement scr4 = driver.findElement(By.xpath(" 5000 "));
		WebElement target4 = driver.findElement(By.xpath("//ol[@id='amt7']/descendant::li"));

		Actions act = new Actions(driver);

		act.dragAndDrop(scr1, target1).perform();
		Thread.sleep(2000);
		act.dragAndDrop(scr2, target2).perform();
		Thread.sleep(2000);
		act.dragAndDrop(scr3, target3);
		Thread.sleep(2000);
		act.dragAndDrop(scr4, target4);
		Thread.sleep(2000);

		if(driver.findElement(By.xpath("//a[text()='Perfect!']")).isDisplayed())
		{
			System.out.println("Drog And Drop Done!!");
			
		}
		else
		{
			System.out.println("Exception!!");

		}

		
		
		
		
	}

}
