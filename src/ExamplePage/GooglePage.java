package ExamplePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PageObject.Base;

public class GooglePage extends Base {
	//Elementos localizado en Google
	By aceptarCookies = By.id("L2AGLb");
	By imagenGoogle = By.xpath("//img[@src='/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png']");
	By espacioBuscador = By.name("q");
	By BuscarGoogle = By.name("btnK");
	By enlaceWiki = By.xpath("//*[@id=\"rso\"]/div[3]/div/div/div/div/div/div[1]/div/a/h3");
	
	
	//entra en google y acepta las cookies
	public void aceptarcookies(WebDriver driver) throws Exception {
		waitSeconds(2);
		click(aceptarCookies, driver);	
	}
	
	//rellena el espacio con la palabra Automatización	
	public void rellenaEspacio(WebDriver driver) throws Exception {
		waitSeconds(2);
		click(espacioBuscador, driver);
		waitSeconds(2);
			type("Automatización", espacioBuscador, driver);
			waitSeconds(3);
			
			click(BuscarGoogle, driver);		
	}
	
	//realiza un clic en el enlace de wipedia
	public void clickWiki(WebDriver driver) throws Exception {
		waitSeconds(3);
		click(enlaceWiki, driver);
		waitSeconds(3);
	}


}
