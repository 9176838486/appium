package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/?");
		
		
	}

}
