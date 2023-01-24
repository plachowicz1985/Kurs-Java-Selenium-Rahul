import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		System.setProperty( "webdriver.chrome.driver", "/Users/piotrek/Downloads/chromedriver 2");
		
		//String name = "piotrek";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("John");
		driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).sendKeys("1985@gmail.com");
        driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).clear();
        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("piotr.lachowicz1985@gmail.com");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("999888777");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
        
        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
        Thread.sleep(1000);	
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("#chkboxOne")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
//		String password = getPassword(driver);
//		
//		driver.get("https://rahulshettyacademy.com/locatorspractice/");
//		driver.findElement(By.id("inputUsername")).sendKeys(name);
//		driver.findElement(By.id("password")).sendKeys(password);
//		driver.findElement(By.name("commit")).click();
		
//		WebElement Email = driver.findElement(By.id("email"));
//		Email.sendKeys("piotr.lachowicz1985@gmail.com");
		
//		System.out.println(driver.findElement(By.cssSelector("div.auth-flash-error")).getText());
//
//		driver.findElement(By.linkText("Forgot Password")).click();
//		
//		System.out.println(driver.findElement(By.cssSelector("h3.m-b-1-xs")).getText());
		
		//driver.findElement(By.cssSelector("input.email")).sendKeys("piotr.lachowicz1985@gmail.com");
	}
	
//	public static String getPassword(WebDriver driver) throws InterruptedException //metoda szukania hasła
//	
//	{
//		driver.get("https://rahulshettyacademy.com/locatorspractice/");
//		driver.findElement(By.linkText("Forgot your password?")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
//		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
//		String[] passwordArray = passwordText.split("'");
//		String[] passwordArray2 = passwordArray[1].split("'");
//		String password = passwordArray2[0];
//		return password;
//		
//		
//	}

}
