package selenium;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CalculaPercentualTest {
	private WebDriver driver;	

	@BeforeEach
	public void openBrowser() {
		// cria o driver e abre o browser
		System.setProperty("webdriver.chrome.driver", 
		           "src/test/resources/driver/chromedriver91.exe");
		driver = new ChromeDriver();  // abre o browser Chrome
		driver.get("https://www.blitzresults.com/pt-br/porcentagens/");
	}

	@AfterEach
	public void closeBrowser() {
		driver.close();
	}

	@AfterClass
	public void closeAll() {
		driver.quit();
	}
	
	@Test
	public void calculo1() throws InterruptedException {				
		// campos/elementos de entrada e saida
		WebElement input1 = driver.findElement(By.id("fieldname8_1")); // primeiro valor no "input" 'fieldname8_1'
		input1.clear();
		input1.sendKeys("26");
		WebElement input2 = driver.findElement(By.id("fieldname2_1"));
		input2.clear();
		input2.sendKeys("133");
		WebElement submit = driver.findElement(By.id("fieldname5_1")); // tipo "button"
		submit.click();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement resultado = driver.findElement(By.id("fieldname1_1"));
		
		System.out.println("resultado="+resultado.getAttribute("value") );
		assertEquals("34,58", resultado.getAttribute("value"));		 
	}

	@Test
	public void calculo2() throws InterruptedException {				
		// campos/elementos de entrada e saida
		WebElement input1 = driver.findElement(By.id("fieldname8_1")); // primeiro valor no "input" 'fieldname8_1'
		input1.clear();
		input1.sendKeys("10");
		WebElement input2 = driver.findElement(By.id("fieldname2_1"));
		input2.clear();
		input2.sendKeys("200");
		WebElement submit = driver.findElement(By.id("fieldname5_1")); // tipo "button"
		submit.click();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement resultado = driver.findElement(By.id("fieldname1_1"));
		
		System.out.println("resultado="+resultado.getAttribute("value") );
		assertEquals("20,00", resultado.getAttribute("value"));		 
	}
	
	
	@Test
	public void calculo3() throws InterruptedException {				
		// campos/elementos de entrada e saida
		WebElement input1 = driver.findElement(By.id("fieldname8_1")); // primeiro valor no "input" 'fieldname8_1'
		input1.clear();
		input1.sendKeys("0.55");
		WebElement input2 = driver.findElement(By.id("fieldname2_1"));
		input2.clear();
		input2.sendKeys("1000");
		WebElement submit = driver.findElement(By.id("fieldname5_1")); // tipo "button"
		submit.click();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement resultado = driver.findElement(By.id("fieldname1_1"));
		
		System.out.println("resultado="+resultado.getAttribute("value") );
		assertEquals("5,50", resultado.getAttribute("value"));		 
	}
		
}