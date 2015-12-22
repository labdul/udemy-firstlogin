package FirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {
WebDriver driver;

@FindBy(css=".balance-number.ng-binding")
private WebElement dashboard_balance_locator;

@FindBy(css="#uiAppPushdownCloseBtn")
private WebElement closedashboard_locator;




public DashboardPage(WebDriver driver){
	this.driver = driver;
	PageFactory.initElements(driver, this);
}


public String get_balance_on_dashboard()throws Throwable{
	WebDriverWait wait = new WebDriverWait(driver, 10); // The int here is the maximum time in seconds the element can wait.
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".balance-number.ng-binding")));
	return dashboard_balance_locator.getText();
}


public void close_dashboard(){
	closedashboard_locator.click();
}
}
