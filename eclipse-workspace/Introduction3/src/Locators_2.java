import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Locators_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String name = "Pioter";
		System.setProperty( "webdriver.chrome.driver", "/Users/piotrek/Downloads/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		System.out.println(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText(), "Hello "+ name +",");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();
	}

}
