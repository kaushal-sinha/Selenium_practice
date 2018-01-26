package HtmlElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Html_Elements {
	WebDriver driver;
	@Test
	public void loadPage() {
	 String driverPath ="C:\\Users\\Sinha\\Documents\\Selenium\\";
	 System.setProperty("webdriver.gecko.driver", driverPath+"geckodriver.exe");
	 driver = new FirefoxDriver();
	//driver.navigate().
	driver.get("http://www.demoqa.com");
	System.out.println("Waiting....");	
 }
	@Test(dependsOnMethods="loadPage")
	public void loadElements() {
		System.out.println("loading...");
		List<WebElement> linkElements = driver.findElements(By.tagName("input"));
		String[] linkTexts= new String[linkElements.size()];
		int i=0;
		for (WebElement e:linkElements) {
			linkTexts[i]=e.getText();
			//System.out.println(e.getText());
			i++;
		}
		
		for (String t:linkTexts) {
			driver.findElement(By.linkText(t)).click();
			System.out.println(t);
			System.out.println("	:	");
			System.out.print(driver.getTitle());
			driver.navigate().back();
		}
	}
}
