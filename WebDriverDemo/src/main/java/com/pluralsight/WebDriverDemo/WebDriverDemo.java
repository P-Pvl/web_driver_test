package com.pluralsight.WebDriverDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverDemo {

	public static void main(String[] args)throws MalformedURLException {
		
		//DriverConfigs.getGecko();
		
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.firefox());
		 		
		driver.get("https://google.com/");
		
		WebElement searchField = driver.findElement(By.id("lst-ib"));
		searchField.sendKeys("pluralsight");
		WebElement submitB = driver.findElement(By.name("btnK"));
		submitB.click();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Зображення")));
		
		WebElement imagesLink = driver.findElements(By.linkText("Зображення")).get(0);
		imagesLink.click();
		
		WebElement imageElement = driver.findElements(By.name("ZBcDLh9QtUvMIM:")).get(0);
		imageElement.click();

	}

}
