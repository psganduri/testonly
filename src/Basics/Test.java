package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\aadm199\\Documents\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://www.spicejet.com/");
		WebElement dataBox = driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date2']"));
		System.out.println("identified calender box");
		dataBox.sendKeys("10102019");
		dataBox.sendKeys(Keys.TAB);
		


	}

}
