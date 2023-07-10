package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToLaunchFireBrowser {

	public static void main(String[] args) throws InterruptedException {

		// Relative Path of Driver Executable File.
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");

		WebDriver driver = new FirefoxDriver(); // Launch Firefox Browser

		// to maximize the browser
		driver.manage().window().maximize();

		// provide the delay of 2 sec
		Thread.sleep(2000);
		// stop exe for 2 sec

		// to close the browser
		driver.close();

	}

}
