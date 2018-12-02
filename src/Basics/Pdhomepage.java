package Basics;

import java.util.concurrent.TimeUnit;

import javax.persistence.Id;
import javax.xml.soap.Text;
import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pdhomepage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aadm199\\Documents\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
//		Implicit wait syntax
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	driver.get("http://aaiwkdt016556:4503/content/aia-au-pd/en/rac/welcome.html?productCode=VWAV");
		driver.get("http://aaiwkdt016556:4503/content/aia-au-pd/en/racq/welcome.html?productCode=VQAV");
	
	//Explicit timeout	
		WebDriverWait d = new WebDriverWait(driver, 1000);
		d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains( text(),'Get started')]")));	
//	driver.findElement(By.cssSelector("a[class*='but']")).click();
	System.out.println(driver.findElement(By.xpath("//a[contains( text(),'Get started')]")).getText());
	driver.findElement(By.xpath("//a[contains( text(),'Get started')]")).click();
	System.out.println("Get started click step passed");
d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Single')]")));

driver.findElement(By.xpath("//span[contains(text(),'Single')]")).click();

//System.out.println(driver.findElement(By.xpath("//buttton[@id='pd-quote-next']")).isDisplayed());
d.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("div#pd-residency-you-radio-Yes")));
driver.findElement(By.cssSelector("div#pd-residency-you-radio-Yes")).click();
d.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#pd-quote-next")));
driver.findElement(By.cssSelector("#pd-quote-next")).click();
System.out.println("Clicked on Single Test Passed");

driver.findElement(By.xpath("//input[@id='new_form_pd-fname-tb']")).sendKeys("TestFN");
driver.findElement(By.xpath("//input[@id='new_form_pd-lname-tb']")).sendKeys("TestLN");
driver.findElement(By.xpath("//input[@id='new_form_pd-dob-tb']")).sendKeys("01011990");
driver.findElement(By.xpath("//input[@id='new_form_pd-phone-tb']")).sendKeys("0452523652");
driver.findElement(By.xpath("//input[@id='new_form_pd-email-tb']")).sendKeys("1@2.com");
//driver.findElement(By.xpath("//buttton[@id='pd-quote-next']")).click();
driver.findElement(By.cssSelector("#pd-quote-next")).click();
System.out.println("Entered Your details");
System.out.println("***********Started About You Page*****************");
d.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("label[for='male']")));
driver.findElement(By.cssSelector("label[for='male']")).click();
d.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#pd-quote-next")));
driver.findElement(By.cssSelector("#pd-quote-next")).click();
System.out.println("Entered About You");
System.out.println("************Started Your Cover Page*************");
//d.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.subHeadingStyle")));
Actions a = new Actions(driver);
d.until(ExpectedConditions.visibilityOfElementLocated(By.id("yourCoverSliderText")));
driver.findElement(By.id("yourCoverSliderText")).click();
driver.findElement(By.id("yourCoverSliderText")).sendKeys("170000");
driver.findElement(By.id("injuryCoverSliderText")).sendKeys("30000");
driver.findElement(By.cssSelector("#pd-quote-next")).click();

System.out.println("******Your quote page clicking on Apply now****************");
d.until(ExpectedConditions.visibilityOfElementLocated(By.id("pd-summary-apply")));
driver.findElement(By.id("pd-summary-apply")).click();


System.out.println("********Duty of Disclosure*********");
d.until(ExpectedConditions.visibilityOfElementLocated(By.id("agreeAndStart")));
driver.findElement(By.id("agreeAndStart")).click();



System.out.println("********Your Cover*********");
d.until(ExpectedConditions.visibilityOfElementLocated(By.id("pd-summary-purchase")));
driver.findElement(By.id("pd-summary-purchase")).click();

System.out.println("********Declaration*********");
d.until(ExpectedConditions.visibilityOfElementLocated(By.id("iagreementButton")));
driver.findElement(By.id("iagreementButton")).click();

System.out.println("********Please confirm your details and address below*********");
d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains (text(), 'Please confirm your details and address below')]")));
driver.findElement(By.cssSelector("input[name='residentialUnit']")).sendKeys("214");
driver.findElement(By.cssSelector("#residentialStreet")).sendKeys("testStreet");
driver.findElement(By.cssSelector("#residentialSuburb")).sendKeys("testsuburb");
driver.findElement(By.cssSelector("#residentialPostcode")).sendKeys("3000");
WebElement state = driver.findElement(By.cssSelector("#confirmStateRes"));

Select s = new Select(state);
s.selectByVisibleText("VIC");
driver.findElement(By.cssSelector("label[for='radiopostalYes']")).click();

driver.findElement(By.cssSelector("button[ng-click*='saveAddress']")).click();
System.out.println("*************Started Beneficiaries Page************************");
d.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("//div[contains(text(),'Beneficiaries')]")));

WebElement drpdwNumberOfBen = driver.findElement(By.cssSelector("select[ng-model='numberOfBeneficiaries']"));
Select benLov = new Select (drpdwNumberOfBen);
benLov.selectByIndex(1);
















//driver.quit();



	
//			("//span[contains(text(),'Single')]"));
	
	
	}

}

