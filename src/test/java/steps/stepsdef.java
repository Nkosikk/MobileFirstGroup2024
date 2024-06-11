package steps;

import io.cucumber.java.en.*;

public class stepsdef extends Base{

    @Given("The app is launched")
    public void the_app_is_launched() {
        mainMenuPage.verifyAppIsLaunched();

    }
    @And("I verify the heading")
    public void i_verify_the_heading() {
    }
    @When("I click app")
    public void i_click_app() {

    }
    @Then("The alarm menu is displayed")
    public void the_alarm_menu_is_displayed() {

    }

}
