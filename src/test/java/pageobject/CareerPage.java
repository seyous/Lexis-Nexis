package pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.Hook;

import java.time.Duration;

public class CareerPage {


    public CareerPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    //Collection of web element
    @FindBy(how = How.XPATH, using = "//a[@data-ux-state='loaded'][normalize-space()='Search all jobs']")
    private WebElement searchJobs;

    @FindBy(how = How.XPATH, using = "//input[@type='text'][@role='textbox']")
    private WebElement searchTextbox;

    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Search']")
    private WebElement searchBtn;


    //method call for About us
    public void clicksearchJobs() throws InterruptedException {
        Thread.sleep(3000);
        searchJobs.click();
    }

    public void SendkeysToSearchBox(String searchResult) {
        WebDriverWait wait = new WebDriverWait(Hook.driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOf(searchTextbox));
        searchTextbox.sendKeys(searchResult, Keys.TAB);
    }

    public void clicksearchBtn() throws InterruptedException {
        Thread.sleep(3000);
        searchBtn.click();
    }

    public void switchWindowHandle() {
        String winHandleBefore = Hook.driver.getWindowHandle();
        // Switch to new window opened
        for (String winHandle : Hook.driver.getWindowHandles()) {
            Hook.driver.switchTo().window(winHandle);
        }
    }
}
