import java.io.File;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;

public class Sel_IE{
public static void main(String[] args) {
	
	// NOTE: Goto http://toolsqa.com/selenium-webdriver/internet-explorer-driver-server/ 
	//	IEDriverServer.exe /port=1080 /log-level=DEBUG
		
		String exePath ="C:\\Users\\Sinha\\Documents\\Selenium\\IEDriverServer.exe"; 
		InternetExplorerDriverService.Builder serviceBuilder = new InternetExplorerDriverService.Builder();
		serviceBuilder.usingPort(1080); // This specifies that sever should start at this port
		serviceBuilder.usingDriverExecutable(new File(exePath)); //Tell it where you server exe is
		serviceBuilder.withHost("3.8.0.0");
		InternetExplorerDriverService service = serviceBuilder.build(); //Create a driver service and pass it to Internet explorer driver instance
		InternetExplorerDriver driver = new InternetExplorerDriver(service);
		driver.get("http://toolsqa.wpengine.com");
	}
}