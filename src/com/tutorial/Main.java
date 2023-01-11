package com.tutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	public static void main (String [ ]args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ffernanf\\eclipse-workspace\\Selenium_java\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:stackoverflow.com");
		List<WebElement> list = driver.findElements(By.className("question-hyperlink"));
		list.forEach(e->System.out.println(e.getAttribute("href")));
		Thread.sleep(3000);
		driver.quit();
	}

}
