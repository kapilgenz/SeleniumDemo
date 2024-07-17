import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class demotest {
 public static WebDriver driver ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--ignore-certificate-errors");
		options.addArguments("--start-maximized");
		options.addArguments("--disable-gpu");
		ChromeOptions options1 = new ChromeOptions();
		options.addArguments("--ignore-certificate-errors");
		options.addArguments("--start-maximized");
		options.addArguments("--disable-gpu");
		ChromeOptions options2 = new ChromeOptions();
		options.addArguments("--ignore-certificate-errors");
		options.addArguments("--start-maximized");
		options.addArguments("--disable-gpu");
		
		 driver = new ChromeDriver(options);
		 System.out.println("conflict");
		 
		 driver.get("https://community2.cloud-2.automationanywhere.digital/#/login");
		 

	}

}
