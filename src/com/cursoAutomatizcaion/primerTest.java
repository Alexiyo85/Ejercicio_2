package com.cursoAutomatizcaion;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class primerTest {
	
	private WebDriver driver;
	
	
	@Before
	
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_java\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement aceptarCookies = driver.findElement(By.id("L2AGLb"));
		aceptarCookies.click();
		
	}
	@Test
	public void testGooglePage() throws Exception {
		
		
		WebElement searchbox = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		searchbox.click();
		
		searchbox.sendKeys("introdución a la Automatización");
		
		searchbox.submit();
		Thread.sleep(2000);
		assertEquals("introdución a la Automatización", driver.getTitle());
		
	}
	
	@After
	
	public void tearDown() {
		driver.quit();
	}
}
