package com.demoshop.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DemoShop1 {
	
	//WebDriver driver;

	
	@Test
	public void alaunchBrowser()
	{	
	String url ="http://demowebshop.tricentis.com";
	String uname="kaushal.kenedysinha@accenture.test";
	String pass="Tosca1234!";

		String driverPath ="C:\\Users\\Sinha\\Documents\\Selenium\\";
		System.setProperty("webdriver.gecko.driver", driverPath+"geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.navigate().
		driver.get(url);
		System.out.println("Browser Opened Succussfuly");
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys(uname);
		driver.findElement(By.id("Password")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@type='submit' and @value='Log in']")).click();
		//driver.findElement(By.xpath("//ul[@class='top-menu']//descendant::a[contains(@href,'camera')]")).click();
		WebElement ele = driver.findElement(By.xpath("//ul[@class='top-menu']//child::a[contains(@href,'electronic')]"));
		
		Actions action = new Actions(driver);
		 
        action.moveToElement(ele).build().perform();
 
        driver.findElement(By.linkText("Camera, photo")).click();
		//
		//driver.findElement(By.className("ico-logout")).click();
		//driver.close();
		//driver.quit();
	}
}
