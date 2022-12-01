import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class SeleniumTest {

 @Test
    public void openGooglePage() {
     System.setProperty("webdriver.chrome.driver","/Users/anetapospiech/Downloads/chromedriver");
     WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com");
    }
}
