package Basics;

import javax.validation.constraints.AssertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\aadm199\\Documents\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
//		to verify Round Trip is selected
		boolean btn;
		btn = driver.findElement(By.xpath("//label[@class='label_text flight-trip-type']")).isSelected();
		System.out.println(driver.findElement(By.xpath("//label[@class='label_text flight-trip-type']")).isSelected());
		 if (btn) {
			 driver.findElement(By.xpath("//label[contains(text(),'one way')]")).click();
			 System.out.println("Done hurray");
		}
		 else {
			 driver.findElement(By.xpath("//label[@class='label_text flight-trip-type']")).click();
			 System.out.println("Done hurray hurray");
		 }
		 driver.close();
		 

	}

}
