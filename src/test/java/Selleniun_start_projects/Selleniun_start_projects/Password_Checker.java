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
	public void testPasswordWithMixedCharactersAndSpecialChar() {

		WebElement textBox = browser.findElement(By.name("characters"));
		textBox.sendKeys("A1b2C3*");
		browser.findElement(By.name("validate")).click();

		String expected = "Valid Value";
		String actual = browser.findElement(By.name("validation_message")).getAttribute("value");
		assertEquals(expected, actual);
		browser.close();
	}

	@Test
	public void testPasswordWithMixedCaseLettersOnly() {

		WebElement textBox = browser.findElement(By.name("characters"));
		textBox.sendKeys("abcDEfg");
		browser.findElement(By.name("validate")).click();

		String expected = "Valid Value";
		String actual = browser.findElement(By.name("validation_message")).getAttribute("value");
		assertEquals(expected, actual);
		browser.close();
	}

	@Test
	public void testPasswordWithDigitsOnly() {

		WebElement textBox = browser.findElement(By.name("characters"));
		textBox.sendKeys("1234567");
		browser.findElement(By.cssSelector("input[type='button']")).click();
		String expected = "Valid Value";
		String result = browser.findElement(By.name("validation_message")).getAttribute("value");
		assertEquals(expected, result);
		browser.close();

	}

	@Test
	public void testPasswordWithMixedLettersAndDigits() {

		WebElement textBox = browser.findElement(By.name("characters"));
		textBox.sendKeys("aB3d4E5");
		browser.findElement(By.cssSelector("input[type='button']")).click();
		String expected = "Valid Value";
		String result = browser.findElement(By.name("validation_message")).getAttribute("value");
		assertEquals(expected, result);
		browser.close();

	}

	@Test
	public void testPasswordWithLowerCaseLettersOnly() {

		WebElement textBox = browser.findElement(By.name("characters"));
		textBox.sendKeys("abcdefg");
		browser.findElement(By.cssSelector("input[type='button']")).click();
		String expected = "Valid Value";
		String result = browser.findElement(By.name("validation_message")).getAttribute("value");
		assertEquals(expected, result);
		browser.close();

	}

	@Test
	public void testPasswordWithUpperCaseLettersIncludingABetween() {

		WebElement textBox = browser.findElement(By.name("characters"));
		textBox.sendKeys("YSSOPAF");
		browser.findElement(By.cssSelector("input[type='button']")).click();
		String expected = "Valid Value";
		String result = browser.findElement(By.name("validation_message")).getAttribute("value");
		assertEquals(expected, result);
		browser.close();

	}

	@Test
	public void testPasswordWithUpperCaseLettersExcludingA() {

		WebElement textBox = browser.findElement(By.name("characters"));
		textBox.sendKeys("YSSOPEF");
		browser.findElement(By.cssSelector("input[type='button']")).click();
		String expected = "Valid Value";
		String result = browser.findElement(By.name("validation_message")).getAttribute("value");
		assertEquals(expected, result);
		browser.close();

	}

	@Test
	public void testPasswordWithA_And_AsterisksAfterA() {

		WebElement textBox = browser.findElement(By.name("characters"));
		textBox.sendKeys("A******");
		browser.findElement(By.cssSelector("input[type='button']")).click();
		String expected = "Valid Value";
		String result = browser.findElement(By.name("validation_message")).getAttribute("value");
		assertEquals(expected, result);
		browser.close();

	}

	@Test
	public void testPasswordWithSixCharactersOnly() {

		WebElement textBox = browser.findElement(By.name("characters"));
		textBox.sendKeys("ccrrdd");
		browser.findElement(By.cssSelector("input[type='button']")).click();
		String expected = "Invalid Value";
		String result = browser.findElement(By.name("validation_message")).getAttribute("value");
		assertEquals(expected, result);
		browser.close();

	}

	@Test
	public void testPasswordWithEightCharactersIncludingDigit() {

		WebElement textBox = browser.findElement(By.name("characters"));
		textBox.sendKeys("gaaaaaa8");
		browser.findElement(By.cssSelector("input[type='button']")).click();
		String expected = "Invalid Value";
		String result = browser.findElement(By.name("validation_message")).getAttribute("value");
		assertEquals(expected, result);
		browser.close();

	}

	@Test
	public void testPasswordWithLessThanLowerBoundaryLength() {

		WebElement textBox = browser.findElement(By.name("characters"));
		textBox.sendKeys("Ab12C");
		browser.findElement(By.cssSelector("input[type='button']")).click();
		String expected = "Invalid Value";
		String result = browser.findElement(By.name("validation_message")).getAttribute("value");
		assertEquals(expected, result);
		browser.close();

	}

	@Test
	public void testPasswordWithMoreThanUpperBoundaryLength() {

		WebElement textBox = browser.findElement(By.name("characters"));
		textBox.sendKeys("A1b2C3D4E5");
		browser.findElement(By.cssSelector("input[type='button']")).click();
		String expected = "Invalid Value";
		String result = browser.findElement(By.name("validation_message")).getAttribute("value");
		assertEquals(expected, result);
		browser.close();

	}

	@Test
	public void testPasswordWithSpecialCharacters() {

		WebElement textBox = browser.findElement(By.name("characters"));
		textBox.sendKeys("Ab#c$1*");
		browser.findElement(By.cssSelector("input[type='button']")).click();
		String expected = "Invalid Value";
		String result = browser.findElement(By.name("validation_message")).getAttribute("value");
		assertEquals(expected, result);
		browser.close();

	}

	@Test
	public void testPasswordWithWhitespace() {

		WebElement textBox = browser.findElement(By.name("characters"));
		textBox.sendKeys("A1 b2C3");
		browser.findElement(By.cssSelector("input[type='button']")).click();
		String expected = "Invalid Value";
		String result = browser.findElement(By.name("validation_message")).getAttribute("value");
		assertEquals(expected, result);
		browser.close();

	}

	@Test
	public void testPasswordWithNonEnglishLetters() {

		WebElement textBox = browser.findElement(By.name("characters"));
		textBox.sendKeys("Aפאדי12");
		browser.findElement(By.cssSelector("input[type='button']")).click();
		String expected = "Invalid Value";
		String result = browser.findElement(By.name("validation_message")).getAttribute("value");
		assertEquals(expected, result);
		browser.close();

	}

	@Test
	public void testEmptyPassword() {

		WebElement textBox = browser.findElement(By.name("characters"));
		textBox.sendKeys("");
		browser.findElement(By.cssSelector("input[type='button']")).click();
		String expected = "Invalid Value";
		String result = browser.findElement(By.name("validation_message")).getAttribute("value");
		assertEquals(expected, result);
		browser.close();

	}
}
