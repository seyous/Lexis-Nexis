package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Hook {
    public static  WebDriver driver = new ChromeDriver();


    @AfterSuite
    public void CloseBrowser() {
     driver.quit();
    }
}
