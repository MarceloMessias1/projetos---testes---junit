package projeto.ui;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrimeiraAutomacao {

	// vamos criar o driver do tipo WebDriver

	WebDriver driver;

	@Before
	public void setUp() throws Exception {

		// cofigurar o driver do navegador desejado
		// dentro da primeira aspa voc� informa o navegador
		// dentro da segunda aspa voc� informa o caminho do driver

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		// abri o navegador atraves de uma nova instacia do chrome

		driver = new ChromeDriver();
		driver.get("https://www.google.com.br");
		driver.manage().window().maximize();

//		driver = new EdgeDriver();
		// entrar no site desejado
		// driver.get("https://www.google.com.br");
		// driver.manage().window().maximize();

//		driver = new FirefoxDriver();
		// driver.get("https://www.google.com.br");
		// driver.manage().window().maximize();

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void validarPesquisaNoGoogle() {
		driver.get("https://www.google.com.br");
		driver.findElement(By.name("q")).sendKeys("Inovaçao");
		driver.findElement(By.name("q")).submit();
		String text = driver
				.findElement(By.xpath("//*[@id=\"_nHncYeqPJs3S1sQP9Lin0AI48\"]/div[2]/div/div/div/div[2]/h2/span"))
				.getText();
		assertTrue(text.equals("Inovaçao"));
	}
}
