package com.cursoAutomatizcaion;

import java.time.Duration;

import org.junit.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MercuryTours_AutomatedTest {
	
	static WebDriver driver;
	public WebElement aceptBotton;
	@FindBy (xpath = "//input[@src='images/submit.gif']")
	
	//Aceptar Cookies
	
	By cookiesAcept = By.xpath("//*[@id=\"save\"]");
	
	
	//Pagina principal
	By regiserLinkLocator = By.linkText("REGISTER") ;
	By registerPageLocator = By.xpath("//img[@src='images/mast_register.gif']") ;
	
	//Pagina Registro
	By userNameLocator = By.xpath("//*[@id=\"email\"]");
	By passwordLocator = By.name("password");
	By passwordConfirmLocator = By.name("confirmPassword");
	

	
	@BeforeClass
	public static void beforeclass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_java\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	
	
	@Before
	public void setUp() throws Exception {
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		
		
		
		System.out.println("Prueba: @Before");
		
	}
	
	@Test
	
	public void test() throws Exception  {
		WebDriverWait ewait = new WebDriverWait(driver, Duration.ofSeconds(50));
		/*
		//driver.findElement(cookiesAcept);
		
		ewait.until(ExpectedConditions.elementToBeClickable(cookiesAcept));
		//driver.findElement(cookiesAcept).click();
		*/
		
		ewait.until(ExpectedConditions.elementToBeClickable(regiserLinkLocator));
		driver.findElement(regiserLinkLocator).click();
		
		
		/*
		 * se crea el if para decir que el si el resultado es verdadero y el XPATH esta dentro de la pagina debe hacer lo siguiente
		 */
		if (driver.findElement(registerPageLocator).isDisplayed()) { 
			driver.findElement(userNameLocator).sendKeys("qualityadmin");
			driver.findElement( passwordLocator).sendKeys("pass1");
			driver.findElement(passwordConfirmLocator).sendKeys("pass1");
			
			
			
			
			
			ewait.until(ExpectedConditions.elementToBeClickable(aceptBotton));
		}
		else {
			System.out.println("Register pages was not found");
		}
		
		System.out.println("Prueba: @test");
	}
	
	
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
		
		System.out.println("Prueba: @After");
	}
	
	

}
