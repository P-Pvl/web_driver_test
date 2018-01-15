package my.framework.webdriver;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

public class SearchResults extends LoadableComponent<SearchResults> {
	
	private WebDriver driver;
	private String query;

	public SearchResults(WebDriver driver, String query) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@Override
	protected void load() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void isLoaded() throws Error {
		assertEquals("Showing most relevant results. See all results for " + this.query +
				"'", driver.getTitle());

	}
	
public List<String> getProducts(){
		
		List<String> products = new ArrayList<>();
		List<WebElement> productList = driver.findElements(By.cssSelector("#s-results-list-atf > li"));
		
		for (WebElement item : productList) {
			products.add(item.findElement
					(By.tagName("h2"))
					.getText());
		}
		return products;
	}

}
