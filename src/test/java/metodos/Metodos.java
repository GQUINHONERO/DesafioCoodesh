package metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

WebDriver driver;
	
	public void abrirBrowser(String site) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GUSTAVO QUINHONERO\\Downloads\\driveratt\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();
	}
	public void validarBarraRolagem(By elementos, String textoEsperado) {

        WebElement element = driver.findElement(elementos);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        driver.findElement(elementos);

        String texto = driver.findElement(elementos).getText();
        assertEquals(textoEsperado, texto);
        driver.close();

    
    }
}