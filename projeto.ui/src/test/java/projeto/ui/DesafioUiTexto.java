package projeto.ui;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DesafioUiTexto {

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

	@Test
	public void validarPesquisaNoGoogle() {
		driver.get("https://www.itau.com.br");
		driver.findElement(By.id("card-rotating-showcase"));
		System.out.println("card-rotating-showcase");
	}

}
