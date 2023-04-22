package Edit.EducacionIT_63596;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;

public class Class4 {
	String url = "http://automationpractice.pl/index.php";
	WebDriver driver;

	@Test
	public void registrarUsuario() {

		driver = new ChromeDriver();
		driver.get(url); // Abrir la pagina
		driver.manage().window().maximize();// Maximizar la ventana
		driver.manage().deleteAllCookies();// Borrar las cookies

		// Paso 1: Hacer click en Sign In
		WebElement linkSignIn = driver.findElement(By.partialLinkText("Sign"));
		linkSignIn.click();

		driver.findElement(By.partialLinkText("Sign")).click();

		// Paso 2: Escribir el correo y hacer click en el boton
		
//		String email= "correo" + Math.random() + "@gmail.com";
		Faker faker= new Faker();
		String email=faker.internet().emailAddress();
		
		driver.findElement(By.name("email_create")).sendKeys(email);
		driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();

		// Es necesaria una espera porque hay una demora en la carga del formulario

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#id_gender1")));

		// Paso 3: completar el formulario
		driver.findElement(By.cssSelector("#id_gender1")).click(); // Radio Button title
		driver.findElement(By.cssSelector("#customer_firstname")).sendKeys("Peperino");
		driver.findElement(By.cssSelector("#customer_lastname")).sendKeys("Pomoro");
		driver.findElement(By.cssSelector("#email")).clear();
		driver.findElement(By.cssSelector("#email")).sendKeys("correero21@gmail.com");
		driver.findElement(By.cssSelector("#passwd")).sendKeys("123456789");

		Select seldays = new Select(driver.findElement(By.name("days")));
		seldays.selectByVisibleText("18  ");

		Select selmonths = new Select(driver.findElement(By.xpath("//select[@id='months']")));
		selmonths.selectByValue("6");

		Select selyears = new Select(driver.findElement(By.xpath("//select[@id='years']")));
		selyears.selectByValue("2022");

		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.name("optin")).click();
		// paso 4: Hcer click en el boton Register

		driver.findElement(By.name("submitAccount")).click();
	}

}
