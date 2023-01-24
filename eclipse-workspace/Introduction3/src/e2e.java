import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/piotrek/Downloads/chromedriver 3");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']"))
				.click();

		driver.findElement(By.xpath("//td[@class = ' ui-datepicker-days-cell-over  ui-datepicker-today']")).click();

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("is disable");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();

		driver.findElement(By.id("divpaxinfo")).click();

		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}

		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency'] //option[@value='USD']"))
				.click();

		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	}
}