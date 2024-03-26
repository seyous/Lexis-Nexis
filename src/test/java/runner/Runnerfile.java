package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(


        features = "src/test/resources/features/searchResult.feature",
        glue = {"stepdefinitions"}

)
public class Runnerfile  extends AbstractTestNGCucumberTests {

}
