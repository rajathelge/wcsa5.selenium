package methodsOfWebElements;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesMethod {
	
	public static void main(String[] args) {
				

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://omayo.blogspot.com/");
		
		//get the address of current or parent
		
		String parentHandle = driver.getWindowHandle();
		
		System.out.println("Address of Parent Window: " + parentHandle);
		
		//get address of child window
		
		driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
		
		String childWindow = driver.getWindowHandle();
		
		System.out.println("Address of Child Window: " + childWindow);
		
		Set<String> allHandles = driver.getWindowHandles();
		
		for(String al:allHandles)
		{
			System.out.println(al);
		}
		
		
		
	}
	

}



