import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Ignore;
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


	@Test
	@Ignore
	public void Zattini_IncluirProduto_Firefox() {

		AbrirNavegador(browser[0], endereco);

		String keysToSend = "Bolsa Santa Lolla Shopper Logo Feminina - Preto";
		cDriver.findElementById("search-input").sendKeys(keysToSend);
		cDriver.findElementById("search-input").sendKeys(Keys.ENTER);

		String xPathProduto = "//div[@id='item-list']/div[@class='wrapper']/div[1]/div[@class='pr']/a[@href='//www.zattini.com.br/bolsa-santa-lolla-shopper-logo-feminina-H08-2084-006']/span[.='199,90']";
		String precoProduto = cDriver.findElementByXPath(xPathProduto).getText();
		precoProduto = "R$ " + precoProduto;

		String xPathBolsa = "//div[@id='item-list']/div[@class='wrapper']/div[1]";
		cDriver.findElementByXPath(xPathBolsa).click();

		cDriver.findElementById("buy-button-now").click();
		EsperaCarregamento(1000);

		String tituloTela = cDriver.findElementByXPath("//div[@id='table-cart-data']//h1[@class='base-title']").getText();
		String tituloEsperado = "SACOLA";

		String precoProdutoSacola = cDriver.findElementByXPath("/html//div[@id='table-cart-data']/table[@class='table-products']//p[@class='new-price']").getText();

		assertEquals(tituloEsperado, tituloTela);
		assertEquals(precoProdutoSacola, precoProduto);

		FecharNavegador(browser[0]);
	}


	@Test
	public void Zattini_IncluirProduto_Chrome() {

		AbrirNavegador(browser[1], endereco);		

		String keysToSend = "Bolsa Santa Lolla Shopper Logo Feminina - Preto";
		cDriver.findElementById("search-input").sendKeys(keysToSend);
		cDriver.findElementById("search-input").sendKeys(Keys.ENTER);

		String xPathProduto = "//div[@id='item-list']/div[@class='wrapper']/div[1]/div[@class='pr']/a[@href='//www.zattini.com.br/bolsa-santa-lolla-shopper-logo-feminina-H08-2084-006']/span[.='199,90']";
		String precoProduto = cDriver.findElementByXPath(xPathProduto).getText();
		precoProduto = "R$ " + precoProduto;

		String xPathBolsa = "//div[@id='item-list']/div[@class='wrapper']/div[1]";
		cDriver.findElementByXPath(xPathBolsa).click();

		cDriver.findElementById("buy-button-now").click();
		EsperaCarregamento(1000);

		String tituloTela = cDriver.findElementByXPath("//div[@id='table-cart-data']//h1[@class='base-title']").getText();
		String tituloEsperado = "SACOLA";

		String precoProdutoSacola = cDriver.findElementByXPath("/html//div[@id='table-cart-data']/table[@class='table-products']//p[@class='new-price']").getText();

		assertEquals(tituloEsperado, tituloTela);
		assertEquals(precoProdutoSacola, precoProduto);


		FecharNavegador(browser[1]);

	}


	@Test
	@Ignore
	public void Zattini_IncluirProduto_IE() {

		AbrirNavegador(browser[2], endereco);

		String keysToSend = "Bolsa Santa Lolla Shopper Logo Feminina - Preto";
		cDriver.findElementById("search-input").sendKeys(keysToSend);
		cDriver.findElementById("search-input").sendKeys(Keys.ENTER);

		String xPathProduto = "//div[@id='item-list']/div[@class='wrapper']/div[1]/div[@class='pr']/a[@href='//www.zattini.com.br/bolsa-santa-lolla-shopper-logo-feminina-H08-2084-006']/span[.='199,90']";
		String precoProduto = cDriver.findElementByXPath(xPathProduto).getText();
		precoProduto = "R$ " + precoProduto;

		String xPathBolsa = "//div[@id='item-list']/div[@class='wrapper']/div[1]";
		cDriver.findElementByXPath(xPathBolsa).click();

		cDriver.findElementById("buy-button-now").click();
		EsperaCarregamento(1000);

		String tituloTela = cDriver.findElementByXPath("//div[@id='table-cart-data']//h1[@class='base-title']").getText();
		String tituloEsperado = "SACOLA";

		String precoProdutoSacola = cDriver.findElementByXPath("/html//div[@id='table-cart-data']/table[@class='table-products']//p[@class='new-price']").getText();

		assertEquals(tituloEsperado, tituloTela);
		assertEquals(precoProdutoSacola, precoProduto);

		FecharNavegador(browser[2]);

	}

}
