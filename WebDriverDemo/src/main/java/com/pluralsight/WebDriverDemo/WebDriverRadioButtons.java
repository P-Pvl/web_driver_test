package com.pluralsight.WebDriverDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverRadioButtons {

	public static void main(String[] args) {
		
		DriverConfigs.getGecko();
		
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/Environment/git-repo/WebDriverDemo/webapp/RadioButtonTest.html");
		
		List<WebElement> radioButtons = driver.findElements(By.name("color"));
		radioButtons.get(1).click();
		
		for (WebElement e : radioButtons) {
			if(e.isSelected())
				System.out.println(e.getAttribute("value"));
		}

	}

}
