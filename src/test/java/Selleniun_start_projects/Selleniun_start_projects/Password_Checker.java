package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Password_Checker {
	static WebDriver browser;

	@SuppressWarnings("deprecation")
	@Before
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\WebDrivers\\geckodriver.exe");
		browser = new FirefoxDriver();
		browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		browser.get("https://testpages.eviltester.com/styled/apps/7charval/simple7charvalidation.html");
	}

	@Test
	public void Correct_Password() {

		WebElement textBox = browser.findElement(By.name("characters"));
		textBox.sendKeys("1234567");
		browser.findElement(By.name("validate")).click();

		String expected = "Valid Value";
		String actual = browser.findElement(By.name("validation_message")).getAttribute("value");
		assertEquals(expected, actual);
		browser.close();
	}
//
//	@Test
//	public void Incorrect_More_Than_7_Letters() {
//
//		WebElement textBox = browser.findElement(By.name("characters"));
//		textBox.sendKeys("123456789");
//		browser.findElement(By.cssSelector("input[type='button']")).click();
//		String expected = "Invalid Value";
//		String result = browser.findElement(By.name("validation_message")).getAttribute("value");
//		assertEquals(expected, result);
//		browser.close();
//
//	}
//
//	@Test
//	public void Incorrect_Less_Than_7_Letters() {
//
//		WebElement textBox = browser.findElement(By.name("characters"));
//		textBox.sendKeys("Fadi1");
//		browser.findElement(By.cssSelector("input[type='button']")).click();
//		String expected = "Invalid Value";
//		String result = browser.findElement(By.name("validation_message")).getAttribute("value");
//		assertEquals(expected, result);
//		browser.close();
//
//	}
//
//	@Test
//	public void Unallowed_Letters() {
//
//		WebElement textBox = browser.findElement(By.name("characters"));
//		textBox.sendKeys("123456@");
//		browser.findElement(By.cssSelector("input[type='button']")).click();
//		String expected = "Invalid Value";
//		String result = browser.findElement(By.name("validation_message")).getAttribute("value");
//		assertEquals(expected, result);
//		browser.close();
//
//	}
}
