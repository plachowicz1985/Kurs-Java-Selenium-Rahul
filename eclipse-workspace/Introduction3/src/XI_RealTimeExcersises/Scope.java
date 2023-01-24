package XI_RealTimeExcersises;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/piotrek/Downloads/chromedriver 3");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//wszystkie linki z tagname a
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//zawężamy wyszukiwanie do interesującej nas sekcji
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		
		//szukamy linków w zawężonym elemencie
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		//ponownie zawężamy wyszukiwanie elementów, tym razem do pierwszej kolumny
		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		
		//klikamy w każdy link w kolumnie i sprawdzamy czy zostały otwarte
		for (int i =0; i<columnDriver.findElements(By.tagName("a")).size(); i++)
		{
			String clickonLinkTab = Keys.chord(Keys.COMMAND,Keys.ENTER);
			
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonLinkTab);
			Thread.sleep(5000L);
		}
		
		//pobieramy nazwy każdej zakładki
	 	Set<String> tagName = driver.getWindowHandles();
	 	Iterator<String> it = tagName.iterator();
		
	 	while(it.hasNext())
	 	{
	 		driver.switchTo().window(it.next());
	 		System.out.println(driver.getTitle());
	 	}
	}

}
