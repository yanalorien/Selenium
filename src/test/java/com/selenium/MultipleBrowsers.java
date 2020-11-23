package com.selenium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class MultipleBrowsers
{
	private WebDriver driver;
	private String title = "SeleniumHQ Browser Automation";
	
	@BeforeEach
	void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	void test()
	{
		driver.get("https://www.selenium.dev/");
		assertEquals(title, driver.getTitle());
	}
	
	@AfterEach
	void tearDown()
	{
		driver.quit();
	}
}
