package Edit.EducacionIT_63596;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Class3 {
// Variables (valorees comunes que vamos a utilizar)
	
	String url = "http://automationpractice.pl/index.php";

	
//Metodos (acciones que se van a ejectura)
	@Test
	public void buscarPalabraChrome() {

		// Acciones o Paso a Paso qpara ejecutar la prueba
		// 1. Indicar que navegador vamos a utilizar
		WebDriver navegador = new ChromeDriver();
		
		// 2.Abrir el navegador en la pagina que vamos a probar
		navegador.get(url);
		
		// 3. Escribir la palabra que queremos buscar
		WebElement txtBuscador = navegador.findElement(By.id("search_query_top"));
		txtBuscador.sendKeys("dress");
		
		// 4. Hacer la busqueda (simulando que presinaoms ENTER)
		txtBuscador.sendKeys(Keys.ENTER); // Simula que presiona esa tecla

		// 5. Cerrar el navegador
	}
	@Test
	
	public void buscarPalabraFirefox() {
		
		FirefoxOptions options = new FirefoxOptions();
        options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
			// Acciones o Paso a Paso qpara ejecutar la prueba
		// 1. Indicar que navegador vamos a utilizar
		WebDriver navegador = new FirefoxDriver(options);
		
		// 2.Abrir el navegador en la pagina que vamos a probar
		navegador.get(url);
		
		// 3. Escribir la palabra que queremos buscar
		WebElement txtBuscador = navegador.findElement(By.id("search_query_top"));
		txtBuscador.sendKeys("dress");
		
		// 4. Hacer la busqueda (simulando que presinaoms ENTER)
		txtBuscador.sendKeys(Keys.ENTER); // Simula que presiona esa tecla

		// 5. Cerrar el navegador
	}
	
	@Test
	public void buscarPalabraEdge() {

		// Acciones o Paso a Paso qpara ejecutar la prueba
		// 1. Indicar que navegador vamos a utilizar
		WebDriver navegador = new EdgeDriver();
		
		// 2.Abrir el navegador en la pagina que vamos a probar
		navegador.get(url);
		
		// 3. Escribir la palabra que queremos buscar
		WebElement txtBuscador = navegador.findElement(By.id("search_query_top"));
		txtBuscador.sendKeys("dress");
		
		// 4. Hacer la busqueda (simulando que presinaoms ENTER)
		txtBuscador.sendKeys(Keys.ENTER); // Simula que presiona esa tecla

		// 5. Cerrar el navegador
	}
}
