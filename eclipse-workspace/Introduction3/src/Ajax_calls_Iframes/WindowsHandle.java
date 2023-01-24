package Ajax_calls_Iframes;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/piotrek/Downloads/chromedriver 3");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.cssSelector(".blinkingText")).click();

		//zlapanie wszystkich okien otwartych przez nasz automat
		Set<String> windows = driver.getWindowHandles();
		
		//przelaczamy sie na okno podrzedne (child window)
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		
		//przechwytywanie tekstu z nowego okna
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		driver.findElement(By.cssSelector(".im-para.red")).getText();
		
		String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(emailId);
	}

}
