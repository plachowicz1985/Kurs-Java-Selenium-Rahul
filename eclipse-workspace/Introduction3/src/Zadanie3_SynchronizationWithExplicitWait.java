import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zadanie3_SynchronizationWithExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/piotrek/Downloads/chromedriver 3");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		String[] phones = { "iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry" };
		
		String username = "rahulshettyacademy";
		String password = "learning";
		
//		username
		driver.findElement(By.id("username")).sendKeys(username);
		
//		password
		driver.findElement(By.id("password")).sendKeys(password);
		
//		user
		driver.findElement(By.xpath("//span[text()=' User']")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		
//		consultant
		driver.findElement(By.xpath("//select/option[@value='consult']")).click();
		
//		checkbox
		driver.findElement(By.id("terms")).click();
		
//		signin
		driver.findElement(By.id("signInBtn")).click();
		
		
		addPhones(driver, phones, w);
//		explicity wait
//		select all the items
		driver.findElement(By.xpath("//li[@class='nav-item active']")).click();
		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
//
//		List <WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));
//
//		for(int i =0;i<products.size();i++)
//
//		{
//		products.get(i).click();
//		}
//
//		driver.findElement(By.partialLinkText("Checkout")).click();}
//		}
		
	}
	
	public static void addPhones (WebDriver driver, String[] phones, WebDriverWait w) {
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h4.card-title")));
		List<WebElement> products = driver.findElements(By.cssSelector("h4.card-title"));
		int j = 0;
		for (int i=0; i < products.size(); i++) {
			String name = products.get(i).getText();
					//products.get(i).getText();
			
			List phonesList = Arrays.asList(phones);
			
			if (phonesList.contains(name))  {
				j++;
				driver.findElements(By.xpath("//div[@class='card-footer']/button")).get(i).click();
				
				if (j == phones.length) {
					break;
				}
				

				
				
			}
			
		}

 }

}