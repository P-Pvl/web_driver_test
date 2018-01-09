package my.framework.webdriver;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

public class HomePage extends LoadableComponent<HomePage> {
	
	private WebDriver driver;
	static String url = "http://amazon.com/";
	private static String title = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@Override
	protected void load() {
		Browser.open(url);
	}

	@Override
	public void isLoaded() throws Error {
		assertEquals(title, driver.getTitle());
	}
	
	public Search search() {
		Search search = new Search(driver);
		return search;
	}

}