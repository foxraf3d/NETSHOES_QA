import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BaseTest {

	WebDriver fDriver;
	ChromeDriver cDriver;
	WebDriver ieDriver;

	JavascriptExecutor jse;


	//Abrindo o navegador
	protected void AbrirNavegador(String navegador, String endereco){		

		switch (navegador){
		case "Firefox":

			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
			//System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");

			fDriver = new FirefoxDriver();
			fDriver.manage().window().maximize();
			fDriver.navigate().to(endereco);
			break;

		case "Chrome":

			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

			cDriver = new ChromeDriver();
			cDriver.manage().window().maximize();
			cDriver.navigate().to(endereco);
			break;

		case "IE":

			System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");

			ieDriver = new InternetExplorerDriver();
			ieDriver.manage().window().maximize();
			ieDriver.navigate().to(endereco);
			break;
		}
	}

	//Fechando o Navegador
	protected void FecharNavegador(String navegador){
		switch (navegador){
		case "Firefox":
			fDriver.close();
			break;

		case "Chrome":
			cDriver.close();
			break;

		case "IE":
			ieDriver.close();
			break;
		}
	}

	//Rolando a tela para Baixo
	protected void RolandoTelaScrollDown(String navegador, int parametro_Y){


		switch (navegador){
		case "Firefox":
			jse = (JavascriptExecutor)fDriver;
			jse.executeScript("window.scrollBy(0,250)", "");
			break;

		case "Chrome":
			jse = (JavascriptExecutor)cDriver;
			jse.executeScript("window.scrollBy(0, " + parametro_Y +")", "");
			break;

		case "IE":
			jse = (JavascriptExecutor)ieDriver;
			jse.executeScript("window.scrollBy(0,250)", "");
			break;
		}
	}

	//Rolando a tela para cima
	protected void RolandoTelaScrollUp(String navegador){


		switch (navegador){
		case "Firefox":
			jse = (JavascriptExecutor)fDriver;
			jse.executeScript("window.scrollBy(0,-250)", "");
			break;

		case "Chrome":
			jse = (JavascriptExecutor)cDriver;
			jse.executeScript("window.scrollBy(0,-250)", "");
			break;

		case "IE":
			jse = (JavascriptExecutor)ieDriver;
			jse.executeScript("window.scrollBy(0,-250)", "");
			break;
		}
	}
	
	//Esperar Carregamento de Tela
	protected void EsperaCarregamento(long tempo){
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			String erro = e.getMessage();
			e.printStackTrace();
		}
	}
}
