package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeXpathGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aadm199\\Documents\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//div[@id='gbw']/div/div/div/div[2]/a[@class='gb_P']")).click();
		driver.findElement(By.xpath("//div[@class='lst-c']/div/div[2]/div/input")).sendKeys("Weather this week");
//		driver.findElement(By.xpath("//div[@class='tsf-p']/div[3]/center/input[@name='btnK']")).click();
		driver.findElement(By.xpath("//div[@class='lst-c']/div/div/a/span/span[@class='gsst_e']")).click();
		
		System.out.println("Test Passed");
//	driver.close();
	driver.quit();
	}

}
