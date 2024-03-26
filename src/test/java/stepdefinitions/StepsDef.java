package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pageobject.CareerPage;
import pageobject.HomePage;
import utility.BrowserDriver;
import utility.Hook;


public class StepsDef {

    HomePage homePage;
    CareerPage careerPage;

    public StepsDef() {

        homePage = new HomePage(Hook.driver);
        careerPage = new CareerPage(Hook.driver);
    }

    @Given("the user navigate to the homepage link")
    public void the_user_navigate_to_the_homepage_link() {
        Hook.driver = BrowserDriver.getDriver();
        homePage.clickAcceptCookies();
        System.out.println("the clicked homepage");

    }
    @When("the user click on about us menu")
    public void the_user_click_on_about_us_menu() throws InterruptedException {
        homePage.clickAboutus();
        System.out.println("the clicked About us");

    }
    @When("the user click on careers")
    public void the_user_click_on_careers() throws InterruptedException {
        homePage.clickCareer();
        System.out.println("the click on career");

    }
    @When("the user clicks on search all jobs")
    public void the_user_clicks_on_search_all_jobs() throws InterruptedException {
        // Perform the click operation that opens new window
        careerPage.switchWindowHandle();
        careerPage.clicksearchJobs();
        System.out.println("the user click search all jobs ");
    }

    @Then("search for {string} in the search box")
    public void search_for_in_the_search_box(String result) throws InterruptedException {
        careerPage.SendkeysToSearchBox(result);
        System.out.println("Entered automated test");
        careerPage.clicksearchBtn();
        int count = Hook.driver.findElements(By.xpath("//a[@class='search-results-item-title-url']")).size();
        Assert.assertTrue(count>=1);
        //This line will ONLY be printed if the count is greater than or equal to 1
        System.out.println("Count is greater than or equal to 1. Count is: "+count);

    }
}
