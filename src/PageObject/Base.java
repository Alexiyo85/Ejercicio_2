package PageObject;

import java.io.File;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import TestJava.Ejercicio2;

public class Base {
	Ejercicio2 ejercicio2;
	
	
	/*
	 * PageObject
	 * Aqui tenemos los metodos que son necesarios para las ExamplePage y TestJava
	 */
	
	
	/*
	 * Realizamos la llamada del Webdriver
	 */
	public WebDriver chromeDriverConnection() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	/*
	 * Se crean metodos con todos los Locators de las paginas que se necesitan para la busqueda de elementos web
	 */
	
	//Localiza un Webelement (name, id, Xpath,..)
	public WebElement findElement(By locator, WebDriver driver) {
		return driver.findElement(locator);
	}
	
	//Introduce texto en el elemento web seleccionado
	public void type(String inputText, By locator, WebDriver driver) {
		driver.findElement(locator).sendKeys(inputText);
	}
	
	//Realiza click sobre el elemento seleccionado
	public void click (By locator, WebDriver driver) {
		driver.findElement(locator).click();
	}
	
	//abre la url 
	public void visit(String url, WebDriver driver) {
		driver.get(url);
	}
	
	//Realiza una espera explicita en segundos
	public void waitSeconds(final int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
		}
	}
	
	//obtiene la fecha en el formato indicado
	public String getDate() {
	DateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");
	Date date = new Date();
	return dateFormat.format(date);
	}
	
	//obtiene un numero aleatorio, esto se realice para que saque varias campetas con ejecuciones del mismo día
	public String  contador() {
		long contador = RandomUtils.nextLong(0L, Long.MAX_VALUE);
		return String.valueOf(contador);
	}
	
	//Busca el nombre de la clase Test y lo introuce como nombre de una carpeta
	public String nombreTest() throws Exception {
		String nombreProyecto = Ejercicio2.class.getName();
		return nombreProyecto;
	}
	
	//Crea las evidencias en la ruta especificada
	public void captura(String paso, WebDriver driver, String contador, String nombre) throws Exception {
		TakesScreenshot miScreen = ((TakesScreenshot) driver);
		String directorio = System.getProperty("user.dir");
			File DestinoArchivo = new File(directorio + "\\src\\Captura\\ "+nombre +"\\"+ getDate()+ "\\"+ contador  +"\\"+ paso +".png");
			
				File archivo = miScreen.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(archivo, DestinoArchivo);
				System.out.println(DestinoArchivo);
			
		}

		
	
	

	


	
}
