package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.lang.System;

public class Selenium_calculator {

	static WebDriver browser;

	@SuppressWarnings("deprecation")
	@Before
	public void setup() {

		System.setProperty("webdriver.gecko.driver", "C:\\WebDrivers\\geckodriver.exe");
		browser = new FirefoxDriver();
		browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		String url = "https://testpages.eviltester.com/styled/apps/calculator.html";
		browser.get(url);
	}

	
	@Test
	public void Addition1() {

		browser.findElement(By.id("button01")).click();
		browser.findElement(By.id("buttonplus")).click();
		browser.findElement(By.id("button02")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		browser.findElement(By.id("buttonequals")).click();
		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);
		String Expected = "3";
		assertEquals(Expected, result);
		browser.close();
	}

	@Test
	public void Addition2() {

		browser.findElement(By.id("button04")).click();
		browser.findElement(By.id("buttonplus")).click();
		browser.findElement(By.id("button03")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		browser.findElement(By.id("buttonequals")).click();

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);
		String Expected = "7";
		assertEquals(Expected, result);
		browser.close();
	}

	@Test
	public void Subtraction1() {

		browser.findElement(By.id("button04")).click();
		browser.findElement(By.id("buttonminus")).click();
		browser.findElement(By.id("button02")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		browser.findElement(By.id("buttonequals")).click();
		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);
		String Expected = "2";
		assertEquals(Expected, result);
		browser.close();
	}

	@Test
	public void Subtraction2() {

		browser.findElement(By.id("button08")).click();
		browser.findElement(By.id("buttonminus")).click();
		browser.findElement(By.id("button01")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		browser.findElement(By.id("buttonequals")).click();
		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);
		String Expected = "7";
		assertEquals(Expected, result);
		browser.close();
	}

	@Test
	public void Multiplication1() {

		browser.findElement(By.id("button06")).click();
		browser.findElement(By.id("buttonmultiply")).click();
		browser.findElement(By.id("button06")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		browser.findElement(By.id("buttonequals")).click();
		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);
		String Expected = "36";
		assertEquals(Expected, result);
		browser.close();
	}

	@Test
	public void Multiplication2() {

		browser.findElement(By.id("button05")).click();
		browser.findElement(By.id("buttonmultiply")).click();
		browser.findElement(By.id("button03")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		browser.findElement(By.id("buttonequals")).click();
		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);
		String Expected = "15";
		assertEquals(Expected, result);
		browser.close();
	}

	@Test
	public void Division1() {

		browser.findElement(By.id("button09")).click();
		browser.findElement(By.id("buttondivide")).click();
		browser.findElement(By.id("button03")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		browser.findElement(By.id("buttonequals")).click();
		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);
		String Expected = "3";
		assertEquals(Expected, result);
		browser.close();
	}

	@Test
	public void Division2() {

		browser.findElement(By.id("button06")).click();
		browser.findElement(By.id("buttondivide")).click();
		browser.findElement(By.id("button02")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		browser.findElement(By.id("buttonequals")).click();
		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);
		String Expected = "3";
		assertEquals(Expected, result);
		browser.close();
	}

	@Test
	public void Not_Zero_Devided_By_0() {

		browser.findElement(By.id("button05")).click();
		browser.findElement(By.id("buttondivide")).click();
		browser.findElement(By.id("button00")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		browser.findElement(By.id("buttonequals")).click();
		String result = browser.findElement(By.id("calculated-display")).getAttribute("value");
		System.out.println(result);
		String Expected = "Infinity";
		assertEquals(Expected, result);
		browser.close();
	}

	@Test
	public void Zero_Devided_By_Zero() {

		browser.findElement(By.id("button00")).click();
		browser.findElement(By.id("buttondivide")).click();
		browser.findElement(By.id("button00")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		browser.findElement(By.id("buttonequals")).click();
		String result = browser.findElement(By.id("calculated-display")).getAttribute("value");
		System.out.println(result);
		String Expected = "NaN";
		assertEquals(Expected, result);
		browser.close();
	}
}