package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class Hook  {
    public static  WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public void openHomePage()  {
        System.out.println("Running test");
    }



    @AfterSuite(alwaysRun=true)
    public void CloseBrowser() {
     driver.quit();
    }
}
