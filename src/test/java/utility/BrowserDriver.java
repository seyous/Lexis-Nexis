package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserDriver {

  //static WebDriver driver;
    public static WebDriver getDriver() {

        System.setProperty("web-driver.chrome.driver", "C:\\Users\\customer\\Downloads\\chromedriver_win32\\chromedriver.exe");
        Hook.driver.get("https://risk.lexisnexis.co.uk/");
        Hook.driver.manage().window().maximize();
        return Hook.driver;

    }

}
