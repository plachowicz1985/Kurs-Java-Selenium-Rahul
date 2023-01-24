package XI_RealTimeExcersises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Zadanie6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/piotrek/Downloads/chromedriver 3");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("checkBoxOption1")).click();
		String text = driver.findElement(By.xpath("//label[@for='bmw']")).getText();
		System.out.println(text);
		
		//szukanie i wybór z listy rozwijanej
		WebElement staticDropdown = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByVisibleText(text);
		
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("confirmbtn")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		
		String textAlert = driver.switchTo().alert().getText();
		if(textAlert.contains(text)) {
			System.out.println("Dobrze");
		}
		else {
			System.out.println("Źle");
		}
			
	}

}
