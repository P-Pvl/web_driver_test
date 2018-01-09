package my.framework.webdriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
//import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import my.framework.webdriver.Browser.BrowserType;

public class SearchTest {

	private WebDriver driver;

	@Before
	public void init() {

		driver = Browser.driver(BrowserType.Firefox);
	}


	@Test
	public void testProductSearch() {


		HomePage homePage = new HomePage(driver);
		homePage.load();
        SearchResults searchResult = homePage.search().searchInStore("backpacks");
		assertEquals(51, searchResult.getProducts().size());
		assertTrue(searchResult.getProducts().contains(
				"High Sierra Loop Backpack"));

	}

	@After
	public void cleanUp() {

		Browser.close();
	}

}
