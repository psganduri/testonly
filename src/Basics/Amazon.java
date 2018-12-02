package Basics;

import javafx.scene.input.KeyCombination;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.thucydides.core.annotations.findby.By;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\aadm199\\Documents\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com.au/");
		
		Actions a =new Actions(driver);
		WebElement txtBox = driver.findElement(org.openqa.selenium.By.id("twotabsearchtextbox"));
//		a.moveToElement(txtBox).click().keyDown(keys.SHIFT).sendKeys(txtBox.s)s().sendKeys("Hello").doubleClick();
		driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
		a.moveToElement(txtBox).contextClick();
		System.out.println("Test Passed");
		
	}

}
