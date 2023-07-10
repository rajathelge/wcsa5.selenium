package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLaunchChormeBrowser {

	public static void main(String[] args) throws InterruptedException {

		// Relative path of Driver Executable File
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// upcast into WebDrive (I)
		WebDriver driver = new ChromeDriver();

		// to maximize the browser
		driver.manage().window().maximize();

		// provide the delay of 2 sec
		Thread.sleep(2000);
		// stop exe for 2 sec

		// to close the browser
		driver.close();
	}
}
