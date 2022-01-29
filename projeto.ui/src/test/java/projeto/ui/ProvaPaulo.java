package projeto.ui;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProvaPaulo {

	WebDriver driver;

	@Before
	public void setUp() throws Exception {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void validarLogin() throws InterruptedException {
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		assertEquals("standard_user", "standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		assertEquals("secret_sauce", "secret_sauce");

		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
		driver.findElement(By.name("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).click();
		driver.findElement(By.name("checkout")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys("Pedro ");
		Thread.sleep(2000);
		driver.findElement(By.id("last-name")).sendKeys("Yago Nascimento");
		Thread.sleep(2000);
		driver.findElement(By.name("postalCode")).sendKeys("36205-042");
		Thread.sleep(2000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("finish")).click();

	}

}
