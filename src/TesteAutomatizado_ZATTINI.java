import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

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
	
	@After
	public void FecharNavegador(){
		FecharNavegador(navegador);		
	}
	
	@Test
	public void Zattini_IncluirProduto_Firefox() {
	    
		AbrirNavegador(browser[2], endereco);
		FecharNavegador(browser[2]);
	    
	}

}
