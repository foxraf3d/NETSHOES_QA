import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;


public class BaseTest {

	FirefoxDriver fDriver;
	ChromeDriver cDriver;
	InternetExplorerDriver ieDriver;
	
	public BaseTest(){

		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
	}

	//Abrindo o navegador
	protected void AbrirNavegador(String navegador, String endereco){		
		
		switch (navegador){
		case "Firefox":
			
			/*FirefoxOptions optionFirefox = new FirefoxOptions();
			optionFirefox.addArguments("test-type");
			optionFirefox.addArguments("start-maximized");
			optionFirefox.addArguments("--js-flags=--expose-gc");
			optionFirefox.addArguments("--enable-precise-memory-info");
			optionFirefox.addArguments("--disable-popup-blocking");
			optionFirefox.addArguments("--disable-default-apps");
			optionFirefox.addArguments("test-type=browser");
			optionFirefox.addArguments("disable-infobars");*/
			
			fDriver = new FirefoxDriver(/*optionFirefox*/);
			fDriver.get(endereco);
			break;

		case "Chrome":
			
			ChromeOptions optionChrome = new ChromeOptions();
			optionChrome.addArguments("test-type");
			optionChrome.addArguments("start-maximized");
			optionChrome.addArguments("--js-flags=--expose-gc");
			optionChrome.addArguments("--enable-precise-memory-info");
			optionChrome.addArguments("--disable-popup-blocking");
			optionChrome.addArguments("--disable-default-apps");
			optionChrome.addArguments("test-type=browser");
			optionChrome.addArguments("disable-infobars");
			
			cDriver = new ChromeDriver(optionChrome);
			cDriver.get(endereco);
			break;

		case "IE":
			
			InternetExplorerOptions optionIE = new InternetExplorerOptions(); 
			optionIE.addCommandSwitches("test-type");
			optionIE.addCommandSwitches("start-maximized");
			optionIE.addCommandSwitches("--js-flags=--expose-gc");
			optionIE.addCommandSwitches("--enable-precise-memory-info");
			optionIE.addCommandSwitches("--disable-popup-blocking");
			optionIE.addCommandSwitches("--disable-default-apps");
			optionIE.addCommandSwitches("test-type=browser");
			optionIE.addCommandSwitches("disable-infobars");
			
			ieDriver = new InternetExplorerDriver(optionIE);
			ieDriver.get(endereco);
			break;
		}
	}

	//Fechando o Navegador
	protected void FecharNavegador(String navegador){
		switch (navegador){
		case "Firefox":
			fDriver.quit();;
			break;

		case "Chrome":
			cDriver.quit();
			break;

		case "IE":
			ieDriver.quit();
			break;
		}
	}
}
