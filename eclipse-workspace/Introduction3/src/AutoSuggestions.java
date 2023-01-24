import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty( "webdriver.chrome.driver", "/Users/piotrek/Downloads/chromedriver 3");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(3000);
		
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for (WebElement option :options)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
			}
			
			
		}

	}

}
