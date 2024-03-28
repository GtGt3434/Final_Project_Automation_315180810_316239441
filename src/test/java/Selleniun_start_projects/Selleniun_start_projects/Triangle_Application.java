package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Triangle_Application {
	static WebDriver browser;

	@SuppressWarnings("deprecation")
	@Before
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\WebDrivers\\geckodriver.exe");
		browser = new FirefoxDriver();
		browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		browser.get("https://testpages.eviltester.com/styled/apps/triangle/triangle001.html");
	}

	@Test
	public void Side_1_Not_A_Number() {
		browser.findElement(By.id("side1")).sendKeys("a");
		browser.findElement(By.id("side2")).sendKeys("2");
		browser.findElement(By.id("side3")).sendKeys("2");
		browser.findElement(By.id("identify-triangle-action")).click();
		String expected = "Error: Side 1 is not a Number";
		String result = browser.findElement(By.id("triangle-type")).getText();
		assertEquals(expected, result);
	}

	@Test
	public void Side_2_Not_A_Number() {
		browser.findElement(By.id("side1")).sendKeys("2");
		browser.findElement(By.id("side2")).sendKeys("a");
		browser.findElement(By.id("side3")).sendKeys("2");
		browser.findElement(By.id("identify-triangle-action")).click();
		String expected = "Error: Side 2 is not a Number";
		String result = browser.findElement(By.id("triangle-type")).getText();
		assertEquals(expected, result);
	}

	@Test
	public void Side_3_Not_A_Number() {
		browser.findElement(By.id("side1")).sendKeys("2");
		browser.findElement(By.id("side2")).sendKeys("2");
		browser.findElement(By.id("side3")).sendKeys("a");
		browser.findElement(By.id("identify-triangle-action")).click();
		String expected = "Error: Side 3 is not a Number";
		String result = browser.findElement(By.id("triangle-type")).getText();
		assertEquals(expected, result);
	}

	@Test
	public void Not_A_Triangle_Side_1_0() {
		browser.findElement(By.id("side1")).sendKeys("0");
		browser.findElement(By.id("side2")).sendKeys("3");
		browser.findElement(By.id("side3")).sendKeys("3");
		browser.findElement(By.id("identify-triangle-action")).click();
		String expected = "Error: Not a Triangle";
		String result = browser.findElement(By.id("triangle-type")).getText();
		assertEquals(expected, result);
	}

	@Test
	public void Not_A_Triangle_One_Side_is_Bigger_Than_The_Sum_Of_The_Others() {
		browser.findElement(By.id("side1")).sendKeys("3");
		browser.findElement(By.id("side2")).sendKeys("3");
		browser.findElement(By.id("side3")).sendKeys("7");
		browser.findElement(By.id("identify-triangle-action")).click();
		String expected = "Error: Not a Triangle";
		String result = browser.findElement(By.id("triangle-type")).getText();
		assertEquals(expected, result);
	}

	@Test
	public void Equilateral() {
		browser.findElement(By.id("side1")).sendKeys("5");
		browser.findElement(By.id("side2")).sendKeys("5");
		browser.findElement(By.id("side3")).sendKeys("5");
		browser.findElement(By.id("identify-triangle-action")).click();
		String expected = "Equilateral";
		String result = browser.findElement(By.id("triangle-type")).getText();
		assertEquals(expected, result);
	}

	@Test
	public void Isosceles() {
		browser.findElement(By.id("side1")).sendKeys("8");
		browser.findElement(By.id("side2")).sendKeys("8");
		browser.findElement(By.id("side3")).sendKeys("12");
		browser.findElement(By.id("identify-triangle-action")).click();
		String expected = "Isosceles";
		String result = browser.findElement(By.id("triangle-type")).getText();
		assertEquals(expected, result);
	}

	@Test
	public void Scalene() {
		browser.findElement(By.id("side1")).sendKeys("3");
		browser.findElement(By.id("side2")).sendKeys("4");
		browser.findElement(By.id("side3")).sendKeys("2");
		browser.findElement(By.id("identify-triangle-action")).click();
		String expected = "Scalene";
		String result = browser.findElement(By.id("triangle-type")).getText();
		assertEquals(expected, result);
	}

}
