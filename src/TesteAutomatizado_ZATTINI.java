import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class TesteAutomatizado_ZATTINI extends BaseTest {
	
	String endereco = "https://www.zattini.com.br/";
	String navegador = null;
	String [] browser;
	
	public TesteAutomatizado_ZATTINI(){
		browser = new String[3];
		browser[0] = "Firefox";
		browser[1] = "Chrome";
		browser[2] = "IE";
	}
	
	/*
	@Test
	public void Zattini_IncluirProduto_Firefox() {
	    
		AbrirNavegador(browser[0], endereco);		
		
		FecharNavegador(browser[0]);
	    
	}
*/
	
	@Test
	public void Zattini_IncluirProduto_Chrome() {
	    
		AbrirNavegador(browser[1], endereco);		
					
		String keysToSend = "Bolsa Santa Lolla Shopper Logo Feminina - Preto";
		cDriver.findElementById("search-input").sendKeys(keysToSend);
		cDriver.findElementById("search-input").sendKeys(Keys.ENTER);
		
		FecharNavegador(browser[1]);
	    
	}
	
	/*
	@Test
	public void Zattini_IncluirProduto_IE() {
	    
		AbrirNavegador(browser[2], endereco);		
		
		RolandoTelaScrollDown(browser[2]);
		
		FecharNavegador(browser[2]);
	    
	}
	*/
}
