package my.framework.webdriver;


import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

public class LoginPage extends LoadableComponent<LoginPage> {

	private  WebDriver driver;
	private final By signIn = By.id("nav-link-accountList");
	private final By email = By.id("ap_email");
	private final By password = By.id("ap_password");
	private final By signUpBtn = By.id("a-autoid-0");
	static String url = "http://amazon.com/";

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	@Override
	protected void load() {
		Browser.open(url);	
	}
	@Override
	protected void isLoaded() throws Error {
		assertTrue(driver.findElement(By.id("nav-your-amazon")).isDisplayed());	
	}

	public void navigate() {
		driver.findElement(signIn).click();
	}

	public void setEmail(String aEmail) {
		driver.findElement(email).sendKeys(aEmail);
	}

	public void setPassword(String aPassword) {
		driver.findElement(password).sendKeys(aPassword);
	}

	public void clickLogin() {
		driver.findElement(signUpBtn).click();
	}

	public void loginToDashBoard(String aEmail, String aPassword) {

		this.navigate();
		this.setEmail(aEmail);
		this.setPassword(aPassword);
		this.clickLogin();
	}

}
