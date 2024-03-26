package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.Hook;

import java.time.Duration;

public class HomePage {


    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }


    //Collection of web element
    @FindBy(how = How.XPATH, using = "//a[@data-toggle='dropdown'][normalize-space()='About Us']")
    private WebElement aboutus;

    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Accept All Cookies']")
    private WebElement acceptCookies;


    @FindBy(how = How.XPATH, using = "//h4[normalize-space()='Careers']")
    private WebElement career;

//method call for About us
    public void clickAboutus() throws InterruptedException {
        Thread.sleep(3000);
        aboutus.click();
    }

    public void clickAcceptCookies()  {
        WebDriverWait wait = new WebDriverWait(Hook.driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOf(acceptCookies));
        wait.until(ExpectedConditions.elementToBeClickable(acceptCookies));
        acceptCookies.click();
    }

    public void clickCareer() throws InterruptedException {
        Thread.sleep(3000);
        Actions action = new Actions(Hook.driver);
        action.moveToElement(career).click().perform();
    }

}
