package NaveenALSeleniumPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumStartDriver {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://www.google.com");
	}

}
