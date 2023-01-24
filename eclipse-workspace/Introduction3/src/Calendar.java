import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty( "webdriver.chrome.driver", "/Users/piotrek/Downloads/chromedriver 3");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		
		driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
		driver.findElement(By.xpath("//a[@value='GWL']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BOM']")).click();
		
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight']")).click();
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		//driver.findElement(By.id("Div1")).getAttribute("style");
		
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("Is enable");
				Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		

	}

}
