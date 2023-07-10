package methodsOfwebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodToSetSize {

	public static void main(String[] args) {

		System.setProperty("webdirver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		Dimension size = new Dimension(900,600);
		driver.manage().window().setSize(size);
		
		Point point = new Point(300,100);
		driver.manage().window().setPosition(point);
		
	}

}
