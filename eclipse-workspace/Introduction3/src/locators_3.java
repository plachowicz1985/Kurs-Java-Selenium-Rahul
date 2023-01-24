import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty( "webdriver.chrome.driver", "/Users/piotrek/Downloads/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Sibling - child to parent travel
		//header/div/button[1]/following-sibling::button[1]
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
	}

}
