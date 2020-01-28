package stepDefinations;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class LoginStepDefinition {
	static WebDriver driver;

	@Given("^user is already on Login Page$")
	public void user_already_on_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vikas\\eclipse-workspace\\MavenDemoTest\\hello\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ui.cogmento.com/");
		Thread.sleep(5000);
	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_free_CRM() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Cogmento CRM", title);
	}

	//--------------------------------By using
	//examples and
	//scenario outline keyword-------------------------------------------

	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password) {

		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
	}

	// -------------------------With using of data table as list
	// method---------------------------------
//	@Then("user enters username and password")
//	public void user_enters_username_and_password(DataTable dataTable) {
//		List<List<String>> data = dataTable.asLists();
//		
//		for(int i=0;i<data.size();i++)
//		{
//			for(int j=0;j<i;j++)
//			{
//				driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys(data.get(i).get(j));
//				driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(data.get(i).get(j+1));
//			}
//		}
//		
//	}
//	@Then("user enters username and password")
//	public void user_enters_username_and_password(DataTable dataTable) {
//
//		List<Map<String, String>> data = dataTable.asMaps();
//		for (Map<String, String> data1 : data) {
//			driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys(data1.get("username"));
//			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(data1.get("password"));
//		}
//	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		WebElement loginBtn = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginBtn);
	}

	@Then("^user is on home page$")
	public void user_is_on_hopme_page() {
		String title = driver.getTitle();
		System.out.println("Home Page title ::" + title);
		Assert.assertEquals("Cogmento CRM", title);
	}

	@Then("^Close the browser$")
	public void close_the_browser() {
		driver.quit();
	}

}