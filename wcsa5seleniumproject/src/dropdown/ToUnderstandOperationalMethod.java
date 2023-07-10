package dropdown;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUnderstandOperationalMethod {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///F:/Qspiders/Automation%20Data/HTML/checkbox.html");

		WebElement multiSelectDD = driver.findElement(By.id("menu"));

		Select sel = new Select(multiSelectDD);

		
		
		// isMultiple ();
		boolean result = sel.isMultiple();
		System.out.println(result);

		
		
		System.out.println(); // for space betn lines

		
		
		// getOptions ();
		List<WebElement> dropdownOptions = sel.getOptions();

		for (int i = 0; i < dropdownOptions.size(); i++) {
			String options = dropdownOptions.get(i).getText();
			System.out.println(options);
			Thread.sleep(1000);
		}

		
		
		
		System.out.println(); // for space betn lines

		
		
		
		//Using for each loop
		List<WebElement> opts = sel.getOptions();
		for (WebElement we: opts)
		{
			String textOfOPts = we.getText();
			System.out.println(textOfOPts);
			Thread.sleep(1000);
		}
		
		
		
		
	}
}
