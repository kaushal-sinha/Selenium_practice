package com.demoshop.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoShop {
	
	WebDriver driver;
	/*String url ="http://demowebshop.tricentis.com";
	String uname="kaushal.kenedysinha@accenture.test";
	String pass="Tosca1234!";*/

	
	@Parameters("url")
	@Test(priority=0)
	public void alaunchBrowser(String url)
	{
		String driverPath ="C:\\Users\\Sinha\\Documents\\Selenium\\";
		System.setProperty("webdriver.gecko.driver", driverPath+"geckodriver.exe");
		driver = new FirefoxDriver();
		//driver.navigate().
		driver.get(url);
		System.out.println("Browser Opened Succussfuly");
		driver.findElement(By.className("ico-login")).click();
		System.out.println("URL: "+url);
	}
	
	@Parameters({"uname","pass"})
	@Test(priority=1)
	public void blogin(String uname,String pass) throws InterruptedException {
		System.out.println("TITLE1:"+driver.getTitle());
		System.out.println("Login");
		System.out.println("UserName: "+uname);
		System.out.println("Password: "+pass);
		
		System.out.println("TITLE:"+driver.getTitle());
		driver.findElement(By.id("Email")).sendKeys(uname);
		driver.findElement(By.id("Password")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@type='submit' and @value='Log in']")).click();
		System.out.println("UserName: "+uname);
		System.out.println("Password: "+pass);
	}
	
	@AfterSuite
	public void clogout() {
		System.out.println("Log Out");
		driver.findElement(By.className("ico-logout")).click();
		driver.close();
		//driver.quit();
	}
	
	@Test(priority=3)
	public void openCamera() {
		System.out.println("Click on camera");
	//driver.findElement(By.xpath("//ul[@class='top-menu']//child::a[contains(@href,'camera')]")).click();
		driver.findElement(By.xpath("//ul[@class='top-menu']//child::a[contains(@href,'electronic')]")).click();
	}
	}
	
