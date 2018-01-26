package browser;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		String driverPath ="C:\\Users\\Sinha\\Documents\\Selenium\\";
		 System.setProperty("webdriver.gecko.driver", driverPath+"geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		//driver.navigate().
		driver.get("http://www.demoqa.com");
		System.out.println("Waiting....");	
		Actions actions = new Actions(driver);
		//actions.keyDown(Keys.CONTROL).sendKeys(Keys.F5).perform();
		actions.sendKeys(Keys.F5).perform();
		System.out.println("Completed...");
		
	}
}
