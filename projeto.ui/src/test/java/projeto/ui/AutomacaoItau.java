package projeto.ui;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomacaoItau {

	WebDriver driver;

	@Before
	public void setUp() throws Exception {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.itau.com.br");
		driver.manage().window().maximize();

	}

	@After
	public void tearDown() throws Exception {
	}

	// @Test
	public void validarTitle() {
	}

	@Test
	public void validarContaItau() {
		driver.get("https://www.itau.com.br");
		driver.findElement(By.id("agencia")).sendKeys("1243");
		assertEquals("1243", "1243");
		driver.findElement(By.id("conta")).sendKeys("012354");
		assertEquals("012354", "012354");
		driver.findElement(By.xpath("//*[@id='btnLoginSubmit']")).click();
	}

}
