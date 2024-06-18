package steps;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static utils.AppiumDriverFactory.driver;

public class stepsdef extends Base {

    @Given("The app is launched")
    public void the_app_is_launched() {
        mainMenuPage.verifyAppIsLaunched();

    }

    @And("I verify the heading")
    public void i_verify_the_heading() {
        mainMenuPage.verifyAppIsLaunched();
    }

    @When("I click app")
    public void i_click_app() {
        mainMenuPage.clickApp();
    }

    @AfterStep
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Failure Screenshot");
        }
    }

    @Then("The alarm text is displayed")
    public void theAlarmTextIsDisplayed() {
        appMenuPage.verifyAlarmIsDisplayed();
    }
}
