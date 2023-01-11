package TestJava;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import ExamplePage.GooglePage;
import ExamplePage.WikiPage;
import PageObject.Base;

public class Ejercicio2 {
	
	/*
	 * Ejercicio 2: Consiste en acceder a Google, buscar la palabra "Automatización", pinchar en el enlace de "Wikipedia"
	 * una vez en la pagina de Wikipeda buscar la palabra "primer proceso"
	 */
	
	/*
	 * Desarrollado por Francisco Alejandro Fernández Ferrón
	 */
	
	public static WebDriver driver;
	GooglePage googlePage = new GooglePage();
	WikiPage wikiPage = new WikiPage();
	Base base = new Base();
	String cuenta = base.contador();
	String nombreProyecto = base.nombreTest();

	public Ejercicio2() throws Exception {
	}
	
	
	@Before
	public void setUp() throws Exception {
		System.out.println("BeforeClass");
		driver = base.chromeDriverConnection();
		System.out.println("BeforeClass");
		googlePage.visit("https://www.google.es/", driver);
		System.out.println("Before");
	}


	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void testPrueba() throws Exception{
		
		//entra en google y acepta las cookies
		googlePage.aceptarcookies(driver);
		base.captura("Paso 1", driver, cuenta, nombreProyecto);
		
		//rellena el espacio con la palabra Automatización
		googlePage.rellenaEspacio(driver );
		base.captura("Paso 2", driver, cuenta, nombreProyecto);
		
		//realiza un clic en el enlace de wipedia
		googlePage.clickWiki(driver);
		base.captura("Paso 3", driver, cuenta, nombreProyecto);
		
		//Abre el buscador de la web
		wikiPage.controlF(driver);
		base.captura("Paso 4", driver, cuenta, nombreProyecto);
		
		//introduce "primer proceso" y lo busca en la página
		wikiPage.realizarBusqueda(driver);
		base.captura("Paso 5", driver, cuenta, nombreProyecto);
	}

	
	

}
