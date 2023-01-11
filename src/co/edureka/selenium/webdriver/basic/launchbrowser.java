package co.edureka.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchbrowser {
	
	public static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ffernanf\\eclipse-workspace\\Selenium_java\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.navigate().to("https://amazon.in");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		
		if (title.equalsIgnoreCase("Amazon.in"))
			System.out.println("Title matches");
		else
			System.out.println(title);

	}

}
