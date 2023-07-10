package dropdown;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectDropdown { 

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///F:/Qspiders/Automation%20Data/HTML/checkbox.html");
		
		WebElement multiSelectDD = 	driver.findElement(By.id("menu"));
		
		Select sel = new Select (multiSelectDD);
		
		//to select using index
		sel.selectByIndex(2);
		
		//to select by visible text
		sel.selectByVisibleText("Dosa");
		
		//to select using value
		//sel.selectByValue("v4");
		
		
		Thread.sleep(2000);
		
		//to deselect using index
		sel.deselectByIndex(2);
		
		//to deselect by visible text
		sel.deselectByVisibleText("Dosa");
		
		//to deselect using value
		//sel.deselectByValue("v5");
		
		Thread.sleep(2000);


		//To select using for loop
		for(int i=0;i<5;i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(1000);
		}
		
		
		//To deselect using for loop
		
//		for(int i=0;i<7;i++)
//		{
//			sel.deselectByIndex(i);
//			Thread.sleep(1000);
//		}
		

		//To deselect all options using deselectAll()
		sel.deselectAll();
		
		
		
	}

}
