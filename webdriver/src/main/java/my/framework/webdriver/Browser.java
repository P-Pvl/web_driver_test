package my.framework.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	private static WebDriver driver;

	public enum BrowserType{

		Firefox, Chrome, Edge;
	}

	public static WebDriver driver(BrowserType type) {
		if(driver == null) {
			switch (type) {
			case Firefox:
				System.setProperty("webdriver.gecko.driver", "D:\\Environment\\git-repo\\webdriver\\resources\\drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
				break;
			case Chrome:
				System.setProperty("webdriver.chrome.driver", "D:\\Environment\\git-repo\\webdriver\\resources\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				break;
			default:
				System.setProperty("webdriver.gecko.driver", "D:\\Environment\\git-repo\\webdriver\\resources\\drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
				break;
			}
		}
		return driver;
	}
	public static void open(String url) {
		driver.get(url);
	}
	public static void close() {
		driver.quit();
	}



}
