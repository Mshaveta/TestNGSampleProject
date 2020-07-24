import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstScript {
	@Test
	public void launchBrowser() {
		System.out.println("Start Execution");
		String url = System.getProperty("user.dir")+"\\src\\Drivers\\chromedriver_84.exe";
		System.setProperty("webdriver.chrome.driver", url);
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("End Execution");
	}
}
