package my.framework.webdriver;

import static org.junit.Assert.*;

//import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import my.framework.webdriver.Browser.BrowserType;

public class LogInTest {
	
	private WebDriver driver;

	@Before
	public void init() {

		driver = Browser.driver(BrowserType.Firefox);
	}

	@Test
	public void canLogIn() {
		
		LoginPage logInpage = new LoginPage(driver);
		logInpage.load();
		logInpage.loginToDashBoard("pavlick@bigmir.net", "qaz123zaq");
		assertEquals("Hello, Pavlo", 
				    driver.findElement(By.cssSelector("#nav-link-accountList > span:nth-child(1)"))
				    .getText());
	}
	
	//@After
	//public void cleanUp() {

		//Browser.close();
	//}

}
