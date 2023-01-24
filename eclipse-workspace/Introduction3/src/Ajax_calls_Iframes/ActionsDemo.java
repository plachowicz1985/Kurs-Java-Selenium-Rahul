package Ajax_calls_Iframes;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/piotrek/Downloads/chromedriver 3");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.pl/");
		driver.findElement(By.id("sp-cc-accept")).click();
		Actions a = new Actions(driver);
		
		WebElement move = driver.findElement(By.id("nav-link-accountList"));
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		//moves to specific element
		a.moveToElement(move).contextClick().build().perform();
	}

}
