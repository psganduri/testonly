package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.openqa.selenium.support.ui.Select;

public class DropdownsAndRadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.setProperty("webwriver.chrome.driver", "C:\\Users\\aadm199\\Documents\\Softwares\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
System.setProperty("webdriver.chrome.driver", "C:\\Users\\aadm199\\Documents\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		System.out.println("clicked on dropdown");
//			
		driver.findElement(By.xpath("//a[@value='HYD']")).click();
								System.out.println("Selected hyd");		
//								driver.quit();
		
		driver.findElement(By.xpath("(//a[@value='AMD'])[2]")).click();
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight']")).click();
//		Static dropdowns
		Select s = new Select (driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
		s.selectByValue("INR");
		s.selectByIndex(3);
		s.selectByVisibleText("AED");
		
//		checkboxes
		 
		System.out.println(driver.findElement(By.cssSelector("input#ctl00_mainContent_chk_friendsandfamily")).isSelected());
//		driver.findElement(By.cssSelector("input#ctl00_mainContent_chk_friendsandfamily")).click();
		System.out.println(driver.findElement(By.cssSelector("input#ctl00_mainContent_chk_friendsandfamily")).isSelected());
		int count =driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println(count);
		for (int i=0;i<count;i++) {
			driver.findElements(By.xpath("(//input[@type='checkbox'])")).get(i).click();
		}
		
		
		
		
		
		
	}

}
