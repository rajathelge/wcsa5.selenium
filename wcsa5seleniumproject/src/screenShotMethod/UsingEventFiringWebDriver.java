package screenShotMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class UsingEventFiringWebDriver {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.selenium.dev");

		EventFiringWebDriver efw = new EventFiringWebDriver(driver);

		File scr = efw.getScreenshotAs(OutputType.FILE);

		File dest = new File("./screenshots/selenium3.jpg");

		Files.copy(scr, dest);

	}

}
