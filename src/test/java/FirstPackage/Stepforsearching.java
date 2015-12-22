package FirstPackage;



//import cucumber.api.java.en.And;
	import java.util.logging.Logger;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;

	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;

	public class Stepforsearching {
		/*		private static final Logger LOGGER =Logger.getLogger(Stepforsearching.class.getName());

		WebDriver driver = new FirefoxDriver();
		
		
		WebElement Bing_search_box = driver.findElement(By.cssSelector("#sb_form_q"));
		WebElement search_button_on_bing = driver.findElement(By.id(".//*[@id='sb_form_go']"));
		WebElement Web_on_resultant_bing_page = driver.findElement(By.linkText("Web"));
		
	

		
		@Given("^I am in a \"([^\"]*)\"$")
		public void loadsite(String site_name){
			if (site_name.equals("Googlesite")){
				
			driver.get("https://www.google.co.uk/");
			
			LOGGER.info("Entering: I am on the google search site");
			}
			
			else if (site_name.equals("bingsite")){
				driver.get("https://www.bing.com/");
				LOGGER.info("Entering: I am on the Bing search site");
				
			}
		}
		
		@When ("^I enter a \"(.+)\"$")
		public void entername(String sname){
			if (sname.equals("Appium")){
				driver.findElement(By.id("lst-ib")).sendKeys("Appium");
				LOGGER.info("Entering: Element is located in Google");
			}
			else if (sname.equals("Cucumber.io ")){
				Bing_search_box.sendKeys("Cucumber.io");
				LOGGER.info("Entering: Element is located in Bing");
			}


		}
		
		
		@When("^click on \"([^\"]*)\"$")
		public void clickbutton(String button) throws InterruptedException{
			if (button.equals("Search_on_Google")){
				driver.findElement(By.cssSelector(".lsb")).click();
				LOGGER.info("Entering: Search button on Google is located");
				
			}
			else if (button.equals("Search_on_Bing")){
				search_button_on_bing.click();
				LOGGER.info("Entering: Search button on BING is located");
				
			}
		
			Thread.sleep(4000L);

			
		}
		
		@Then("^I am redirected to \"([^\"]*)\"$")
		public void redirectiontopage(String output){
			if (output.equals("webisshown")){
				
			if (driver.findElement(By.cssSelector(".hdtb-mitem.hdtb-msel.hdtb-imb")).isDisplayed()){
				LOGGER.info("Entering: Web is displayed on Google");
			}
			else
			{
				LOGGER.info("Entering: Web is not displayed on Google");
			}
			
			}
			
			else if (output.equals("Bingwebisshown")){
				
			if (Web_on_resultant_bing_page.isDisplayed()){
				LOGGER.info("Entering: Web is displayed on Bing");
			}
			else
			{
				LOGGER.info("Entering: Web is not displayed on Bing");
			}
			
			}
			
		}*/
	}