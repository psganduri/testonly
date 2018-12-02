package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class Pdlocators extends PageObject {
	
	public Pdlocators (WebDriver driver) {super (driver);}
	
    @FindBy(xpath = "//select[@ng-model='model.searchParams.status']")
    WebElementFacade statusList;
	@FindBy(css = "a[class*='but']")
    public WebElementFacade btngetStarted;

}
