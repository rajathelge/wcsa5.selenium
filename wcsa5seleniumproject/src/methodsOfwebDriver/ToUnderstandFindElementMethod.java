package methodsOfwebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandFindElementMethod {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chorme.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.switchTo().activeElement().sendKeys("bikes");
		Thread.sleep(2000);
		List<WebElement> bikes = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		
//		for(int i =0; i<bikes.size(); i++)
//		{
//			String bikesOptions = bikes.get(i).getText();
//			System.out.println(bikesOptions);
//			Thread.sleep(2000);
//
//		}
		
		//Using for each loop:
		
		for(WebElement we : bikes)
			
		{
			String bikesOptions = we.getText();
			System.out.println(bikesOptions);
			Thread.sleep(2000);
		}
	}

}
