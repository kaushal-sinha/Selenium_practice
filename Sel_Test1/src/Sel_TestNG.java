
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel_TestNG {
	 public static void main(String[] args) {
		
		 System.out.println("Lets Start");
		 String driverPath ="C:\\Users\\Sinha\\Documents\\Selenium\\";
		 System.setProperty("webdriver.gecko.driver", driverPath+"geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		//driver.navigate().
		driver.get("http://www.google.com");
		System.out.println("Browser Opened Succussfuly");
		driver.close();
		System.out.println("Firefox Browser closed");
	}

}
