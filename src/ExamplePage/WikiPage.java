package ExamplePage;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

import PageObject.Base;

public class WikiPage extends Base {
	
	//Abre el buscador de la web
	public void controlF(WebDriver driver) throws Exception {
		waitSeconds(3);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_F);
		waitSeconds(3);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_F);	
	}
	
	//introduce "primer proceso" y lo busca en la página
	public void realizarBusqueda(WebDriver driver) throws Exception {
		waitSeconds(3);
		StringSelection texto = new StringSelection("primer proceso");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(texto, null);
		waitSeconds(3);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		waitSeconds(3);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
	}


	


}
