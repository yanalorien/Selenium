package com.selenium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

class UsingWDManager
{
	private WebDriver driver;
	
	@Test
	void testChrome()
	{
		WebDriverManager.chromedriver().browserVersion("87").setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test
	void testFirefox()
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test
	void testEdge()
	{
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.google.com/");
	}
	
	@AfterEach
	void tearDown()
	{
		driver.quit();
	}
}
