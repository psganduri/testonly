package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aadm199\\Documents\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.id("email")).sendKeys("test");
		driver.findElement(By.name("pass")).sendKeys("test");
		driver.findElement(By.xpath("//*[@id=\'u_0_2\']")).click();
//		driver.findElement(By.linkText("Forgotten account?")).click();
		driver.findElement(By.cssSelector("input#email.inputtext._55r1_1kbt._4rer")).sendKeys("test");;
		try {
			driver.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		
		
		
		

	}

}
