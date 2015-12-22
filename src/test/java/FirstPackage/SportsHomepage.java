package FirstPackage;

//import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SportsHomepage {
	
	WebDriver driver;

	@FindBy(css="#header-login-button")
	private WebElement loginButtonLocator;
	
	@FindBy(css="#login-username")
	private WebElement usernameTextBoxLocator;
	
	
	@FindBy(css="#login-password")
	private WebElement passwordTextBoxLocator;
	
	@FindBy(css=".balance.ng-binding")
	private WebElement balance_on_homepage;
	
	@FindBy(css=".icon-account-profile")
	private WebElement account_profile_iconLocator;
	
	@FindBy(id="login-submit")
	private WebElement login_submit_ButtonLocator;
		
	@FindBy(linkText="LOGOUT")
	private WebElement logout_botton_locator;
	

	
	public SportsHomepage(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void click_login_button() throws Throwable{
		loginButtonLocator.click();

		
	}
	
	public void wait_for_Welcome_back_pop_up(){
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("login-submit")));
	}
	
	
	public void enter_username(String username) throws Throwable{
		usernameTextBoxLocator.clear();
		usernameTextBoxLocator.sendKeys(username);
		
	}
	
	public void enter_password(String password) throws Throwable{
		passwordTextBoxLocator.clear();
		passwordTextBoxLocator.sendKeys(password);
		
	}
	
	
	public void click_login_submit_button() throws Throwable{
		login_submit_ButtonLocator.click();
		
	}
	
	public String get_balance_on_homepage() throws Throwable{
		WebDriverWait wait = new WebDriverWait(driver, 10); // The int here is the maximum time in seconds the element can wait.
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".balance.ng-binding")));
		return balance_on_homepage.getText();
		
	}
	

	
	public void click_account_profile_icon() throws Throwable{
		account_profile_iconLocator.click();
		
	}
	
	public void close_driver() throws Throwable{
		Thread.sleep(4000);
		driver.close();
		System.out.println("This is after task done");
		Thread.sleep(3000);
	}

	public void click_log_out() {
		WebDriverWait wait = new WebDriverWait(driver, 10); // The int here is the maximum time in seconds the element can wait.
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("LOGOUT")));
		logout_botton_locator.click();
		// TODO Auto-generated method stub
		
	}
	

}
