package selenium;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {
	@BeforeEach
	public void openBrowser() {
		// aqui pode-se criar o driver e abrir o browser
	}

	@AfterEach
	public void closeBrowser() {
		// driver.close();
	}

	@Test
	public void searchIfpaBelemTads() {
		WebDriver driver;   // driver do browser
		WebElement searchBox;   // elemento da página 
		WebElement searchResults;

		System.setProperty("webdriver.chrome.driver", 
				           "src/test/resources/driver/chromedriver91.exe");
		
		driver = new ChromeDriver();  // abre o browser Chrome

		driver.get("https://www.google.com.br");

		searchBox = driver.findElement(By.cssSelector("[name='q']"));
		searchBox.sendKeys("curso tads ifpa");
		searchBox.submit();

		searchResults = driver.findElement(By.cssSelector("#search"));

		assertTrue(searchResults.isDisplayed());
		assertTrue(driver.getTitle().toUpperCase().startsWith("CURSO TADS"));
	}

}