package Basics;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.applet.resources.MsgAppletViewer;

import org.junit.Assert;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.initialize;

public class Test {

	public static void main(String[] args) throws InterruptedException {


		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\aadm199\\Documents\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		List<String> expected = expectedNames ();
		List<String> actual = actualNames();
		Assert.assertEquals(expected, actual);

//		driver.get("https://www.spicejet.com/");
//		WebElement dataBox = driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date2']"));
//		System.out.println("identified calender box");
//		dataBox.sendKeys("10102019");
//		dataBox.sendKeys(Keys.TAB);



	}
	public static ArrayList<String> expectedNames () throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://vmmelqlihsint21/vmmp-admin-portal/#/");
//		 List<Map> test = (List<Map>) driver.findElement(By.xpath("//*[@id=\"page-content\"]/div[1]/div/div[2]/div/div[1]/div/div"));
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@ng-model='model.searchParams.firstName']")).sendKeys("a");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(9000);
		ArrayList<String> resultList = new ArrayList<>();
		Thread.sleep(5000);
		int getPaginationSize = driver.findElements(By.xpath("//ul[@class='paginationWrapper']/li")).size();
		for (int i=3; i<=getPaginationSize; i++){
			driver.findElement(By.xpath("//ul[@class='paginationWrapper']/li["+i+"]")).click();
			int noOfRows = driver.findElements(By.xpath("//table[@class='table tableStyle1 tableStyleSorting ng-scope ng-table']//tbody/tr")).size();
			System.out.println("Number if Rows" +noOfRows);
			for (int j=1; j<=noOfRows; j++){
				String name = driver.findElement(By.xpath("//table[@class='table tableStyle1 tableStyleSorting ng-scope ng-table']//tbody/tr["+j+"]/td[2]")).getText();
				System.out.println(name);
				resultList.add(name);
				j=j+1;

			}

		}



		return resultList;
	}
	public static ArrayList<String> actualNames () throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://vmmelqlihsint21/vmmp-admin-portal/#/");
//		 List<Map> test = (List<Map>) driver.findElement(By.xpath("//*[@id=\"page-content\"]/div[1]/div/div[2]/div/div[1]/div/div"));
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@ng-model='model.searchParams.firstName']")).sendKeys("a");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(9000);
		ArrayList<String> resultList = new ArrayList<>();
		Thread.sleep(5000);
		int getPaginationSize = driver.findElements(By.xpath("//ul[@class='paginationWrapper']/li")).size();
		for (int i=3; i<=getPaginationSize; i++){
			driver.findElement(By.xpath("//ul[@class='paginationWrapper']/li["+i+"]")).click();
			int noOfRows = driver.findElements(By.xpath("//table[@class='table tableStyle1 tableStyleSorting ng-scope ng-table']//tbody/tr")).size();
			System.out.println("Number if Rows" +noOfRows);
			for (int j=1; j<=noOfRows; j++){
				String name = driver.findElement(By.xpath("//table[@class='table tableStyle1 tableStyleSorting ng-scope ng-table']//tbody/tr["+j+"]/td[2]")).getText();
				System.out.println(name);
				resultList.add(name);
				j=j+1;

			}

		}



		return resultList;
	}

}
