import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class SeleniumTest {

 @Test
    public void openGooglePage() {
//     System.setProperty("webdriver.chrome.driver","/Users/anetapospiech/Downloads/chromedriver");
     WebDriver driver = getDriver("firef  ox");
 }
 public WebDriver getDriver(String browser) {
     switch (browser) {
         case "chrome":
             String chromePath = "/Users/anetapospiech/Downloads/chromedriver";
             System.setProperty("webdriver.chrome.driver", chromePath);
             return new ChromeDriver();
         case "firefox":
             return new FirefoxDriver();
         default:
             throw new InvalidArgumentException("Invalid browser name");


     }
//driver.get("https://www.google.com");
    }
}
