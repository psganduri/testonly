package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFirefoxDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//To point third party firefox driver exe to webdriver.chrome.driver path. So that chrome can be invoked by webdriver classes
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\aadm199\\Documents\\Softwares\\geckodriver-v0.22.0-win64\\geckodriver.exe");
//	Instantizing a new ChromeDriver class of WebDriver interface
	WebDriver driver = new FirefoxDriver();
//	to launch and load a address on browser
	driver.get("https://WWW.google.com");
	
//	To get Page title
	System.out.println(driver.getTitle());
//	To get the url loaded
	System.out.println(driver.getCurrentUrl());
//	To get page source
	System.out.println(driver.getPageSource());
// To open a new browser
	driver.get("https://www.yahoo.com");
	driver.get("https://www.facebook.com");
	
	
	
	
	//	To navigate
	driver.navigate().back();
	System.out.println(driver.getTitle());
//	To close
	driver.close();
//	To close all windows
	driver.quit();
	}

}
