package com.selenium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class MultipleBrowsers
{
	private WebDriver driver;
	private String title = "SeleniumHQ Browser Automation";
	private String browser = "edge";
	
	@BeforeEach
	void setup()
	{
		switch(browser)
		{
			case "chrome" -> {
				System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
				driver = new ChromeDriver();}
			case "firefox" -> {
				System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver.exe");
				driver = new FirefoxDriver();}
			case "edge" -> {
				System.setProperty("webdriver.edge.driver", "C:/drivers/msedgedriver.exe");
				driver = new EdgeDriver();}
		}
	}
	
	@Test
	void test()
	{
		driver.get("https://www.selenium.dev/");
		assertEquals(title, driver.getTitle()); // add AssertJ
	}
	
	@AfterEach
	void tearDown()
	{
		driver.quit();
	}
}
