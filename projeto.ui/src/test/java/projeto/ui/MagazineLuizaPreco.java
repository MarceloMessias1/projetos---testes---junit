package projeto.ui;

import static org.junit.Assert.*;

import java.awt.RenderingHints.Key;
import java.util.concurrent.Executor;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MagazineLuizaPreco {

	WebDriver driver;
	JavascriptExecutor executor = (JavascriptExecutor) driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.magazineluiza.com.br/");
		driver.manage().window().maximize();

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		Thread.sleep(3000);

		driver.get("https://www.magazineluiza.com.br/");

		driver.findElement(By.id("input-search")).sendKeys("sofa");
		driver.findElement(By.xpath("//*[text()='ENTENDI E FECHAR']")).click();
		driver.findElement(By.id("input-search")).submit();

	}

	@Test
	public void test1() throws InterruptedException {
		driver.get("https://www.magazineluiza.com.br/busca/sofa/");

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/section[4]/div[3]/div/ul/li[1]/a/div[1]")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/p")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/div[5]/div[1]/div[3]/div[2]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[3]/div[3]/div[1]/button")).click();
	}

}