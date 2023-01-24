import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty( "webdriver.chrome.driver", "/Users/piotrek/Downloads/chromedriver 3");
		WebDriver driver = new ChromeDriver();
		
		int j=0;
		String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot", "Carrot", "Tomato"};
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		//System.out.println(driver.findElements(By.xpath("//h4[@class='product-name']")).size());
				
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
	
		for (int i=0; i<products.size(); i++) {
		
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			
			List itemsNeededList = Arrays.asList(itemsNeeded);
			
			
			if (itemsNeededList.contains(formattedName)) {
				// click on add to card
			j++;
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
			if(j==itemsNeeded.length)
			{
				break;
			}
		}
				
		}
		

	}

}
