import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
		//Invoking Browser
		//Chrome - ChromeDriver -> Methods

		System.setProperty( "webdriver.chrome.driver", "/Users/piotrek/Downloads/chromedriver 2");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.warta.pl/");
//		
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		driver.close();
		
		String legia = "Legia Warszawa To Najlepszy Klub";
		String[] podzial = legia.split("To");
		System.out.println(podzial[0]);
		System.out.println(podzial[1]);
		//System.out.println(podzial[2]);
		//System.out.println(podzial[3]);
		//System.out.println(podzial[4]);
		System.out.println(podzial[1].trim());

//		for (int i =0; i<legia.length(); i++)
//		{
//			System.out.println(legia.charAt(i));
//		}
		for (int i =legia.length()-1; i>=0; i--)
     		{
			System.out.println(legia.charAt(i));
			}
		
	}

}
