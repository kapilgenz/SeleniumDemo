import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class demotest {
 public static WebDriver driver ;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--ignore-certificate-errors");
		options.addArguments("--start-maximized");
		options.addArguments("--disable-gpu");
		System.out.println("conflict");
		 driver = new ChromeDriver(options);
		 
		 driver.get("https://community2.cloud-2.automationanywhere.digital/#/login");
		 Thread.sleep(5000);
		 Thread.sleep(6000);
		 

	}

}
