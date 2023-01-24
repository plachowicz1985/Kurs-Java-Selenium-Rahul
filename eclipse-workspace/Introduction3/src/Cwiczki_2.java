import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Cwiczki_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty( "webdriver.chrome.driver", "/Users/piotrek/Downloads/chromedriver 3");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.xpath("//div/input[@name='name']")).sendKeys("Piotr");
		
		driver.findElement(By.xpath("//div/input[@name='email']")).sendKeys("elti19@o2.pl");
		
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Dupa");
		
		WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByVisibleText("Male");
		
		driver.findElement(By.id("exampleCheck1")).click();
			
		
		driver.findElement(By.id("inlineRadio2")).click();
		
		driver.findElement(By.xpath("//div/input[@name='bday']")).sendKeys("01011985");
		
		driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
			
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
				
		
		

	}

}
