package projeto.ui;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.Assume.assumeTrue;

import javax.swing.JSeparator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType.ForSeleniumServer;

public class CasasBahiaScroll {

	WebDriver driver;

	@Before
	public void setUp() throws Exception {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.casasbahia.com.br");
		driver.manage().window().maximize();
		//Thread.sleep(5000);
//	((JavascriptExecutor)driver).executeScript("scroll(0,40000)");
	
	}
	
	

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void test() {
		driver.findElement(By.id("strBusca")).click();
//		driver.findElement(By.xpath("//*[@class='ac-suggest-term']")).sendKeys("tv");
		String tituloPagina = driver.getTitle();
		System.out.println(tituloPagina);
		assertEquals(
				"Casas Bahia: Produtos para sua casa, de tecnologia, móveis, eletrodomésticos e muito mais você encontra aqui!",
				tituloPagina);

	}

}
