package com.pluralsight.WebDriverDemo;

public class DriverConfigs {
	
	@SuppressWarnings("unused")
	public static String geckoPath;
	
    public static String getGecko() {
    	
    	return geckoPath = System.setProperty("webdriver.gecko.driver",
				   "D:\\Environment\\git-repo\\geckodriver-v0.19.1-win64\\geckodriver.exe");
    }

}
