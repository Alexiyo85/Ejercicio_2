package com.cursoAutomatizcaion;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Esperas {
	
	static WebDriver driver;
	
	@BeforeClass
	public static void beforeclass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_java\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	
	@Before
	public void before() {
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		System.out.println("prueba: @before");
	}
	@Test
	public void test() {
		System.out.println("prueba: @test");
	}
	
	@After
	public void after() {
		driver.quit();
		System.out.println("prueba: @after");
	}
	
	
	
	
}
